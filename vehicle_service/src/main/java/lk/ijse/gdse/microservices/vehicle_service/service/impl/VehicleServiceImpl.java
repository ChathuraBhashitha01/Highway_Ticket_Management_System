package lk.ijse.gdse.microservices.vehicle_service.service.impl;

import lk.ijse.gdse.microservices.vehicle_service.dto.VehicleDTO;
import lk.ijse.gdse.microservices.vehicle_service.entity.Vehicle;
import lk.ijse.gdse.microservices.vehicle_service.repo.VehicleRepo;
import lk.ijse.gdse.microservices.vehicle_service.service.VehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<VehicleDTO> getAllVehicles() {
        return vehicleRepo.findAll().stream().map(vehicle -> modelMapper.map(vehicle,VehicleDTO.class)).toList();
    }

    @Override
    public void registerVehicle(VehicleDTO vehicleDTO) {
        Vehicle vehicle = modelMapper.map(vehicleDTO,Vehicle.class);
        vehicleRepo.save(vehicle);
    }

    @Override
    public void updateVehicle(VehicleDTO vehicleDTO) {
        vehicleRepo.save(modelMapper.map(vehicleDTO,Vehicle.class));
    }
}
