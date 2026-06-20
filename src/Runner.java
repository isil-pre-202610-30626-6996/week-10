
public class Runner {

    private int id;
    private String name;
    private double personalRecord;
    private double qualifyingRecord;
    private double finalRaceRecord;

    public Runner(int id, String name, double personalRecord) {
        this.id = id;
        this.name = name;
        this.personalRecord = personalRecord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPersonalRecord() {
        return personalRecord;
    }

    public void setPersonalRecord(double personalRecord) {
        this.personalRecord = personalRecord;
    }

    public double getQualifyingRecord() {
        return qualifyingRecord;
    }

    public void setQualifyingRecord(double qualifyingRecord) {
        this.qualifyingRecord = qualifyingRecord;
    }

    public double getFinalRaceRecord() {
        return finalRaceRecord;
    }

    public void setFinalRaceRecord(double finalRaceRecord) {
        this.finalRaceRecord = finalRaceRecord;
    }

    @Override
    public String toString() {
        return name + " with " + String.format("%.2f", personalRecord) + " as a personal record.";
    }

}
