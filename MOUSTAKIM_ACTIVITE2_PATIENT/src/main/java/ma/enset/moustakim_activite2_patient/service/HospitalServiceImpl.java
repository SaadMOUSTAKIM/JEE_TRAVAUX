package ma.enset.moustakim_activite2_patient.service;

import ma.enset.moustakim_activite2_patient.entities.Consultation;
import ma.enset.moustakim_activite2_patient.entities.Medecin;
import ma.enset.moustakim_activite2_patient.entities.Patient;
import ma.enset.moustakim_activite2_patient.entities.RendezVous;
import ma.enset.moustakim_activite2_patient.repositories.ConsultationRepository;
import ma.enset.moustakim_activite2_patient.repositories.MedecinRepository;
import ma.enset.moustakim_activite2_patient.repositories.PatientRepository;
import ma.enset.moustakim_activite2_patient.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
@Transactional
public class HospitalServiceImpl implements iHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
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
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
