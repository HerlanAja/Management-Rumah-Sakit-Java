package managementsystemrumahsakit.hospitalmanagement.ropository;

import managementsystemrumahsakit.hospitalmanagement.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}

