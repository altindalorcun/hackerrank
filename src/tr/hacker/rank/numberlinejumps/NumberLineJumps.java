package tr.hacker.rank.numberlinejumps;

public class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        if (x1 < x2 && v1 < v2) {
            return "NO";
        }

        if (v2 - v1 != 0) {
            if ((x2 - x1) % (v2 - v1) == 0) {
                return "YES";
            } else {
                return "NO";
            }
        } else {
            return "NO";
        }

    }

    public static void main(String[] args) {

        System.out.println(kangaroo(2, 1, 1, 2));
        System.out.println(kangaroo(0, 3, 4, 2));
        System.out.println(kangaroo(0, 2, 5, 3));
        System.out.println(kangaroo(43, 2, 70, 2));
        System.out.println(kangaroo(1571, 4240, 9023, 4234));
        System.out.println(kangaroo(6644, 5868, 8349, 3477));

    }
}
