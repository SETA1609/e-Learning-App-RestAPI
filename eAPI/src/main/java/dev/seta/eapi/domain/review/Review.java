package dev.seta.eapi.domain.review;

import dev.seta.eapi.domain.users.Student;
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

    private String text;

    private int rating;


    @OneToOne(mappedBy = "review")
    private Student student;

}
