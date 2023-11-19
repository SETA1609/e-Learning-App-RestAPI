package dev.seta.eapi.domains.unit;

import dev.seta.eapi.domains.description.Description;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "unitId")
    private String id;

    @Version
    private int version;

    private String name;


    @OneToMany(mappedBy = "unit")
    private List<Description> description;
}
