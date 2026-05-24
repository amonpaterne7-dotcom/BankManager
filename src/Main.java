public class Main {
    public static void main(String[] args) {
        // Création des comptes
        CheckingAccount compteCourant = new CheckingAccount("CC-001", 1000.0, 500.0);
        SavingsAccount compteEpargne = new SavingsAccount("CE-001", 2000.0, 2.5);
        COD certificatDepot = new COD("COD-001", 5000.0, 12);

        // Lecture et modification des attributs
        System.out.println("Compte courant : " + compteCourant.getCompte() + " - solde : " + compteCourant.getSolde());
        compteCourant.setSolde(compteCourant.getSolde() + 250.0);

        System.out.println("Compte épargne : " + compteEpargne.getCompte() + " - solde : " + compteEpargne.getSolde());
        compteEpargne.appliquerInteret();

        System.out.println("Certificat de dépôt : " + certificatDepot.getCompte() + " - solde : " + certificatDepot.getSolde());
    }
}