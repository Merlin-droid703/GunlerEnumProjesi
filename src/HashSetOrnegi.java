import java.util.HashSet;
import java.util.Set;

public class HashSetOrnegi {

    public static void main(String[] args) {
        // 1. Adım: String türünde bir HashSet oluştur.
        Set<String> meyveler = new HashSet<>();

        // 2. Adım: Elemanları ekle. "elma" elemanını iki kez eklemeye çalış.
        meyveler.add("elma");
        meyveler.add("elma"); // Bu eleman zaten sette olduğu için eklenmeyecektir.
        meyveler.add("muz");
        meyveler.add("kiraz");

        // 3. Adım: Set'in son halini ekrana yazdır.
        System.out.println("HashSet İçeriği: " + meyveler);
    }
}