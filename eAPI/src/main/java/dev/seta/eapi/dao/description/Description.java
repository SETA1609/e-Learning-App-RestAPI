package dev.seta.eapi.dao.description;

import dev.seta.eapi.dao.course.Course;
import dev.seta.eapi.dao.myModule.MyModule;
import dev.seta.eapi.dao.unit.Unit;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

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

    private String language;
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

}
