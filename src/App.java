
public class App {

    public static void main(String[] args) throws Exception {
        Competition competition = new Competition("Maratón Lima", 50);

        competition.addRunner(new Runner(1, "Juan Pérez", 45));
        competition.addRunner(new Runner(2, "María Gómez", 48));
        competition.addRunner(new Runner(3, "Carlos Sánchez", 49));
        competition.addRunner(new Runner(4, "Ana Rodríguez", 47));
        competition.addRunner(new Runner(5, "Luis Fernández", 46));
        competition.addRunner(new Runner(6, "Sofía Martínez", 44));
        competition.addRunner(new Runner(7, "Miguel Torres", 50));
        competition.addRunner(new Runner(8, "Laura Díaz", 43));
        competition.addRunner(new Runner(9, "Diego Ramírez", 42));
        competition.addRunner(new Runner(10, "Isabel Gómez", 41));

        competition.showRunners();

        competition.qualifyRunners();

        competition.showQualifiedRunners();
    }
}
