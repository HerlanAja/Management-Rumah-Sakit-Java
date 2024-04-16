package managementsystemrumahsakit.hospitalmanagement.ropository;

import org.springframework.data.jpa.repository.JpaRepository;
import managementsystemrumahsakit.hospitalmanagement.model.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {  
} 