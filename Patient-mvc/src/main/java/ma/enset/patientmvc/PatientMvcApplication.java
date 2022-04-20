package ma.enset.patientmvc;

import ma.enset.patientmvc.entities.Patient;
import ma.enset.patientmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientMvcApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Achraf",new Date(),false,30));
            patientRepository.save(new Patient(null,"Meryem",new Date(),true,8));
            patientRepository.save(new Patient(null,"Alaa",new Date(),true,12));
            patientRepository.save(new Patient(null,"Fatima",new Date(),false,45));

            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom()) ;
            });
        };
    }
}
