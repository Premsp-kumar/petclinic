package springpetclinic.petclinic.services;


import springpetclinic.petclinic.Model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();


}
