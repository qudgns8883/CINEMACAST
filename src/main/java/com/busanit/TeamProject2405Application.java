package com.busanit;

import com.busanit.constant.Role;
import com.busanit.entity.Member;
import com.busanit.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableScheduling
@SpringBootApplication
@EnableAsync
public class TeamProject2405Application implements CommandLineRunner {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private MemberService memberService;

    public static void main(String[] args) {
        SpringApplication.run(TeamProject2405Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String[] emails = {"1@admin.com", "2@admin.com", "3@admin.com", "4@admin.com"};

        for (String email : emails) {

            Member admin = new Member();
            admin.setName("Admin");
            admin.setEmail(email);
            admin.setPassword(passwordEncoder.encode("adminpw"));
            admin.setCheckedTermsS(false);
            admin.setSocial(false);
            admin.setGrade_code(1);
            admin.setRole(Role.ADMIN);


            try {
                memberService.validateDuplicateMember(admin);
                memberService.saveMember(admin);
            } catch (IllegalStateException e) {
                System.out.println("e.getMessage() = " + e.getMessage());
            }
        }
    }
}