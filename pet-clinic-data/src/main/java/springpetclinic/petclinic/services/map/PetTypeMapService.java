package springpetclinic.petclinic.services.map;

import org.springframework.stereotype.Service;
import springpetclinic.petclinic.Model.Pettype;
import springpetclinic.petclinic.services.PetTypeService;

import java.util.Set;
@Service
public class PetTypeMapService extends AbstractMapService<Pettype, Long>implements PetTypeService {
    @Override
    public Set<Pettype> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pettype object) {
        super.delete(object);
    }

    @Override
    public Pettype save(Pettype object) {
        return super.save(object);
    }

    @Override
    public Pettype findById(Long id) {
        return super.findById(id);
    }
}
