package javacontest.introduction;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double cash = scanner.nextDouble();

    String u = NumberFormat.getCurrencyInstance(Locale.US).format(cash);
    String i = NumberFormat.getInstance(new Locale("en", "IN")).format(cash);
    String c = NumberFormat.getCurrencyInstance(Locale.CHINA).format(Double.parseDouble(String.format("%.2f", cash)));
    String f = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(cash);

    System.out.println("US: " + u);
    System.out.println("India: Rs." + i);
    System.out.println("China: " + c);
    System.out.println("France: " + f);

    scanner.close();
  }
}
