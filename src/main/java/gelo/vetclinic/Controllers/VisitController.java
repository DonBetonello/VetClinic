package gelo.vetclinic.Controllers;

import gelo.vetclinic.Model.Pet;
import gelo.vetclinic.Model.Visit;
import gelo.vetclinic.Services.VisitService;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VisitController {
    private final VisitService visitService;
    @Autowired
    public VisitController(VisitService visitService) {
        this.visitService = visitService;
    }
    @PostMapping("/visits")
    public Visit addVisit(@RequestBody Visit visit) {
        return visitService.addVisit(visit);
    }
    @GetMapping("/visits/by-pet/id")
    public Visit getVisitById(@RequestParam(value = "id") long id) {
        return visitService.getVisitById(id);

    }
}
