import java.time.LocalDate;

public class MatchTitre extends Match {
    private String titre;

    public MatchTitre(String id, LocalDate date, String lieu, Combattant c1, Combattant c2, String titre) {
        super(id, date, lieu, c1, c2);
        this.titre = titre;
    }

    @Override
    public void terminer() {
        if (points1 > points2) {
            combattant1.victoire();
            combattant2.defaite();
            combattant1.ajouterTitre(titre);
        } else if (points2 > points1) {
            combattant2.victoire();
            combattant1.defaite();
            combattant2.ajouterTitre(titre);
        } else {
            combattant1.egalite();
            combattant2.egalite();
            // Aucun titre donné
        }
    }
}
