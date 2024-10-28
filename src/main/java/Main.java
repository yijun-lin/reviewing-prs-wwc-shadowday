import com.example.SuperHero;
import com.example.Superman;
import com.example.Batman;

public class Main {
    public static void main(String[] args) {
        SuperHero superman = new Superman("Clark Kent");
        SuperHero batman = new Batman("Bruce Wayne");

        superman.fly();
        batman.fly();
    }
}
