package lk.ijse.gdse.microservices.ticket_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {

    private String vehicle_registration_number;
    private String start_location;
    private Date date;
    private String time;
}
