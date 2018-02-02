import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int buddies = 0;
        int afterBattle;
        String exit;

        System.out.println("Ты пират, и разгуливаешь по кишащему преступниками");
        System.out.println("городе Гаване (год 1789). Сколько с тобой ");
        System.out.println("дружков-пиратов? (побольше)");

        buddies = in.nextInt();
        while (buddies >= 107) {
            System.out.println("Мушкетёрам не справиться с таким количеством пиратов");
            System.out.println("Пускай их будет меньше 107 человек!");
            System.out.println("Так сколько с тобой пиратов-двужков?");
            buddies = in.nextInt();
            if (buddies >= 107) {
                System.out.println("Я же сказал, меньше, чем 107 человек!");
            }
        }



        afterBattle = 1 + buddies - 10;
        System.out.println("Внезапно из ближайшей таверны выбегают 10 мушкетеров и ");
        System.out.println("обнадают свои шпаги. 10 мушкетеров и 10 пиратов погибают в ");
        System.out.println("схватке. Осталось лишь " + afterBattle + " пиратов.");
        System.out.println("Состояние убитых насчитывает 107 золотых монет. Это по " + (107 / buddies));
        System.out.println("золотых монет на каждого.");
        System.out.println("Пираты устраиват большую пьяную драку из-за оставшихся " + (107 % afterBattle) + " монет.");

    }
}
