package unze.ptf.kinosistem.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unze.ptf.kinosistem.model.Projekcija;

@Repository

public interface ProjekcijaRepository extends JpaRepository<Projekcija, Long>{
}
