public class SavingsAccount extends BankAccount {
    private double tauxInteret;

    // Constructeur du compte d'épargne
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

    // Applique les intérêts au solde
    public void appliquerInteret() {
        double interet = solde * (tauxInteret / 100.0);
        solde += interet;
    }
}