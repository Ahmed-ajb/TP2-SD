package ma.fsumi.hospital.service;

import ma.fsumi.hospital.entities.Consultation;
import ma.fsumi.hospital.entities.Medecin;
import ma.fsumi.hospital.entities.Patient;
import ma.fsumi.hospital.entities.RendezVous;
import ma.fsumi.hospital.repository.ConsultationRepository;
import ma.fsumi.hospital.repository.MedecinRepository;
import ma.fsumi.hospital.repository.PatientRepository;
import ma.fsumi.hospital.repository.RendezVousRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class IHospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public IHospitalServiceImpl(PatientRepository p, MedecinRepository m, RendezVousRepository r, ConsultationRepository c) {
        this.patientRepository = p;
        this.medecinRepository = m;
        this.rendezVousRepository = r;
        this.consultationRepository = c;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
