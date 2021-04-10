package lk.nsbm.dea2.springworkshop;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomSelector {


    @Test
    public void test_select() {
        Random random = new Random();
        System.out.println(random.nextInt(21));
    }

}
