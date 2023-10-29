package dev.seta.eapi.dtos;

import dev.seta.eapi.dao.users.student.Student;
import dev.seta.eapi.dao.users.teacher.Teacher;
import lombok.NonNull;

import java.io.Serializable;

/**
 * DTO for {@link dev.seta.eapi.dao.msg.Msg}
 */
public record NewMsgRequest(
        @NonNull
        String Content,
        @NonNull
        Student student,
        @NonNull
        Teacher teacher
) implements Serializable {
}