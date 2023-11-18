package dev.seta.eapi.domains.users.student;

import dev.seta.eapi.domains.grade.Grade;
import dev.seta.eapi.domains.msg.Msg;
import dev.seta.eapi.domains.review.Review;
import dev.seta.eapi.domains.users.MyUser;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@DiscriminatorValue("STUDENT")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Student extends MyUser {

    @OneToOne()
    @JoinColumn(name = "review_id")
    private Review review;

    @OneToMany(mappedBy = "student")
    private List<Grade> grades;


/*
TODO here should be the payment method saved and a relationship to a new entity named certifications
 */
}
