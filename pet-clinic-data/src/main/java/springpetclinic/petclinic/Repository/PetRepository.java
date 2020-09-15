package springpetclinic.petclinic.Repository;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.petclinic.Model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
