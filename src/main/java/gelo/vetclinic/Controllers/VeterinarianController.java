package gelo.vetclinic.Controllers;


import gelo.vetclinic.Model.Veterinarian;
import gelo.vetclinic.Services.PetService;
import gelo.vetclinic.Services.VeterenerianService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VeterinarianController {
    private final VeterenerianService veterenerianService;
    @Autowired
    public VeterinarianController(VeterenerianService veterenerianService) {
        this.veterenerianService = veterenerianService;
    }
    @GetMapping("/vets")
    public List<Veterinarian> getAllVeterinarian() {
        return veterenerianService.getVets();
    }
    @GetMapping("/vetId")
    public Veterinarian getVeterinarianById(@RequestParam(value = "id") long id) {
        return veterenerianService.getVeterinarianById(id);

    }
}
