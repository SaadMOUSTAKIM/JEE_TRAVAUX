package ma.enset.moustakim_activite2_patient.repositories;

import ma.enset.moustakim_activite2_patient.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RendezVousRepository extends JpaRepository<RendezVous,String> {

}
