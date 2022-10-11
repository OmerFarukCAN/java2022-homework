public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 11;
        int result = 0;

        for (var sayi: sayilar) {
            if (sayi == aranacak){
                result +=1;
            }
        }
        if (result > 0){
            System.out.println("Aradiginiz sayi bu listede mevcuttur: " + aranacak);
        }else {
            System.out.println("Aradaginiz sayi bu listede mevcut degildir: " + aranacak);
        }
    }
}