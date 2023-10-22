package dev.seta.eapi.domain.users;

import dev.seta.eapi.domain.noten.Grade;
import dev.seta.eapi.domain.review.Review;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@DiscriminatorValue("STUDENT")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student extends MyUser{

    @OneToOne()
    @JoinColumn(name = "review_id")
    private Review review;

    @OneToMany(mappedBy = "student")
    private List<Grade> grades;


}
