public class Demo {
    public static void main(String[] args) {
        byte a = 55;
        short b;
        b = a;
        System.out.println(a);
        System.out.println(b);

        short c = 66;
        byte d;
        d = (byte) c;
        System.out.println(c);
        System.out.println(d);

        int e = 98765;
        double f;
        f = e;
        System.out.println(e);
        System.out.println(f);

        double g = 98765.432;
        int h;
        h = (int) g;
        System.out.println(g);
        System.out.println(h);
    }
}