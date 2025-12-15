public class Main {
    public static boolean def1(Queue<Integer> a, int x) {
        while (!a.isEmpty()) {
            if (a.remove() == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Queue<Integer> a = new Queue<>();
        a.insert(1);
        a.insert(2);
        a.insert(3);

        System.out.println(def1(a, 2));  // Should print 'true'
        System.out.println(def1(a, 4));  // Should print 'false'
    }
}
