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
@Table
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "reviewId")
    private String id;

    @Version
    private int version;

    private String text;

    private int rating;


    @OneToOne(mappedBy = "review")
    @JoinColumn(name = "myUserId")
    private Student student;

}
