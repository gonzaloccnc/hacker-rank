package javacontest.introduction;

import java.util.Scanner;

public class JavaEndOfFile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    for (int i = 1; scanner.hasNext(); i++) {
      String word = scanner.nextLine();
      System.out.println(i + " " +word);
    }

    scanner.close();
  }
}
