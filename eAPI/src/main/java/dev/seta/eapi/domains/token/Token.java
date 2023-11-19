package dev.seta.eapi.domains.token;

import dev.seta.eapi.domains.users.MyUser;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Token {

    @Id
    @GeneratedValue
    @Column(name = "tokenId")
    private Integer id;

    @Version
    private int version;

    @Column(unique = true)
    private String token;

    @Enumerated(EnumType.STRING)
    private TokenType tokenType = TokenType.BEARER;

    private boolean revoked;

    private boolean expired;

    @ManyToOne
    @JoinColumn(name = "myUserId")
    private MyUser myUser;

}
