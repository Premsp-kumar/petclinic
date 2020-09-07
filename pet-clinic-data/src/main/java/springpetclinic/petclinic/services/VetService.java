package springpetclinic.petclinic.services;

import springpetclinic.petclinic.Model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();

}
