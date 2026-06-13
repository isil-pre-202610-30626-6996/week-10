
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();

        list.add("Carlos");
        list.add("Maria");
        list.add("Marcos");
        list.add("Mariana");
        list.add("Francisco");
        list.add("Verónica");

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

    }
}
