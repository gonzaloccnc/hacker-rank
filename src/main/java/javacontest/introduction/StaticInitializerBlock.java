package javacontest.introduction;

import java.util.Scanner;

public class StaticInitializerBlock {

  public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      int base = scanner.nextInt();
      int height = scanner.nextInt();

      if (base <= 0 || height <= 0) {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        return;
      }

      System.out.println(base*height);

  }
}
