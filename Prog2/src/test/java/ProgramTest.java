import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class ProgramTest {

    @Test
    void testMatchOfficielVictoire() {
        Combattant c1 = new Combattant("1", "Gaetan", "Mandresy", "The Rock", 65);
        Combattant c2 = new Combattant("2", "Saddi", "Arnel", "Eagle Mind", 78);

        Match m1 = new MatchOfficiel("m1", LocalDate.now(), "Ivandry😂", c1, c2);
        m1.definirPoints(30, 27);
        m1.terminer();

        assertEquals(1, c1.getVictoires());
        assertEquals(1, c2.getDefaites());

        Combattant c3 = new Combattant("3", "Sandy", "...", "Rabokona", 98);
        Combattant c4 = new Combattant("4", "Harena", "xxx", "Titan", 130);
        Match m2 = new MatchOfficiel("m2", LocalDate.now(), "Las Vegas", c3, c4);
        m2.definirPoints(36, 80);
        m2.terminer();

        assertEquals(1, c3.getDefaites());
        assertEquals(1, c4.getVictoires());
    }


    @Test
    void testMatchTitreAvecTitre() {
        Combattant c1 = new Combattant("1", "Gaetan", "Mandresy", "The Rock", 65);
        Combattant c2 = new Combattant("2", "Saddi", "Arnel", "Eagle Mind", 78);

        Match m3 = new MatchTitre("m2", LocalDate.now(), "Ivandry", c1, c2, "Champion Poids Mi-Lourds");
        m3.definirPoints(28, 30);
        m3.terminer();

        assertEquals(1, c2.getVictoires());
        assertEquals(1, c1.getDefaites());
        assertTrue(c2.getTitres().contains("Champion Poids Mi-Lourds"));
    }

@Test
void testMatchEgalite() {
    Combattant c1 = new Combattant("1", "Gaetan", "Mandresy", "The Rock", 65);
    Combattant c2 = new Combattant("2", "Saddi", "Arnel", "Eagle Mind", 78);

    Match m3 = new MatchTitre("m2", LocalDate.now(), "Ivandry", c1, c2, "Champion Poids Mi-Lourds");
    m3.definirPoints(30, 30);
    m3.terminer();

    assertEquals(0, c2.getVictoires());
    assertEquals(0, c1.getDefaites());
    assertFalse(c2.getTitres().contains("Champion Poids Mi-Lourds"));
}
}
