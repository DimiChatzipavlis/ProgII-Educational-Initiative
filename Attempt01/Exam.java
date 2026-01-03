public class Exam {
    public static void main(String[] args) {
        Base a = new Base("Ax");
        Base b = new Base("By");
        Sub c = new Sub("Cz");

        Base poly = c; // polymorphic reference

        int coohee = 0;
        int kappa = 1;
        int rho = 7;
        int mu = 0;

        String omega = "go";

        for (int i = 0; i < 3; i++) {
            coohee += i;

            if (i % 2 == 0) {
                omega = omega + i;
            } else {
                omega = omega.replace("o", "0");
            }

            if (i == 1) {
                kappa += poly.f(i + 2);
            } else {
                kappa += a.f(i);
            }
        }

        while (rho > 3) {
            try {
                String piece = omega.substring(rho - 5, rho - 3);
                int n = Integer.parseInt(piece);
                coohee += n;
            } catch (Exception e) {
                coohee += rho;
            }

            if (rho % 2 == 0) {
                omega = omega + ":" + rho;
            } else {
                omega = omega.substring(1);
            }

            rho -= 2;
        }

        int[] arr = { 1, 2, 3 };
        try {
            arr[coohee - 4] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            kappa -= 5;
        }

        String zeta = poly.g("Hi");

        for (int j = 2; j >= 0; j--) {
            if (j == 1) {
                continue;
            }

            mu += b.f(j);

            if (j == 0) {
                mu += poly.f(-2);
            }
        }

        String theta = (a.who() + "|" + poly.who() + "|" + omega).replace(":", "#");

        // Intentionally minimal output: exam focuses on variable tracing.
        if (zeta.length() == 0 || theta.length() == 0) {
            System.out.println("Impossible");
        }
    }
}

class Base {
    static int s = 1;

    int x;
    String name;

    Base(String n) {
        name = n;
        x = ++s;
    }

    int f(int k) {
        s += k;
        x += k;
        return x;
    }

    String g(String t) {
        name = name + t;
        return name;
    }

    String who() {
        return "B:" + name + ":" + x + ":" + s;
    }
}

class Sub extends Base {
    static int s2 = 10;

    int x; // hides Base.x

    Sub(String n) {
        super(n.toLowerCase());
        x = super.x + s2;
        s2 += 2;
    }

    @Override
    int f(int k) {
        try {
            int v = Integer.parseInt(("" + k).substring(0, 1));
            super.f(v);
            x += k;
        } catch (Exception e) {
            x -= k;
            super.f(1);
        }

        return x + super.x;
    }

    @Override
    String g(String t) {
        StringBuilder sb = new StringBuilder(super.g(t.toUpperCase()));
        sb.reverse();
        name = sb.toString();
        return name;
    }

    @Override
    String who() {
        return "S:" + name + ":" + x + ":" + super.x + ":" + Base.s + ":" + s2;
    }
}
