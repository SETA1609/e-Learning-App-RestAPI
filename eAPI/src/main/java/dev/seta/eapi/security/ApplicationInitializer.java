package dev.seta.eapi.security;

import dev.seta.eapi.domains.users.MyUserRepository;
import dev.seta.eapi.domains.users.Role;
import dev.seta.eapi.domains.users.admin.Admin;
import dev.seta.eapi.domains.users.student.Student;
import dev.seta.eapi.domains.users.teacher.Teacher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class ApplicationInitializer {
    @Bean
    public CommandLineRunner createDefaultAdminUser(MyUserRepository myUserRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            String defaultAdminUsername = "admin";

            if (myUserRepository.findByUsername(defaultAdminUsername).isEmpty()) {
                Admin admin = new Admin();
                admin.setUsername(defaultAdminUsername);
                admin.setEmail("admin@example.com");
                admin.setPassword(passwordEncoder.encode("admin"));
                admin.setRole(Role.ADMIN);

                myUserRepository.save(admin);
            }
        };
    }

    @Bean
    public CommandLineRunner createDefaultUser(MyUserRepository myUserRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            String defaultUserUsername = "user";

            if (myUserRepository.findByUsername(defaultUserUsername).isEmpty()) {
                Student user = new Student();
                user.setUsername(defaultUserUsername);
                user.setEmail("user@example.com");
                user.setPassword(passwordEncoder.encode("user"));
                user.setRole(Role.STUDENT);

                myUserRepository.save(user);
            }
        };
    }

    @Bean
    public CommandLineRunner createDefaultMod(MyUserRepository myUserRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            String defaultModUsername = "teacher";

            if (myUserRepository.findByUsername(defaultModUsername).isEmpty()) {
                Teacher mod = new Teacher();
                mod.setUsername(defaultModUsername);
                mod.setEmail("mod@example.com");
                mod.setPassword(passwordEncoder.encode("teacher"));
                mod.setRole(Role.TEACHER);

                myUserRepository.save(mod);
            }
        };
    }

}