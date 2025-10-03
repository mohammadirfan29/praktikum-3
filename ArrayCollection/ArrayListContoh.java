package ArrayCollection; 

import java.util.ArrayList; // import ArrayList

public class ArrayListContoh {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Isi ArrayList: " + fruits);

        fruits.remove("Banana");
        System.out.println("Setelah dihapus: " + fruits);
    }
}