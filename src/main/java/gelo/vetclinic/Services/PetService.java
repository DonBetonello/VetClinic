package gelo.vetclinic.Services;

import gelo.vetclinic.Model.Pet;
import gelo.vetclinic.Repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {

    private static long counter = 0;
    @Autowired
    private final PetRepository petRepository;

    private List<Pet> pets = new ArrayList<Pet>();

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public Pet addPet(Pet pet) {
        return petRepository.save(pet);
    }
    public Pet getPetById(long id) {
        return petRepository.findById(id).orElse(null);
    }

    public List<Pet> getAllPets() {
        return pets;
    }
}
