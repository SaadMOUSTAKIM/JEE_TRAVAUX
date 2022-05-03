package ma.enset.moustakim_activite2_patient.service;

import ma.enset.moustakim_activite2_patient.entities.Consultation;
import ma.enset.moustakim_activite2_patient.entities.Medecin;
import ma.enset.moustakim_activite2_patient.entities.Patient;
import ma.enset.moustakim_activite2_patient.entities.RendezVous;

public interface iHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRendezVous(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
