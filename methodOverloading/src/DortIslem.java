public class DortIslem {
    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int sum(int... numbers) {
        int result = 0;
        for (var number : numbers) {
            result += number;
        }
        return result;
    }
}
