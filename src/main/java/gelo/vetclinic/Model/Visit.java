package gelo.vetclinic.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Visit {
    @Id
    @GeneratedValue
    public Long id;


    private String visitDate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_Id")
    private Pet pet;
}
