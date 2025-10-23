// LibraryRoyaltyCalculator.java
// Simpel test af systemet uden afrunding (ingen Math.round, ingen String.format)

public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {

        // 1) Opret forfatter
        Author olga = new Author("Olga Ravn");

        // 2) Opret mindst tre titler (mindst én lydbog)
        PrintedBook celestinePrint = new PrintedBook("Celestine (print)", "SKØN", 140, 166);
        AudioBook celestineAudio = new AudioBook("Celestine (lyd)", "SKØN", 140, 192);
        PrintedBook ekstraFagbog = new PrintedBook("Skrivning i praksis", "FAG", 80, 250);

        // 3) Tilføj titlerne til forfatteren
        olga.addTitle(celestinePrint);
        olga.addTitle(celestineAudio);
        olga.addTitle(ekstraFagbog);

        // 4) Beregn kroner pr. titel (uden afrunding)
        double r1 = celestinePrint.calculateRoyalty();
        double r2 = celestineAudio.calculateRoyalty();
        double r3 = ekstraFagbog.calculateRoyalty();

        // 5) Skriv resultaterne ud (uden at bruge Math.round)
        System.out.println(celestinePrint.getTitle() + ": " + r1 + "kr");
        System.out.println(celestineAudio.getTitle() + ": " + r2 + "kr");
        System.out.println(ekstraFagbog.getTitle() + ": " + r3 + "kr");
        System.out.println("--------------------------------");

        // 6) Beregn total og skriv ud
        double total = olga.calculateRoyalties();
        System.out.println(olga.getName() + ": " + total + "kr");
    }
}


