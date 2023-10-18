import com.example.SuperHero;
import com.example.Superman;

public class Main {
    public static void main(String[] args) {
        SuperHero hero = new Superman("Clark Kent");

        ((Superman)hero).teachAboutSolarPower();
    }
}
