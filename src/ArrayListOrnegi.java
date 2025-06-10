import java.util.ArrayList;

public class ArrayListOrnegi {

    public static void main(String[] args) {
        // String türünde elemanlar tutan bir ArrayList oluşturuluyor.
        ArrayList<String> sehirler = new ArrayList<>();

        // Listeye .add() metodu ile elemanlar ekleniyor.
        // Elemanlar eklendiği sırada tutulur.
        sehirler.add("Bursa");
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("Bursa"); // List'ler tekrar eden elemanlara izin verir.

        // for-each döngüsü ile listedeki her bir eleman ekrana yazdırılıyor.
        System.out.println("Şehirler Listesi:");
        for (String sehir : sehirler) {
            System.out.println(sehir);
        }
    }
}
