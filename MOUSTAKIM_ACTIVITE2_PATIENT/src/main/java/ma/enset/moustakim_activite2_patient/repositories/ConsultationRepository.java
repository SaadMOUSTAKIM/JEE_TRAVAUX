package ma.enset.moustakim_activite2_patient.repositories;

import ma.enset.moustakim_activite2_patient.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
