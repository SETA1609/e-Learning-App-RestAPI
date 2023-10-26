package dev.seta.eapi.domain.users;

import dev.seta.eapi.domain.grade.Grade;
import dev.seta.eapi.domain.msg.Msg;
import dev.seta.eapi.domain.review.Review;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@DiscriminatorValue("STUDENT")
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


    @OneToMany(mappedBy = "student")
    private List<Msg> sentMessages;
/*
TODO here should be the payment method saved and a relationship to a new entity named certifications
 */
}
