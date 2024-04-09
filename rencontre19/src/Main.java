import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> entiers1 = new ArrayList<Integer>();
        entiers1.add(1);
        entiers1.add(2);
        entiers1.add(3);

        ArrayList<Integer> entiers2 = new ArrayList<Integer>();
        entiers2.add(4);
        entiers2.add(5);
        entiers2.add(6);

        System.out.println(fusionner(entiers1, entiers2));
    }

    public static ArrayList<Integer> fusionner(ArrayList<Integer> entiers1, ArrayList<Integer> entiers2){
        ArrayList<Integer> entiersFusionnes = new ArrayList<Integer>();
        entiersFusionnes.addAll(entiers1);
        entiersFusionnes.addAll(entiers2);
        return entiersFusionnes;
    }
}
