package it.epicode.gestione.dispositivi.services;

import it.epicode.gestione.dispositivi.entities.Availability;
import it.epicode.gestione.dispositivi.entities.Device;
import it.epicode.gestione.dispositivi.entities.Employee;
import it.epicode.gestione.dispositivi.repositories.DevicesRepository;
import it.epicode.gestione.dispositivi.repositories.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceService {
    @Autowired
    DevicesRepository devicesRepository;
    EmployeesRepository employeesRepository;

    public List<Device> findAll() {
        return devicesRepository.findAll();
    }

    public Optional<Device> findById(Long id) {
        return devicesRepository.findById(id);
    }

    public Device save(Device device) {
        return devicesRepository.save(device);
    }

    public void deleteById(Long id) {
        devicesRepository.deleteById(id);
    }

    public Device assignDeviceToEmployee(Long deviceId, Long employeeId) {
        Optional<Device> deviceOpt = devicesRepository.findById(deviceId);
        Optional<Employee> employeeOpt = employeesRepository.findById(employeeId);

        if (deviceOpt.isPresent() && employeeOpt.isPresent()) {
            Device device = deviceOpt.get();
            Employee employee = employeeOpt.get();

            device.setEmployee(employee);
            device.setAvailability(Availability.ASSIGNED);

            return devicesRepository.save(device);
        }
        return null;
    }
}
