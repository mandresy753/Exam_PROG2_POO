import java.time.LocalDate;

public class MatchAmical extends Match {
    public MatchAmical(String id, LocalDate date, String lieu, Combattant c1, Combattant c2) {
        super(id, date, lieu, c1, c2);
    }

    @Override
    public void terminer() {}
}
