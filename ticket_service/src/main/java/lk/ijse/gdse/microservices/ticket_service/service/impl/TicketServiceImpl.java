package lk.ijse.gdse.microservices.ticket_service.service.impl;

import lk.ijse.gdse.microservices.ticket_service.dto.TicketDTO;
import lk.ijse.gdse.microservices.ticket_service.entity.Ticket;
import lk.ijse.gdse.microservices.ticket_service.repo.TicketRepo;
import lk.ijse.gdse.microservices.ticket_service.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepo ticketRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<TicketDTO> getTickets() {
        return ticketRepo.findAll().stream().map(ticket -> modelMapper.map(ticket, TicketDTO.class)).toList();
    }

    @Override
    public void addTicket(TicketDTO ticketDTO) {
        ticketRepo.save(modelMapper.map(ticketDTO,Ticket.class));
    }

    @Override
    public void updateTicket(TicketDTO ticketDTO) {
        ticketRepo.save(modelMapper.map(ticketDTO,Ticket.class));
    }
}
