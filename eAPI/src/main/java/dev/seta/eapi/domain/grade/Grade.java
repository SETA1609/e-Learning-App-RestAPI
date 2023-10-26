package dev.seta.eapi.domain.grade;

import dev.seta.eapi.domain.modul.ModulE;
import dev.seta.eapi.domain.users.Student;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class Grade {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private double score;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @OneToOne
    @JoinColumn(name = "module_id")
    private ModulE module;
}
