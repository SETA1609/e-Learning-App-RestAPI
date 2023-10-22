package dev.seta.eapi.domain.kurz;

import dev.seta.eapi.domain.users.Lehrer;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Kurz {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "lehrer_id")
    private Lehrer lehrer;


}
