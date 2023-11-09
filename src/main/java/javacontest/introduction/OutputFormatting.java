package javacontest.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OutputFormatting {

  public static void main(String[] args) {
    String equals = "=".repeat(32);
    int maxLeftChars = 15;
    List<Input> inputs = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    for (int i = 1; i <= 3; i++) {
      String[] readLine = sc.nextLine().split(" ");
      inputs.add(new Input(readLine[0], readLine[1]));
    }

    System.out.println(equals);

    inputs.forEach(x -> {
      String spaces = " ".repeat(maxLeftChars - x.word.length());
      String zeros = "0".repeat(3 - x.number.length());
      System.out.println(x.word + spaces + zeros + x.number);
    });

    System.out.println(equals);
  }

  public static class Input {
    public String word;
    public String number;

    public Input(String word, String number) {
      this.word = word;
      this.number = number;
    }
  }
}
