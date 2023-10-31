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
    private String id;
    @Enumerated(
            EnumType.STRING
    )
    private Languages language;
    private String description;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "module_id")
    private MyModule myModule;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;

    @AssertTrue(message = "At least one object (Course, MyModule, Unit) must be provided.")
    private boolean isAtLeastOneObjectNotNull() {
        return course != null || myModule != null || unit != null;
    }

}
