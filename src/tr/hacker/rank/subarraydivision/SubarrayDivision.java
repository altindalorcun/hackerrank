package tr.hacker.rank.subarraydivision;

import java.util.List;

public class SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {

        int count = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            if (d == s.subList(i, i + m).stream().mapToInt(Integer::intValue).sum())
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(birthday(List.of(2, 2, 1, 3, 2), 4, 2) == 2);
        System.out.println(birthday(List.of(1, 2, 1, 3, 2), 3, 2) == 2);
        System.out.println(birthday(List.of(1, 1, 1, 1, 1, 1), 3, 2) == 0);
        System.out.println(birthday(List.of(4), 4, 1) == 1);

    }
}
