package managementsystemrumahsakit.hospitalmanagement.service;

import java.util.List;
import managementsystemrumahsakit.hospitalmanagement.model.Doctor;

public interface DoctorService {

    List<Doctor> getAllDoctors();
    Doctor getDoctorById(Long id);
    Doctor createDoctor(Doctor doctor);
    Doctor updateDoctor(Long id, Doctor doctorDetails);
    void deleteDoctor(Long id);    
} 
