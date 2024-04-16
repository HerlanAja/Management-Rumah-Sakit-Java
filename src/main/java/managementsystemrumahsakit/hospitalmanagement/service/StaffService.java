package managementsystemrumahsakit.hospitalmanagement.service;

import java.util.List;
import managementsystemrumahsakit.hospitalmanagement.model.Staff;

public interface StaffService {
    List<Staff> getAllStaff();
    Staff getStaffById(long id);
    Staff createStaff(Staff staff);
    Staff updateStaff(long id, Staff staffDetails);
    void deleteStaff(long id);
}
