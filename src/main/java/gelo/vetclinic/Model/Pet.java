package gelo.vetclinic.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String species;
    private String ownerName;
    private String birthDate;
    @OneToMany(mappedBy = "pet")
    private List<Visit> visit;

}
