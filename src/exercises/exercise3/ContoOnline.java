package exercises.exercise3;

public class ContoOnline extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("Titolare" + restituisciTitolare() + "-Saldo: " + restituisciSaldo() + "-Num movimenti: " + restituisciNMovimenti());
    }

    public void preleva(double x) {
        if (x <= maxPrelievo) {
            super.preleva(x);
        }

    }
}
