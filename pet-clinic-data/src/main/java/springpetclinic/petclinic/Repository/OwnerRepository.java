package springpetclinic.petclinic.Repository;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.petclinic.Model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
