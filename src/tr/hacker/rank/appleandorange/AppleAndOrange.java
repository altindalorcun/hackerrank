package tr.hacker.rank.appleandorange;

import java.util.List;

public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        System.out.println((int) apples.stream().map(apple -> {
            return a + apple;
        }).filter(appleLocation -> s <= appleLocation && t >= appleLocation).count());

        System.out.println((int) oranges.stream().map(orange -> {
            return b + orange;
        }).filter(orangeLocation -> s <= orangeLocation && t >= orangeLocation).count());
    }

    public static void main(String[] args) {

        countApplesAndOranges(7, 11, 5, 15, List.of(-2, 2, 1), List.of(5, -6));

    }
}
