public class queue_level1 {

    public static <T> Queue<T> ex1(Queue<T> q) { // O(n)
        Queue<T> a = new Queue<>();
        Queue<T> t = new Queue<>();

        while (!q.isEmpty()) {
            T x = q.remove();
            a.insert(x);
            t.insert(x);
        }
        while (!t.isEmpty())
            q.insert(t.remove());

        return a;
    }

    public static double ex2(Queue<Integer> q) { // O(n)
        Queue<Integer> t = new Queue<>();
        int s = 0, c = 0;

        while (!q.isEmpty()) {
            int x = q.remove();
            s += x;
            c++;
            t.insert(x);
        }
        while (!t.isEmpty())
            q.insert(t.remove());

        return c == 0 ? 0 : (double)s / c;
    }

    public static int ex3(Queue<Integer> q, int k) { // O(n)
        Queue<Integer> t = new Queue<>();
        int c = 0;

        while (!q.isEmpty()) {
            int x = q.remove();
            if (k != 0 && x % k == 0) c++;
            t.insert(x);
        }
        while (!t.isEmpty())
            q.insert(t.remove());

        return c;
    }

    private static boolean ok(Queue<Integer> q, int d) { // O(n)
        Queue<Integer> t = new Queue<>();
        boolean f = false;

        while (!q.isEmpty()) {
            int x = q.remove();
            if (d != 0 && x % d == 0) f = true;
            t.insert(x);
        }
        while (!t.isEmpty())
            q.insert(t.remove());

        return f;
    }

    public static boolean ex4(Queue<Integer> a, Queue<Integer> b) { // O(n^2)
        Queue<Integer> t = new Queue<>();
        boolean f = true;

        while (!a.isEmpty()) {
            int x = a.remove();
            if (!ok(b, x)) f = false;
            t.insert(x);
        }
        while (!t.isEmpty())
            a.insert(t.remove());

        return f;
    }

    public static boolean ex5(Queue<Integer> q, int x) { // O(n)
        Queue<Integer> t = new Queue<>();
        boolean f = false, p = false;

        while (!q.isEmpty()) {
            int v = q.remove();
            if (v == x && p) f = true;
            p = (v == x);
            t.insert(v);
        }
        while (!t.isEmpty())
            q.insert(t.remove());

        return f;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.insert(3);
        q.insert(2);
        q.insert(2);
        q.insert(7);

        System.out.println(ex1(q));
        System.out.println(ex2(q));
        System.out.println(ex3(q, 2));

        Queue<Integer> a = new Queue<>();
        Queue<Integer> b = new Queue<>();
        a.insert(2);
        a.insert(3);
        b.insert(4);
        b.insert(9);

        System.out.println(ex4(a, b));
        System.out.println(ex5(q, 2));
    }
}
