import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Llapis> caja1 = new ArrayList<>();
        List<Llapis> caja2 = new ArrayList<>();
        for (int a = 0; a < 10; a++){
            Llapis llapis1 = new Llapis(1);
            Llapis llapis2 = new Llapis();
            caja1.add(llapis1);
            caja2.add(llapis2);
        }
        System.out.println("------------------------");
        for (Llapis a: caja1){
            System.out.println(a.getColor());
            System.out.println("------------------------");
        }
        System.out.println("########################");
        for (int a = 0; a < 10; a++){
            System.out.println(caja2.get(a).getColor());
            System.out.printf("%.1f%n",caja2.get(a).getGruix());
            System.out.println("########################");
        }
    }
}