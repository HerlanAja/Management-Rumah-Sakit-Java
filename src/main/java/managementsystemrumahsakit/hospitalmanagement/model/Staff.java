package managementsystemrumahsakit.hospitalmanagement.model;

import java.util.Optional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import managementsystemrumahsakit.hospitalmanagement.service.StaffServiceImpl;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String role;
    private String phone;

    //Constructor setter and getter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Staff updateStaff(Long id, StaffServiceImpl staffServiceImpl) {
        Optional<Staff> staffOptional = staffServiceImpl.staffRepository.findById(id);
        if (staffOptional.isPresent()) {
            Staff staff = staffOptional.get();
            staff.setName(getName());
            staff.setRole(getRole());
            staff.setPhone(getPhone());
            return staffServiceImpl.staffRepository.save(staff);
        }
        return null;
    }
}
