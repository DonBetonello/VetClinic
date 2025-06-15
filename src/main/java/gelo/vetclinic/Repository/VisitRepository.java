package gelo.vetclinic.Repository;

import gelo.vetclinic.Model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, Long> {
    Visit getVisitById(long id);
}
