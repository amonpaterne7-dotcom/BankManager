public class Main {
    public static void main(String[] args) {

        // Création des 3 comptes
        CheckingAccount compteCourant   = new CheckingAccount("CC-001", 650000.0, 325000.0);
        SavingsAccount  compteEpargne   = new SavingsAccount("CE-001", 1300000.0, 2.5);
        COD             certificatDepot = new COD("COD-001", 3250000.0, 12);


        // Compte Courant
        System.out.println(" Compte Courant ");
        System.out.println("Numéro  : " + compteCourant.getCompte());
        System.out.println("Solde   : " + compteCourant.getSolde() + " FCFA");
        System.out.println("Limite  : " + compteCourant.getLimite() + " FCFA");

        compteCourant.setSolde(compteCourant.getSolde() + 163000.0);
        System.out.println("Après dépôt de 163 000 FCFA → Solde : " + compteCourant.getSolde() + " FCFA");


        // Compte Épargne
        System.out.println("\n Compte Épargne ");
        System.out.println("Numéro  : " + compteEpargne.getCompte());
        System.out.println("Solde   : " + compteEpargne.getSolde() + " FCFA");
        System.out.println("Taux    : " + compteEpargne.getTauxInteret() + " %");

        compteEpargne.appliquerInteret();
        System.out.println("Après intérêts → Solde : " + compteEpargne.getSolde() + " FCFA");


        // Certificat de Dépôt
        System.out.println("\n Certificat de Dépôt ");
        System.out.println("Numéro  : " + certificatDepot.getCompte());
        System.out.println("Solde   : " + certificatDepot.getSolde() + " FCFA");
        System.out.println("Durée   : " + certificatDepot.getDureeMois() + " mois");


        // Modification et relecture (prouve get + set)
        System.out.println("\n Modification des comptes ");

        compteCourant.setCompte("CC-001-MAJ");
        System.out.println("Nouveau numéro compte courant : " + compteCourant.getCompte());

        compteEpargne.setSolde(1950000.0);
        System.out.println("Nouveau solde épargne : " + compteEpargne.getSolde() + " FCFA");

    }
}