package appPack;

public class Palindrom {
    String DegerGir = "", DönenDeger = "", karsilastirilanDeger = "";
    boolean degerPalindromMu = false;

    boolean palindromMu(String DegerGir) {

        for (int i = DegerGir.length() - 1; i >= 0; i--) {
            DönenDeger += DegerGir.charAt(i);

        }
        if (DönenDeger.equals(DegerGir)) {
            degerPalindromMu = true;

        }

        return degerPalindromMu;

    }

    void anaMethod(String DegerGir, String DegerKar) {
        tersiMi(DegerGir, DegerKar);
    }

    void tersiMi(String DegerGir, String DegerKar) {
        boolean ilkDegerA = palindromMu(DegerGir);
        boolean ikinciDegerB = palindromMu(DegerGir);
        String ilkDegeriATersCevir = "";

        for (int i = DegerGir.length() - 1; i >= 0; i--) {

            ilkDegeriATersCevir += DegerGir.charAt(i);
        }

        if (DegerGir.length() == DegerKar.length() && !DegerGir.equals(DegerKar)) {
            if (ilkDegeriATersCevir.equals(DegerKar)) {
                System.out.println("Bu kelime Polidromdur.");
            } else {
                System.out.println("Bu kelime Polidrom Degildir.");
            }
        } else if ((DegerGir.equals(DegerKar)) && ilkDegerA && ikinciDegerB) {
            System.out.println(
                    " Bu kelime  palindromdur.");
        } else if (DegerGir.equals(karsilastirilanDeger)) {
            System.out.println("Hata : Bu kelime birbirinden farkli olmalidir");
        } else
            System.out.println("Hata : Bu kelime ayni uzunlukta olmalidir.");
    }
}