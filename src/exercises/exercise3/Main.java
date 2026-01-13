package exercises.exercise3;

import exercises.BancaException;

public class Main {
    public static void main(String[] args) {
        ContoCorrente contoCorrente = new ContoCorrente("Giuseppe", 100);
        ContoOnline contoOnline = new ContoOnline("Andrea", 100, 80);
        try {
            contoCorrente.preleva(120);
        } catch (BancaException e) {
            System.out.println(e);
        }
    }
}
