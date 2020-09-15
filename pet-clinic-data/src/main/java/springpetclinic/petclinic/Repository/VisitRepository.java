package springpetclinic.petclinic.Repository;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.petclinic.Model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
