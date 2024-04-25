package managementsystemrumahsakit.hospitalmanagement.ropository;

import org.springframework.data.jpa.repository.JpaRepository;
import managementsystemrumahsakit.hospitalmanagement.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
    
}
