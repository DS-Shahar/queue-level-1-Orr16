public class Main {
    public static int def1(Queue<Integer> a, int x) {
        Queue<Integer> copy = copyQueue(a);
        int z = 0;
        while (!copy.isEmpty()) {
            int n = copy.remove();
            z = z + n;
        }
        return z;
    }

    public static int count(Queue<Integer> a) {
        Queue<Integer> copy = copyQueue(a);
        int count = 0;
        while (!copy.isEmpty()) {
            copy.remove();
            count++;
        }
        return count;
    }

    public static Queue<Integer> copyQueue(Queue<Integer> original) {
        Queue<Integer> copy = new Queue<>();
        Queue<Integer> temp = new Queue<>();
        while (!original.isEmpty()) {
            int value = original.remove();
            temp.insert(value);
            copy.insert(value);
        }
        while (!temp.isEmpty()) {
            original.insert(temp.remove());
        }
        return copy;
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
