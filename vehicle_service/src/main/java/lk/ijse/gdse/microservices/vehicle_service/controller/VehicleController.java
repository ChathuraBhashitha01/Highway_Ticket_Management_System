package lk.ijse.gdse.microservices.vehicle_service.controller;

import lk.ijse.gdse.microservices.vehicle_service.dto.VehicleDTO;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableDiscoveryClient
@RequestMapping("/api/v1/vehicles")
public class VehicleController {

    @GetMapping(value = "/getVehicles",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<VehicleDTO> getVehicleDetails() {
        return null;
    }

    @PostMapping(value = "/registerVehicle",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void   registerVehicle(@RequestBody VehicleDTO vehicleDTO) {

    }

    @PatchMapping(value = "/updateVehicle",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void   updateVehicle(@RequestBody VehicleDTO vehicleDTO) {

    }
}
