
import java.time.LocalDate;

public abstract class Match {
    String id;
    LocalDate date;
    String lieu;
    Combattant combattant1;
    Combattant combattant2;
    int points1;
    int points2;

    public Match(String id, LocalDate date, String lieu, Combattant c1, Combattant c2) {
        this.id = id;
        this.date = date;
        this.lieu = lieu;
        this.combattant1 = c1;
        this.combattant2 = c2;
    }

    public void definirPoints(int p1, int p2) {
        this.points1 = p1;
        this.points2 = p2;
    }

    public abstract void terminer();
}

