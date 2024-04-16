package managementsystemrumahsakit.hospitalmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import managementsystemrumahsakit.hospitalmanagement.model.Staff;
import managementsystemrumahsakit.hospitalmanagement.ropository.StaffRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    public StaffRepository staffRepository;

    @Override
    public List<Staff> getAllStaff() {
        return staffRepository.findAll();
    }

    @Override
    public Staff createStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public Staff getStaffById(long id) {
        Optional<Staff> staffOptional = staffRepository.findById(id);
        return staffOptional.orElse(null);
    }

    @Override
    public Staff updateStaff(long id, Staff staffDetails) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateStaff'");
    }

    @Override
    public void deleteStaff(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteStaff'");
    }
}
