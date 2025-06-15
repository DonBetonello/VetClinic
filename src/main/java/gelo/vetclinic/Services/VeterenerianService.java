package gelo.vetclinic.Services;

import gelo.vetclinic.Model.Veterinarian;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class VeterenerianService {
    private List<Veterinarian> vets = new ArrayList<>();




    public List<Veterinarian> getVets() {
        return vets;
    }

    public Veterinarian getVeterinarianById(long id) {
        return vets.stream()
                .filter(v -> v.getId() == id)
                .findFirst()
                .orElse(null); // Уникаємо помилки, якщо ID не знайдено
    }
}
