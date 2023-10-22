package dev.seta.eapi.domain.users;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("ADMIN")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Admin extends MyUser{



}
