package gelo.vetclinic.Controllers;

import gelo.vetclinic.Model.Pet;
import java.util.List;

import gelo.vetclinic.Services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
public class PetController {

    private final PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @PostMapping("/pet")
    public Pet addPet(@RequestBody Pet pet) {
        return petService.addPet(pet);
    }
    @GetMapping("/petsId")
    public Pet getPetById(@RequestParam(value = "id") long Id) {
        return petService.getPetById(Id);
    }
    @GetMapping("/pets")
    public List<Pet> getAllPets() {
        return petService.getAllPets();
    }

}
