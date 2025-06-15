package gelo.vetclinic.Repository;
import gelo.vetclinic.Model.Pet;
import gelo.vetclinic.Model.Visit;
import org.aspectj.apache.bcel.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PetRepository extends JpaRepository<Pet, Long> {
    Pet getPetById(long id);
}
