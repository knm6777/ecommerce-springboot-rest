package kr.ac.hansung.cse.ecommercespringrest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class EcommerceSpringRestApplicationTests {

    @Autowired
    PasswordEncoder encoder;

    @Test
    void generateHashedPassword() {
        String pwd = encoder.encode("charliepw");
        System.out.println(pwd);
    }

}
