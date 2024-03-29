package bo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CompteSimple extends Compte {

    private float decouvert;

    public CompteSimple(){

    }

    public CompteSimple(float solde, float decouvert, int idAgence) {
        super(solde, idAgence);
        this.decouvert = decouvert;
        setType(2);
    }

    @Override
    public void retrait(float montant) {
        if (montant > 0) {
            if (getSolde() - montant > (-decouvert)) {
                setSolde(getSolde() - montant);
            } else {
                System.out.println("Retrait impossible, découvert atteint");
            }
            addLog("retrait de " + montant + " euros sur le compte d'id " + getId());
        } else {
            System.out.println("Un virement ne peux pas être négatif !");
        }
    }

    @Override
    public void log(ArrayList<String> logs) {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompteSimple{ ");
        sb.append("id=").append(getId());
        sb.append(", solde=").append(getSolde());
        sb.append(", decouvert=").append(decouvert);
        sb.append(" }\n");
        return sb.toString();
    }

    public float getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(float decouvert) {
        this.decouvert = decouvert;
    }

}
