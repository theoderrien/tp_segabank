package testBo;

import bo.ComptePayant;

public class TestComptePayant {

    public static void main(String[] args) {

        ComptePayant comptePayant;

        System.out.println("--------------------------------------------------");
        System.out.println("Test unitaire - création d'un compte payant");
        comptePayant = new ComptePayant(1500.00f, 2);
        System.out.println(comptePayant.toString());
        System.out.println("--------------------------------------------------");

        System.out.println("Test unitaire - versement de 500.00€ sur un compte payant");
        System.out.println("Solde avant versement : " + comptePayant.getSolde() + "€");
        comptePayant.versement(500f);
        System.out.println("Solde après versement : " + comptePayant.getSolde() + "€");
        System.out.println("--------------------------------------------------");
//
        System.out.println("Test unitaire - retrait de 975€ sur un compte payant");
        System.out.println("Solde avant retrait : " + comptePayant.getSolde() + "€");
        comptePayant.retrait(975.00f);
        System.out.println("Solde après retrait : " + comptePayant.getSolde() + "€");
        System.out.println("--------------------------------------------------");

        System.out.println("Test unitaire - retrait supérieur au solde sur un compte payant");
        System.out.println("Solde avant retrait : " + comptePayant.getSolde() + "€");
        comptePayant.retrait(951.25f);
        System.out.println("Solde après retrait : " + comptePayant.getSolde() + "€");
        System.out.println("--------------------------------------------------");


    }
}
