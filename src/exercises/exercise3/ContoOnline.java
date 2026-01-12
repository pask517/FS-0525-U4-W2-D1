package exercises.exercise3;

import exercises.BancaException;

public class ContoOnline extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("Titolare" + restituisciTitolare() + "-Saldo: " + restituisciSaldo() + "-Num movimenti: " + restituisciNMovimenti());
    }

    public void preleva(double x) throws BancaException {
        if (x > maxPrelievo) {
            throw new BancaException("Il prelievo non é disponibile");
        } else {
            super.preleva(x);
        }

    }
}
