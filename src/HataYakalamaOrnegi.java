import java.util.InputMismatchException;
import java.util.Scanner;

public class HataYakalamaOrnegi {

    public static void main(String[] args) {

        // Kullanıcıdan veri almak için Scanner nesnesi oluşturuluyor.
        Scanner scanner = new Scanner(System.in);

        // Hata çıkma potansiyeli olan kodlar bu bloğun içine yazılır.
        try {
            System.out.print("Bölünecek sayıyı girin: ");
            int sayi1 = scanner.nextInt();

            System.out.print("Bölen sayıyı girin: ");
            int sayi2 = scanner.nextInt();

            // Sıfıra bölme hatası burada oluşabilir.
            int sonuc = sayi1 / sayi2;

            System.out.println("Sonuç: " + sonuc);

            // Bir hata oluşursa, ilgili 'catch' bloğu çalışır.
        } catch (ArithmeticException e) {
            // Eğer sıfıra bölme hatası olursa bu blok çalışır.
            System.out.println("Hata: Bir sayı sıfıra bölünemez!");

        } catch (InputMismatchException e) {
            // Eğer sayı yerine harf gibi geçersiz bir değer girilirse bu blok çalışır.
            System.out.println("Hata: Lütfen sadece sayısal bir değer giriniz!");

        } finally {
            // Hata olsa da olmasa da her zaman çalışan bloktur.
            // Kaynakları (dosya, veritabanı bağlantısı vb.) kapatmak için idealdir.
            scanner.close();
            System.out.println("Program sonlandı.");
        }
    }
}