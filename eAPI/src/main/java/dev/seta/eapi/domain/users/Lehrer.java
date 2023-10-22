package dev.seta.eapi.domain.users;

import dev.seta.eapi.domain.kurz.Kurz;
import dev.seta.eapi.domain.modul.Modul;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@DiscriminatorValue("LEHRER")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Lehrer extends MyUser{

    @OneToMany(mappedBy = "lehrer")
    private List<Kurz> kurzen;

    @ManyToMany
    private Set<Modul> modulen;



}
