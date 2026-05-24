public class SavingsAccount extends BankAccount {
    private double tauxInteret;

    public SavingsAccount(String compte, double solde, double tauxInteret) {
        super(compte, solde);
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public void appliquerInteret() {
        double interet = solde * (tauxInteret / 100.0);
        solde += interet;
    }
}