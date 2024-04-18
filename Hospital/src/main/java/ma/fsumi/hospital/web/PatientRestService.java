package ma.fsumi.hospital.web;

import ma.fsumi.hospital.entities.Patient;
import ma.fsumi.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientRestService {
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/patients")
    public List<Patient> patients(){
        return patientRepository.findAll();
    }
    @GetMapping("/patient/{id}")
    public Patient getPatientById(@PathVariable Long id){
        return patientRepository.findById(id).orElse(null);
    }
}
