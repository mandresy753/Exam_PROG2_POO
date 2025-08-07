import java.util.ArrayList;
import java.util.List;

public class Combattant {
    private String id;
    private String nom;
    private String prenom;
    private String nomCombattant;
    private double poids;
    private List<String> titres;
    private int victoires = 0;
    private int defaites = 0;
    private int egalites = 0;

    public Combattant(String id, String nom, String prenom, String nomCombattant, double poids) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomCombattant = nomCombattant;
        this.poids = poids;
        this.titres = new ArrayList<>();
    }

    public void ajouterTitre(String titre) {
        titres.add(titre);
    }

    public void victoire() { victoires++; }
    public void defaite() { defaites++; }
    public void egalite() { egalites++; }

    public String getId() { return id; }

    public int getVictoires() { return victoires; }
    public int getDefaites() { return defaites; }
    public int getEgalites() { return egalites; }
    public List<String> getTitres() { return titres; }
}
