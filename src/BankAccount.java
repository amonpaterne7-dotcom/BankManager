public class BankAccount {
    protected String compte;
    protected double solde;

    public BankAccount(String compte, double solde) {
        this.compte = compte;
        this.solde = solde;
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}