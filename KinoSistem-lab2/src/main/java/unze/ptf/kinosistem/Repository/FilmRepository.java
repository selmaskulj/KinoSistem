package unze.ptf.kinosistem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unze.ptf.kinosistem.model.film;

@Repository
public interface FilmRepository extends JpaRepository<film, Long>{
}
