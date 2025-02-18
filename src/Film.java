import java.util.Arrays;
import java.util.Scanner;
public class Film {

    private String nazev;
    private int vydani;
    private int hodnoceni;
    private String herci;

    public Film(String nazev, int vydani, int hodnoceni, String herci) {
        this.nazev = nazev;
        this.vydani = vydani;
        this.hodnoceni = hodnoceni;
        this.herci = herci;
    }


    public String getNazev() {
        return nazev;
    }
    public int getVydani() {
        return vydani;
    }
    public int getHodnoceni() {
        return hodnoceni;
    }
    public String getHerci() {
        return herci;
    }



}
