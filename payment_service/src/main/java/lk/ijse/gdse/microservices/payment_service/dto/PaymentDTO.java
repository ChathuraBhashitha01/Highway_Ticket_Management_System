package lk.ijse.gdse.microservices.payment_service.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
    private int ticket_no;

    @NotBlank(message = "end location number can be not null")
    private String end_location;

    @NotBlank(message = "total amount number can be not null")
    private double total_amount;

    @NotBlank(message = "end date time can be not null")
    private String end_date_time;

    @NotBlank(message = "update status  can be not null")
    private String status;
}
