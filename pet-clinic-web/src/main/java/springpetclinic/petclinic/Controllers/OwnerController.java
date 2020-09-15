package springpetclinic.petclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springpetclinic.petclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({ "","/","/index","/index.html"})
    public String listowner(Model model)
    {
        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }
    @RequestMapping("/find")
    public String findowners()
    {
        return"notimplemented";
    }
}
