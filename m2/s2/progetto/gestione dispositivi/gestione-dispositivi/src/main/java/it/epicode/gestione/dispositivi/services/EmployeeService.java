package it.epicode.gestione.dispositivi.services;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import it.epicode.gestione.dispositivi.entities.Employee;
import it.epicode.gestione.dispositivi.repositories.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeesRepository employeesRepository;
    Cloudinary cloudinaryUploader;

    public Page<Employee> findAll(Pageable pageable) {
        return employeesRepository.findAll(pageable);
    }

    public Optional<Employee> findById(Long id) {
        return employeesRepository.findById(id);
    }

    public Employee save(Employee employee) {
        return employeesRepository.save(employee);
    }

    public void deleteById(Long id) {
        employeesRepository.deleteById(id);
    }

    public Employee uploadAvatar(Long id, MultipartFile file) throws IOException {
        Optional<Employee> found = this.findById(id);
        if (!found.isPresent()) {
            throw new RuntimeException("Dipendente non trovato");
        }

        Employee employee = found.get();
        String avatarURL = (String) cloudinaryUploader.uploader().upload(file.getBytes(), ObjectUtils.emptyMap()).get("url");
        employee.setAvatar(avatarURL);
        return employeesRepository.save(employee);
    }


}
