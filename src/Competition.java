
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

    public void showRunners() {

        System.out.println("========================");
        System.out.println("Runners in " + name);
        System.out.println("========================");
        System.out.println("");

        for (Runner runner : runners) {
            System.out.println(runner);
        }

        System.out.println("");
    }

}
