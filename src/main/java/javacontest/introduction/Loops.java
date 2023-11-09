package javacontest.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Loops {

  public static void main(String[] args) throws IOException {
    //  solve1();
    solve2();
  }

  public static void solve1 () throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(bufferedReader.readLine().trim());

    for (int i = 1; i <= 10; i++) {
      System.out.println(N + " x " + i + " = " + N * i);
    }

    bufferedReader.close();
  }

  public static void solve2 () {
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();

    for (int i = 1; i <= q; i++) {

      int a = sc.nextInt();
      int b = sc.nextInt();
      int n = sc.nextInt();

      long acc = 0;
      var eval1 = (long) (a + Math.pow(2, 0) * b);
      System.out.print(eval1 + " ");

      for (int j = 1; j < n; j++) {
        var eval2 = Math.pow(2, j) * b;

        acc += (long) (eval2);

        System.out.print(acc + eval1 + " ");
      }

      System.out.println();
    }

    sc.close();

  }

}
