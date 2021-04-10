package lk.nsbm.dea2.springworkshop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public Dea2Bean dea2Bean() {
        return new Dea2Bean();
    }

}
