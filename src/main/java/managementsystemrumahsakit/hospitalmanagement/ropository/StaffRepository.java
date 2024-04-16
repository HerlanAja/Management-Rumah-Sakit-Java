package managementsystemrumahsakit.hospitalmanagement.ropository;

import org.springframework.data.jpa.repository.JpaRepository;
import managementsystemrumahsakit.hospitalmanagement.model.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long> {

    default Staff getStaffById(Long id) {
        return findById(id).orElse(null);
    }

    default void deleteStaff(Long id) {
        deleteById(id);
    }
} 

