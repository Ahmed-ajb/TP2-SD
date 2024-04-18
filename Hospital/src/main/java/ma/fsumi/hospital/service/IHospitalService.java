package ma.fsumi.hospital.service;
import ma.fsumi.hospital.entities.Consultation;
 import ma.fsumi.hospital.entities.Medecin;
 import ma.fsumi.hospital.entities.Patient;
import ma.fsumi.hospital.entities.RendezVous;
public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
