package springpetclinic.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springpetclinic.petclinic.Model.Owner;
import springpetclinic.petclinic.Model.Vet;
import springpetclinic.petclinic.services.OwnerService;
import springpetclinic.petclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
    private  final OwnerService ownerService;
    private final VetService vetService;
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;

        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstname("Mani");
        owner1.setLastname("Rathnam");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstname("Prem");
        owner2.setLastname("Kumar");

        ownerService.save(owner2);

        System.out.println("........Loded Owners.....");
        Vet vet1=new Vet();
        vet1.setId(1L);
        vet1.setFirstname("Arun");
        vet1.setLastname("Kumar");
        vetService.save(vet1);

        Vet vet2=new Vet();
        vet1.setId(2L);
        vet2.setFirstname("Mari");
        vet2.setLastname("appan");
        vetService.save(vet2);
        System.out.println("........Loded Vets.....");

    }
}
