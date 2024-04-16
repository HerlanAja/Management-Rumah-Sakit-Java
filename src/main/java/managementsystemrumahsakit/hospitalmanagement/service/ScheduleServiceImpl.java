package managementsystemrumahsakit.hospitalmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import managementsystemrumahsakit.hospitalmanagement.model.Schedule;
import managementsystemrumahsakit.hospitalmanagement.ropository.ScheduleRepository;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;

    @Override
    public List<Schedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }

    @Override
    public Schedule getScheduleById(Long id) {
        return scheduleRepository.findById(id).orElse(null);
    }

    @Override
    public Schedule createSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    @Override
    public Schedule updateSchedule(Long id, Schedule scheduleDetails) {
        Schedule schedule = scheduleRepository.findById(id).orElse(null);
        if (schedule != null) {
            schedule.setDoctorId(scheduleDetails.getDoctorId());
            schedule.setPatientId(scheduleDetails.getPatientId());
            schedule.setTime(scheduleDetails.getTime());
            return scheduleRepository.save(schedule);
        }
        return null;
    }

    @Override
    public void deleteSchedule(Long id) {
        scheduleRepository.deleteById(id);
    }
}
