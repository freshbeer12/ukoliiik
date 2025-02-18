import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Kolik filmů si přeješ zadat do databáze?");
        int[] film = sc.nextInt();
        int n = film[n] = sc.nextInt();
        sc.nextLine();

        Film[] film = new Film("", 0, 0, "");


        for (int i = 1; i < n; i++) {
            Film[] arrayFilm = new Film[i];
            arrayFilm[n] = new Film("", 0, 0, "");
            i++;
        }

        for (int i = 1; i < n; i++) {
            Herec[] arrayHerec = new Herec[i];
            arrayHerec[n] = new Herec("", 0, 0);
            i++;
        }





    }
}