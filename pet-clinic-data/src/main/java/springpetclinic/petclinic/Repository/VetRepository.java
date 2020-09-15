package springpetclinic.petclinic.Repository;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.petclinic.Model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
