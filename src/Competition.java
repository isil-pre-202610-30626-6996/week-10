
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Competition {

    private final String name;
    private final double qualifyingRecord;
    private final List<Runner> runners;
    private final List<Runner> qualifiedRunners;

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
            System.out.println(runner + " Qualifying record: " + String.format("%.2f", runner.getQualifyingRecord()));
        }

        System.out.println("");

    }

    public void finalRace() {
        for (Runner runner : qualifiedRunners) {
            double record = Math.random() * (20) + qualifyingRecord - 10;
            runner.setFinalRaceRecord(record);

            if (record < runner.getPersonalRecord()) {
                runner.setPersonalRecord(record);
            }
        }

        Collections.sort(qualifiedRunners, Comparator.comparing(Runner::getFinalRaceRecord));
    }

    public void showFinalRaceResults() {

        System.out.println("========================");
        System.out.println("Final results");
        System.out.println("========================");
        System.out.println("");

        for (Runner runner : qualifiedRunners) {
            System.out.println(runner + " Final record: " + String.format("%.2f", runner.getFinalRaceRecord()));
        }

        System.out.println("");

    }
}
