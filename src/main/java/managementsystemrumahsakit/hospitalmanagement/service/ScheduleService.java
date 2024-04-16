package managementsystemrumahsakit.hospitalmanagement.service;

import java.util.List;
import managementsystemrumahsakit.hospitalmanagement.model.Schedule;

public interface ScheduleService {
    List<Schedule> getAllSchedules();
    Schedule getScheduleById(Long id);
    Schedule createSchedule(Schedule schedule);
    Schedule updateSchedule(Long id, Schedule scheduleDetails);
    void deleteSchedule(Long id);
}
