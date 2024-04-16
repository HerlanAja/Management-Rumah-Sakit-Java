package managementsystemrumahsakit.hospitalmanagement.ropository;

import org.springframework.data.jpa.repository.JpaRepository;
import managementsystemrumahsakit.hospitalmanagement.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}

