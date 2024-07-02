package lk.ijse.gdse.microservices.ticket_service.controller;

import lk.ijse.gdse.microservices.ticket_service.dto.PaymentDTO;
import lk.ijse.gdse.microservices.ticket_service.dto.TicketDTO;
import lk.ijse.gdse.microservices.ticket_service.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableDiscoveryClient
@RequestMapping("/api/v1/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping
    public List<TicketDTO> getTicketsDetails() {
        return ticketService.getTickets();
    }

    @PostMapping
    public void saveTicketDetails(@RequestBody TicketDTO ticketDTO) {
        ticketService.addTicket(ticketDTO);
    }

    @PutMapping("/updateStatus")
    public void updateTicketDetails(@RequestBody PaymentDTO paymentDTO) {
        System.out.println(paymentDTO);
        ticketService.updateTicket(paymentDTO);
    }
}
