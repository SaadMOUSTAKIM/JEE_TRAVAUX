package ma.enset.moustakim_activite2_patient.repositories;

import ma.enset.moustakim_activite2_patient.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String name);
}
