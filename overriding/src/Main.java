public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new TarimKrediManager(),
                new MemurKrediManager(), new StudentKrediManager()};

        for (BaseKrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }
    }
}