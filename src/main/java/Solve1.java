import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solve1 {

  public static void main(String[] args) {

  }

  public static int sum(int p1, int p2) {
    return p1 + p2;
  }

  public static int sumArray(List<Integer> ar) {
    return ar.stream().reduce(0, Integer::sum);
  }

  public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

    Integer[] points = new Integer[]{0, 0};

    for (int value = 0; value < a.size(); value++) {
      if (a.get(value).equals(b.get(value))) continue;

      int compare = Integer.compare(a.get(value), b.get(value));

      if (compare == 1) points[0] += 1;
      else if (compare == -1) points[1] += 1;
    }

    return Arrays.asList(points);
  }

  public static long aVeryBigSum(List<Long> ar) {
    return ar.stream().reduce(0L, Long::sum);
  }

  public static int diagonalDifference(List<List<Integer>> arr) {
    int d1 = 0, d2 = 0, m = arr.get(0).size(), j = m - 1;

    for (int i = 0; i < m; i++) {
      d1 += arr.get(i).get(i);
      d2 += arr.get(j).get(i);
      j--;
    }
    return Math.abs(d1 - d2);
  }

  public static void plusMinus(List<Integer> arr) {
    int positives = 0, negatives = 0, zeros = 0, size = arr.size();

    for (int value : arr) {
      if (value == 0) zeros++;
      else if (value > 0) positives++;
      else negatives++;
    }

    String ratioPositive = String.format("%.6f", (double) positives / size);
    String ratioNegative = String.format("%.6f", (double) negatives / size);
    String ratioZeros = String.format("%.6f", (double) zeros / size);
    String lineBreak = "\n";
    System.out.println(ratioPositive + lineBreak + ratioNegative + lineBreak + ratioZeros);
  }

  public static void staircase(int n) {
    for (int value = 1; value <= n; value++) {
      System.out.println(" ".repeat(n - value).concat("#".repeat(value)));
    }

  }

  public static void miniMaxSum(List<Integer> arr) {
    long sum = arr.stream().parallel().mapToLong(x -> x).sorted().skip(1).sum();

    long res = arr.stream().parallel().sorted(Comparator.reverseOrder()).mapToLong(x -> x).skip(1).sum();

    System.out.println(res + " " + sum);
  }

  public static String timeConversion(String s) {
    LocalTime lt = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa"));
    return lt.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
  }

}
