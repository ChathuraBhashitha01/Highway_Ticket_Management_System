package lk.ijse.gdse.microservices.ticket_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {

    private int ticket_no;
    private String vehicle_registration_number;
    private String start_location;
    private String end_location;
    private int ticket_price;
}
