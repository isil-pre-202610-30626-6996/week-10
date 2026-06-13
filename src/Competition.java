
import java.util.ArrayList;
import java.util.List;

public class Competition {

    private String name;
    private double qualifyingRecord;
    private List<Runner> runners;

    public Competition(String name, double qualifyingRecord) {
        this.name = name;
        this.qualifyingRecord = qualifyingRecord;
        this.runners = new ArrayList<>();
    }

    public void addRunner(Runner runner) {
        runners.add(runner);
    }

}
