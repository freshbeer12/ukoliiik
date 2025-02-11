import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Kolik filmů si přeješ zadat do databáze?");
        int film = sc.nextInt();

        for (int i = 1; i < film; i++) {
            Film[] arrayFilm = new Film[i];
            arrayFilm[3] = new Film("", 0, 0, "");
        }





    }
}