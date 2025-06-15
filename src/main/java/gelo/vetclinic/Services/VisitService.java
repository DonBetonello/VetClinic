package gelo.vetclinic.Services;


import gelo.vetclinic.Model.Visit;
import gelo.vetclinic.Repository.VisitRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class VisitService {

    private static long counter = 0;
    private final VisitRepository visitRepository;

    public final List<Visit> visits = new ArrayList<>();

    public VisitService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    public Visit addVisit(Visit visit) {
        return visitRepository.save(visit);


    }
    public Visit getVisitById(long id) {
       return visitRepository.findById(id).orElse(null);

    }
}
