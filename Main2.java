public class Main {
    public static int def1(Queue<Integer> a, int x) {
        int i  = 0;
        int n = 0;
        int z = 0;
        while (!a.isEmpty()) {
            n = a.remove();
            z = z + n;
            int count++;
        }
        return z;
    }

    public static int count(Queue<Integer> a) {
        int count = 0;
        while (!a.isEmpty()) {
            a.remove();
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Queue<Integer> a = new Queue<>();
        a.insert(1);
        a.insert(2);
        a.insert(3);
        int all = count(a);
        System.out.println(def1(a, 2) / all);
    }
}
