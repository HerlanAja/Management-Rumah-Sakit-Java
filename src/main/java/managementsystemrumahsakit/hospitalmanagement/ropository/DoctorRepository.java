package managementsystemrumahsakit.hospitalmanagement.ropository;


import managementsystemrumahsakit.hospitalmanagement.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
