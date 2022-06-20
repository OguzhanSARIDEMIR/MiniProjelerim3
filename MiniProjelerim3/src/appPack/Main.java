package appPack;

public class Main {
    public static void main(String[] args) {

        Palindrom Deger1 = new Palindrom();
        Palindrom Deger2 = new Palindrom();
        Palindrom Deger3 = new Palindrom();
        Palindrom Deger4 = new Palindrom();
        Palindrom Deger5 = new Palindrom();

        System.out.println(Deger1.palindromMu("ebe"));
        System.out.println(Deger2.palindromMu("nalan"));
        System.out.println(Deger3.palindromMu("Abartı"));
        System.out.println(Deger4.palindromMu("iyi"));


        Deger5.anaMethod("iyi", "iyi");
    }
}
