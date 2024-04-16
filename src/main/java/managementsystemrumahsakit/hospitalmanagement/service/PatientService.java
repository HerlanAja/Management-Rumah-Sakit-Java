package managementsystemrumahsakit.hospitalmanagement.service;

import java.util.List;
import managementsystemrumahsakit.hospitalmanagement.model.Patient;

public interface PatientService {
    List<Patient> getAllPatients();
    Patient getPatientById(Long id);
    Patient createPatient(Patient patient);
    Patient updatePatient(Long id, Patient patientDetails);
    void deletePatient(Long id);
}
