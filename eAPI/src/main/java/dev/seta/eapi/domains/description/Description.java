package dev.seta.eapi.domains.description;

import dev.seta.eapi.domains.course.Course;
import dev.seta.eapi.domains.myModule.MyModule;
import dev.seta.eapi.domains.unit.Unit;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.AssertTrue;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class Description {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "descriptionId")
    private String id;

    @Version
    private int version;

    @Enumerated(
            EnumType.STRING
    )
    private Languages language;
    private String description;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "moduleId")
    private MyModule myModule;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "unitId")
    private Unit unit;


}
