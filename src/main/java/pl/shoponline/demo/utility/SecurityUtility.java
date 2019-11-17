package pl.shoponline.demo.utility;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;

@Component
public class SecurityUtility {

    private static final String SALT = "salt";

    @Bean
    public static BCryptPasswordEncoder passwordEncoder(){
       return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes()));
    }

    @Bean
    public static String randomPassword(){
        String SALTCHARTS = "ABCDEFGHIJKLMNOPQRETUWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random random = new Random();

        while(salt.length() < 18){
            int index = (int)(random.nextFloat()*SALTCHARTS.length());
            salt.append(SALTCHARTS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
}
