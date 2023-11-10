package javacontest.introduction;

import java.util.Scanner;

public class DataTypes {
  public static void main(String[] args) {
    canBeFitted();
  }

  public static void canBeFitted() {
    Scanner scanner = new Scanner(System.in);

    int count = scanner.nextInt();

    for (int i = 1; i <= count; i++) {

      try {
        long number = scanner.nextLong();

        System.out.printf("%d can be fitted in:\n", number);

        if ((byte)number == number) System.out.println("* byte");
        if ((short)number == number) System.out.println("* short");
        if ((int)number == number) System.out.println("* int");

        System.out.println("* long");

      } catch (Exception ex) {
        String s = scanner.next();
        System.out.printf("%s can't be fitted anywhere.\n", s);
      }
    }

    scanner.close();

  }

}
