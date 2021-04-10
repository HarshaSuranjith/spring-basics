package lk.nsbm.dea2.springworkshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NsbmBean {

    private Dea2Bean dea2Bean;

    @Autowired
    public NsbmBean(Dea2Bean dea2Bean) {
        this.dea2Bean = dea2Bean;
    }

    public Dea2Bean getDea2Bean() {
        return dea2Bean;
    }

    public void setDea2Bean(Dea2Bean dea2Bean) {
        this.dea2Bean = dea2Bean;
    }
}
