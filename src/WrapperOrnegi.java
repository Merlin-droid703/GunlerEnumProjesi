public class WrapperOrnegi {

    public static void main(String[] args) {

        // 1. Adım: İlkel (primitive) tipte bir int değişkeni oluşturuluyor.
        int ilkelSayi = 100;
        System.out.println("1. İlkel int Değeri: " + ilkelSayi);

        // 2. Adım: Autoboxing
        // Java, ilkel int tipini otomatik olarak bir Integer nesnesine çevirir.
        Integer wrapperSayi = ilkelSayi;
        System.out.println("2. Autoboxing (int -> Integer): " + wrapperSayi);

        // 3. Adım: Unboxing
        // Java, Integer nesnesini otomatik olarak ilkel int tipine geri çevirir.
        int yeniIlkelSayi = wrapperSayi;
        System.out.println("3. Unboxing (Integer -> int): " + yeniIlkelSayi);

        // Ekstra: Wrapper sınıflarının faydalı metotları vardır.
        // Örneğin, metin (String) olarak gelen bir sayıyı matematiksel bir int'e çevirebiliriz.
        String metinHalindekiSayi = "250";
        int donusturulenSayi = Integer.parseInt(metinHalindekiSayi);
        System.out.println("4. Metinden dönüştürülen sayı: " + donusturulenSayi);
    }
}