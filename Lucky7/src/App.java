import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Paljonko rahaa laitetaan?");
        
        String scmoney = in.nextLine();
        int money = Integer.parseInt(scmoney);

        while (money > 0)
        {
            money--;

            int num1 = random.nextInt(7) + 1;
            int num2 = random.nextInt(7) + 1;
            int num3 = random.nextInt(7) + 1;
        
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);

            if (num1 == 7 || num2 == 7 || num3 == 7)
            {
                System.out.println("Voitit!");
                money = money + 2;
            }
            else
            {
                System.out.println("Hävisit!");
            }
            System.out.println("Haluatko pelata uudestaan? Jos haluat, paina Enter. Jos et halua, kirjoita e ja paina Enter");
            String repeat = in.nextLine();
            if (repeat.equals("e"))
            {
                    money = 0;
            }
        }
        System.out.println("Kiitos pelistä!");
    }
}
