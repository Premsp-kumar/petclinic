package springpetclinic.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springpetclinic.petclinic.Model.Owner;
import springpetclinic.petclinic.Model.Pet;
import springpetclinic.petclinic.Model.Pettype;
import springpetclinic.petclinic.Model.Vet;
import springpetclinic.petclinic.services.OwnerService;
import springpetclinic.petclinic.services.PetTypeService;
import springpetclinic.petclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private  final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        Pettype dog= new Pettype();
        dog.setName("Dog");
        Pettype saveDogPetType=petTypeService.save(dog);

        Pettype cat= new Pettype();
        cat.setName("Cat");
        Pettype saveCatPetType=petTypeService.save(cat);


        Owner owner1 = new Owner();

        owner1.setFirstname("Mani");
        owner1.setLastname("Rathnam");
        owner1.setCity("Hydrabad");
        owner1.setAddress("12, south");
        owner1.setTelephone("9809424122");
        ownerService.save(owner1);

        Pet mikesPet = new Pet();
        mikesPet.setPettype(saveDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("salon");
        owner1.getPets().add(mikesPet);
        Owner owner2 = new Owner();

        owner2.setFirstname("Prem");
        owner2.setLastname("Kumar");
        owner2.setCity("Theni");
        owner2.setAddress("13, Hanumanthanpatty");
        owner2.setTelephone("77095434122");

        Pet fionascat =new Pet();
        fionascat.setName(" just Cat");
        fionascat.setOwner(owner2);
        fionascat.setBirthDate(LocalDate.now());
        fionascat.setPettype((saveCatPetType));
        owner2.getPets().add(fionascat);
        ownerService.save(owner2);

        System.out.println("........Loded Owners.....");
        Vet vet1=new Vet();

        vet1.setFirstname("Arun");
        vet1.setLastname("Kumar");
        vetService.save(vet1);

        Vet vet2=new Vet();

        vet2.setFirstname("Mari");
        vet2.setLastname("appan");
        vetService.save(vet2);
        System.out.println("........Loded Vets.....");

    }
}
