package it.epicode.gestione.dispositivi.controllers;

import it.epicode.gestione.dispositivi.entities.Employee;
import it.epicode.gestione.dispositivi.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
@Validated
public class EmployeesController {

    @Autowired
    EmployeeService employeeService;

    //GET

    @GetMapping("/page")
    public Page<Employee> getAll(Pageable pageable) {
        return employeeService.findAll(pageable);
    }

    @GetMapping("/{Id}")
    public Optional<Employee> findById(@PathVariable Long employeeId) {
        return employeeService.findById(employeeId);
    }

    //POST

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @PostMapping("/{id}/uploadProfileImage")
    public ResponseEntity<Void> uploadProfileImage(@PathVariable Long id, @RequestParam("file") MultipartFile file) {
        return ResponseEntity.ok().build();
    }

    //PUT

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeEdit) {
        Optional<Employee> employeeOpt = employeeService.findById(id);
        if (employeeOpt.isPresent()) {
            Employee employee = employeeOpt.get();
            employee.setUsername(employeeEdit.getUsername());
            employee.setFirstname(employeeEdit.getFirstname());
            employee.setLastname(employeeEdit.getLastname());
            employee.setEmail(employeeEdit.getEmail());

            Employee updatedEmployee = employeeService.save(employee);
            return ResponseEntity.ok(updatedEmployee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //DELETE

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        if (employeeService.findById(id).isPresent()) {
            employeeService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/{Id}/avatar")
    public Employee uploadAvatar(@RequestParam("avatar") MultipartFile file, @PathVariable Long employeeId) {
        try {
            return employeeService.uploadAvatar(employeeId, file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
