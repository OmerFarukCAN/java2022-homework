public class Main {
    public static void main(String[] args) {
        sayiBulma();
    }
    public static void sayiBulma(){
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 7;
        int result = 0;

        for (var sayi : sayilar) {
            if (sayi == aranacak) {
                result += 1;
            }
        }
        if (result > 0) {
            giveMessage("Aradiginiz sayi bu listede mevcuttur: " + aranacak);
        } else {
            giveMessage("Aradaginiz sayi bu listede mevcut degildir: " + aranacak);
        }
    }
    public static void giveMessage(String message){
        System.out.println(message);
    }
}