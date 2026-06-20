
import java.util.ArrayList;
import java.util.List;

public class Competition {

    private String name;
    private double qualifyingRecord;
    private List<Runner> runners;
    private List<Runner> qualifiedRunners;

    public Competition(String name, double qualifyingRecord) {
        this.name = name;
        this.qualifyingRecord = qualifyingRecord;
        this.runners = new ArrayList<>();
        this.qualifiedRunners = new ArrayList<>();
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

    public void qualifyRunners() {

        for (Runner runner : runners) {
            double record = Math.random() * (20) + qualifyingRecord - 10;
            runner.setQualifyingRecord(record);

            if (record <= qualifyingRecord) {
                qualifiedRunners.add(runner);
            }

        }
    }

    public void showQualifiedRunners() {

        System.out.println("========================");
        System.out.println("Qualified runners");
        System.out.println("========================");
        System.out.println("");

        for (Runner runner : qualifiedRunners) {
            System.out.println(runner + " Qualifying record: " + String.format("%.2f" ,runner.getQualifyingRecord()));
        }
    }
}
