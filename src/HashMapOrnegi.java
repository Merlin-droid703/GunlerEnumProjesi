import java.util.HashMap;
import java.util.Map;

public class HashMapOrnegi {

    public static void main(String[] args) {
        // 1. Adım: Anahtar'ı String, Değer'i Integer olan bir HashMap oluştur.
        Map<String, Integer> ogrenciNotlari = new HashMap<>();

        // 2. Adım: Anahtar-değer çiftlerini ekle.
        ogrenciNotlari.put("Ahmet", 90);
        ogrenciNotlari.put("Ayşe", 85);
        ogrenciNotlari.put("Mehmet", 75);

        System.out.println("Öğrenci Not Listesi:");

        // 3. Adım: for-each döngüsü ile tüm elemanları yazdır.
        // .entrySet() metodu, map'teki her bir kaydı (anahtar+değer) bir Set olarak verir.
        for (Map.Entry<String, Integer> entry : ogrenciNotlari.entrySet()) {
            String ogrenciAdi = entry.getKey(); // Anahtarı (öğrenci adı) al
            Integer notu = entry.getValue();   // Değeri (not) al

            System.out.println(ogrenciAdi + " isimli öğrencinin notu: " + notu);
        }
    }
}
