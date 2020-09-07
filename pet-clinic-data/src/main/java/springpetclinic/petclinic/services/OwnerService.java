package springpetclinic.petclinic.services;

import springpetclinic.petclinic.Model.Owner;



public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastname(String lastname);


}
