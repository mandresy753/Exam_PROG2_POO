import java.time.LocalDate;

public class MatchOfficiel extends Match {
    public MatchOfficiel(String id, LocalDate date, String lieu, Combattant c1, Combattant c2) {
        super(id, date, lieu, c1, c2);
    }

    @Override
    public void terminer() {
        if (points1 > points2) {
            combattant1.victoire();
            combattant2.defaite();
        } else if (points2 > points1) {
            combattant2.victoire();
            combattant1.defaite();
        } else {
            combattant1.egalite();
            combattant2.egalite();
        }
    }
}
