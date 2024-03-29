package dev.seta.eapi.domains.grade;

import dev.seta.eapi.domains.myModule.MyModule;
import dev.seta.eapi.domains.users.student.Student;
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
    @Column(name = "gradeId")
    private String id;

    @Version
    private int version;

    private double score;

    @ManyToOne
    @JoinColumn(name = "myUserId")
    private Student student;

   @OneToOne(mappedBy = "grade")
    private MyModule module;
}
