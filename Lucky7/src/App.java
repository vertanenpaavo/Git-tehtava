import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int num1 = random.nextInt(7) + 1;
        int num2 = random.nextInt(7) + 1;
        int num3 = random.nextInt(7) + 1;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        if (num1 == 7 || num2 == 7 || num3 == 7)
        {
            System.out.println("Voitit!");
        }
        else
        {
            System.out.println("Hävisit!");
        }
    }
}
