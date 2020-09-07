package springpetclinic.petclinic.services;

import springpetclinic.petclinic.Model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastname(String lastname);
   Owner findById(Long id);
   Owner save(Owner owner);
   Set<Owner> findAll();

}
