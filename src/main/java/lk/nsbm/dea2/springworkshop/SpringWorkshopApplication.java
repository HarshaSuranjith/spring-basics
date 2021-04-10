package lk.nsbm.dea2.springworkshop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


@SpringBootApplication
public class SpringWorkshopApplication implements ApplicationContextAware {

    private static ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(SpringWorkshopApplication.class, args);
        System.out.println("application started");

        Dea2Bean dea2Bean = ctx.getBean(Dea2Bean.class);
        System.out.println(dea2Bean.getSomeVar());

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext;
    }
}
