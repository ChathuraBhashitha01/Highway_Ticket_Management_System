package lk.ijse.gdse.microservices.user_service.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String user_NIC;
    private String user_name;
    private String address;
    private String contact;
}
