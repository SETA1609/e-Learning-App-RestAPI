package dev.seta.eapi.domains.review;

import dev.seta.eapi.domains.users.student.Student;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Version
    private int version;

    private String text;

    private int rating;


    @OneToOne(mappedBy = "review")
    @JoinColumn(name = "student_id")
    private Student student;

}
