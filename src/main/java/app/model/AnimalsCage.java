package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
//    @Qualifier("cat")
    private Animal dog;
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(dog.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }
    @Autowired
    public void setTimer(Timer timer) {
        this.timer = timer;
    }
}
