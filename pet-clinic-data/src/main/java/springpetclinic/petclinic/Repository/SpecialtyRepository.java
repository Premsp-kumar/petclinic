package springpetclinic.petclinic.Repository;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.petclinic.Model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
