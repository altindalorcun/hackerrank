package tr.hacker.rank.breakingtherecords;

import java.util.List;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        Integer minScore = scores.get(0);
        Integer maxScore = scores.get(0);
        Integer maxCount = 0;
        Integer minCount = 0;

        for (Integer score : scores) {
            if (score < minScore) {
                minScore = score;
                minCount++;
            }
            if (score > maxScore) {
                maxScore = score;
                maxCount++;
            }
        }
        return List.of(maxCount, minCount);
    }

    public static void main(String[] args) {
        List<Integer> results = breakingRecords(List.of(10, 5, 20, 20, 4, 5, 2, 25));
        results.forEach(result -> System.out.print(result + " "));

        List<Integer> results1 = breakingRecords(List.of(3, 4, 21, 36, 10, 28, 35, 5, 24, 42));
        results1.forEach(result -> System.out.print(result + " "));
    }
}
