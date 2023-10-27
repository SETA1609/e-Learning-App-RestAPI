package dev.seta.eapi.dtos;

import dev.seta.eapi.domain.users.Student;
import dev.seta.eapi.domain.users.Teacher;

import java.io.Serializable;

/**
 * DTO for {@link dev.seta.eapi.domain.msg.Msg}
 */
public record NewMsgRequest(
        String Content,
        Student student,
        Teacher teacher
) implements Serializable {
}