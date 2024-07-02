package lk.ijse.gdse.microservices.payment_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
    private int ticket_no;
    private String start_location;
    private String end_location;
    private double total_amount;
    private String date;
    private String time;
    private String status;
}
