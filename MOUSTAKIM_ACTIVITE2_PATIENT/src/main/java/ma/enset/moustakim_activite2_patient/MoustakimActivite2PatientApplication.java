package ma.enset.moustakim_activite2_patient;

import ma.enset.moustakim_activite2_patient.entities.*;
import ma.enset.moustakim_activite2_patient.repositories.ConsultationRepository;
import ma.enset.moustakim_activite2_patient.repositories.MedecinRepository;
import ma.enset.moustakim_activite2_patient.repositories.PatientRepository;
import ma.enset.moustakim_activite2_patient.repositories.RendezVousRepository;
import ma.enset.moustakim_activite2_patient.service.iHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MoustakimActivite2PatientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoustakimActivite2PatientApplication.class, args);
    }
//
//    @Bean
//    CommandLineRunner start(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository){
//        return args -> {
//            patientRepository.save(new Patient(null,"MOUTTA",new Date(),false,null));
//            patientRepository.save(new Patient(null,"NASSEUR",new Date(),true,null));
//            patientRepository.save(new Patient(null,"SAHLE",new Date(),false,null));
//            patientRepository.save(new Patient(null,"MOUSTAKIM",new Date(),true,null));
//            medecinRepository.save(new Medecin(null,"ALAMI","ALAMI@gmail.com","Dentiste",null));
//            medecinRepository.save(new Medecin(null,"BENSOUDA","BENSOUDA@gmail.com","Psychiatre",null));
//            medecinRepository.save(new Medecin(null,"AZIZ","AZIZ@gmail.com","Coeur",null));
//            medecinRepository.save(new Medecin(null,"MINA","MINA@gmail.com","Diabete",null));
//
//            Patient p = patientRepository.findById(1L).orElse(null);
//            Patient p1 = patientRepository.findByNom("MOUTTA");
//
//            Medecin m= medecinRepository.findByNom("ALAMI");
//
//            rendezVousRepository.save(new RendezVous(null,new Date(), StatusRDV.PENDING,p,m,null));
//
//            RendezVous rdv =rendezVousRepository.findById(1L).orElse(null);
//            consultationRepository.save(new Consultation(null,new Date(),"Bon etat",rdv));
//
//        };
//    }

    @Bean
    CommandLineRunner start(iHospitalService iHospitalService,
                            PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository){
        return args -> {
            iHospitalService.savePatient(new Patient(null,"MOUTTA",new Date(),false,null));
            iHospitalService.savePatient(new Patient(null,"NASSEUR",new Date(),true,null));
            iHospitalService.savePatient(new Patient(null,"SAHLE",new Date(),false,null));
            iHospitalService.savePatient(new Patient(null,"MOUSTAKIM",new Date(),true,null));
            iHospitalService.saveMedecin(new Medecin(null,"ALAMI","ALAMI@gmail.com","Dentiste",null));
            iHospitalService.saveMedecin(new Medecin(null,"BENSOUDA","BENSOUDA@gmail.com","Psychiatre",null));
            iHospitalService.saveMedecin(new Medecin(null,"AZIZ","AZIZ@gmail.com","Coeur",null));
            iHospitalService.saveMedecin(new Medecin(null,"MINA","MINA@gmail.com","Diabete",null));

            Patient p = patientRepository.findById(1L).orElse(null);
            Patient p1 = patientRepository.findByNom("MOUTTA");

            Medecin m= medecinRepository.findByNom("ALAMI");

            iHospitalService.saveRendezVous(new RendezVous(null,new Date(), StatusRDV.PENDING,p,m,null));

            RendezVous rdv =rendezVousRepository.findAll().get(0);
            iHospitalService.saveConsultation(new Consultation(null,new Date(),"bon etat",rdv));

        };
    }


}
