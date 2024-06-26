package lk.ijse.gdse.microservices.ticket_service;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableDiscoveryClient
@RequestMapping("/api/v1/tickets")
public class TicketController {

    @GetMapping()
    public List<TicketDTO> getTicketsDetails() {
        return null;
    }

    @PostMapping
    public void saveTicketDetails(TicketDTO ticketDTO) {

    }

    @PatchMapping
    public void updateTicketDetails(TicketDTO ticketDTO) {

    }
}
