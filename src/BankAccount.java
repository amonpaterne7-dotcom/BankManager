public class BankAccount {
    protected String compte;
    protected double solde;

    // Constructeur du compte bancaire
    public BankAccount(String compte, double solde) {
        this.compte = compte;
        this.solde = solde;
    }

    // Retourne le numéro du compte
    public String getCompte() {
        return compte;
    }

    // Modifie le numéro du compte
    public void setCompte(String compte) {
        this.compte = compte;
    }

    // Retourne le solde
    public double getSolde() {
        return solde;
    }

    // Modifie le solde
    public void setSolde(double solde) {
        this.solde = solde;
    }
}