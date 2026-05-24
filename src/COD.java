public class COD extends BankAccount {
    private int dureeMois;

    // Constructeur du certificat de dépôt
    public COD(String compte, double solde, int dureeMois) {
        super(compte, solde);
        this.dureeMois = dureeMois;
    }

    public int getDureeMois() {
        return dureeMois;
    }

    public void setDureeMois(int dureeMois) {
        this.dureeMois = dureeMois;
    }
}