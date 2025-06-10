// Main.java
public class Main {

    public static void main(String[] args) {
        // 1. Gun enum'ından bir değişken tanımlıyoruz.
        // Bu değişken sadece Gun enum'ındaki değerlerden birini alabilir.
        Gun bugun = Gun.CUMA;

        // 2. Ekrana "Bugün günlerden: CUMA" yazdırıyoruz.
        // 'bugun' değişkeni yazdırılırken Java, enum sabitinin adını ("CUMA") kullanır.
        System.out.println("Bugün günlerden: " + bugun);

        // 3. Ekrana "Yarın günlerden: Cumartesi" yazdırıyoruz.
        Gun yarin = Gun.CUMARTESI;
        System.out.println("Yarın günlerden: " + yarin);
    }
}