// Title.java
// Superklasse som i klassediagrammet, men uden brug af .equals()

public abstract class Title {

    private String title;
    private String literatureType;

    // Konstant sats (rate) for 2025
    protected static final double RATE = 0.067574;

    // Constructor
    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    // Getters (så andre klasser kan få adgang til oplysningerne)
    public String getTitle() {
        return title;
    }

    public String getLiteratureType() {
        return literatureType;
    }

    // Beregner kroner for denne titel
    public double calculateRoyalty() {
        return calculatePoints() * RATE;
    }

    // Abstrakt metode - skal laves i underklasserne
    public abstract double calculatePoints();

    // Konverterer litteraturtype til en talværdi
    protected double convertLiteratureType() {

        // Lav om til store bogstaver så vi kan sammenligne simpelt
        String t = literatureType.toUpperCase();

        // Brug switch i stedet for equals
        switch (t) {
            case "BI":      // Billedbøger
                return 3.0;
            case "TE":      // Tegneserier
                return 3.0;
            case "LYRIK":
                return 6.0;
            case "SKØN":
            case "SKOEN":   // Hvis tastatur uden ø
                return 1.7;
            case "FAG":
                return 1.0;
            default:
                return 1.0;  // Standard hvis der tastes noget andet
        }
    }
}

