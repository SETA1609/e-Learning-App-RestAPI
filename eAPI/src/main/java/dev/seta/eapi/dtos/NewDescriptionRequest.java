package dev.seta.eapi.dtos;

import dev.seta.eapi.domains.course.Course;
import dev.seta.eapi.domains.myModule.MyModule;
import dev.seta.eapi.domains.unit.Unit;
import javax.validation.constraints.AssertTrue;

import java.io.Serializable;

/**
 * DTO for {@link dev.seta.eapi.domains.description.Description}
 */
public record NewDescriptionRequest(
        String language,
        String description,
        Course course,
        MyModule myModule,
        Unit unit
) implements Serializable {
    @AssertTrue(message = "Exactly one object (Course, MyModule, or Unit) should be provided.")
    public boolean isOneObjectNotNull() {
        return (course != null ? 1 : 0) + (myModule != null ? 1 : 0) + (unit != null ? 1 : 0) == 1;
    }
}