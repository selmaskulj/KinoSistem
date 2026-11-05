package unze.ptf.kinosistem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unze.ptf.kinosistem.model.karta;

public interface KartaRepository extends JpaRepository<karta, Long> {
}
