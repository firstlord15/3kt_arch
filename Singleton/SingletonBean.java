import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public void doSomething() {
        System.out.println("Doing something...");
    }
}