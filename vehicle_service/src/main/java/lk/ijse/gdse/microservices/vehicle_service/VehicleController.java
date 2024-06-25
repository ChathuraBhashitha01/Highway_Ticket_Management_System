package lk.ijse.gdse.microservices.vehicle_service;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableDiscoveryClient
@RequestMapping("/api/v1/vehicles")
public class VehicleController {

    @GetMapping("/getVehicles")
    public VehicleDTO getVehicleDetails() {
        return null;
    }

    @PostMapping("/registerVehicle")
    public void   registerVehicle(@RequestBody VehicleDTO vehicleDTO) {

    }

    @PostMapping("/updateVehicle")
    public void   updateVehicle(@RequestBody VehicleDTO vehicleDTO) {

    }
}
