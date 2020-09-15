package springpetclinic.petclinic.Repository;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.petclinic.Model.Pettype;

public interface PetTypeRepository extends CrudRepository<Pettype, Long> {
}
