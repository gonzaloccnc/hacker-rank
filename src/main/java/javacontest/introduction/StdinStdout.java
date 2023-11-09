package javacontest.introduction;

import java.util.Scanner;

public class StdinStdout {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int p1 = in.nextInt();
    double p2 = in.nextDouble();
    in.nextLine();
    String p3 = in.nextLine();

    System.out.println("String: " + p3);
    System.out.println("Double: " + p2);
    System.out.println("Int: " + p1);
  }
}
