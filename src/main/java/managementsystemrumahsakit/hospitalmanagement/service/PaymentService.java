package managementsystemrumahsakit.hospitalmanagement.service;

import managementsystemrumahsakit.hospitalmanagement.model.Payment;
import java.util.List;

public interface PaymentService {
    List<Payment> getAllPayments();
    Payment getPaymentById(Long id);
    Payment createPayment(Payment payment);
    Payment updatePayment(Long id, Payment paymentDetails);
    void deletePayment(Long id);
}

