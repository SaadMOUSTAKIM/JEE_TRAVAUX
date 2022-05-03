package ma.enset.moustakim_activite2_patient.repositories;

import ma.enset.moustakim_activite2_patient.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByNom(String name);
}
