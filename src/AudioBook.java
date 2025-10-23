public class AudioBook extends Title {

    private int durationInMinutes;
    private int copies;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType);
        this.durationInMinutes = durationInMinutes;
        this.copies = copies;
    }

    @Override
    public double calculatePoints() {
        double typeValue = convertLiteratureType();
        double halfMinutes = durationInMinutes * 0.5;
        return halfMinutes * typeValue * copies;
    }
}
