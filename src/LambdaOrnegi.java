import java.util.ArrayList;
import java.util.List;

public class LambdaOrnegi {

    public static void main(String[] args) {
        // 1. Adım: Bir ArrayList<Integer> oluştur.
        List<Integer> sayilar = new ArrayList<>();

        // 2. Adım: İçine 5 tane sayı ekle.
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        sayilar.add(50);

        System.out.println("Listedeki Sayılar:");

        // 3. Adım: forEach metodu ile lambda kullanarak tüm sayıları ekrana yazdır.
        // Bu ifade, "listedeki her bir 'sayi' elemanı için, o sayıyı ekrana yazdır" demektir.
        sayilar.forEach(sayi -> System.out.println(sayi));
    }
}