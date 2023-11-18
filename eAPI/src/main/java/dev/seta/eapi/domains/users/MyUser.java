package dev.seta.eapi.domains.users;

import dev.seta.eapi.domains.token.Token;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Base64;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("myUser")
public class MyUser implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(unique = true)
    private String username;

    private String firstname;

    private String lastname;

    @Version
    private int version;

    private String email;

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] image;


    private String password;


    @Enumerated(
            EnumType.STRING
    )
    private Role role;

    @OneToMany(mappedBy = "myUser")
    private List<Token> tokens;

    public MyUser(String username){
        this.username = username;

    }


    public String getImage(){
        return image != null ? Base64.getEncoder().encodeToString(image) : "";
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of (new SimpleGrantedAuthority(role.name ()));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyUser myUser)) return false;

        return getId().equals(myUser.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
