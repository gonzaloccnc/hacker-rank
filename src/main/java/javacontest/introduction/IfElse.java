package javacontest.introduction;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IfElse {

  public static void main(String[] args) {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    /*
      If N is odd, print Weird
      If N is even and in the inclusive range of 2 to 5, print Not Weird
      If N is even and in the inclusive range of 6 to 20, print Weird
      If N is even and greater than 20 , print Not Weird
     */
    try {
      int N = Integer.parseInt(bf.readLine().trim());
      // 1. N no es par -> 2. N es mayor a o igual a 6 o N es menor o igual a 20
      // 3- N es mayor a 20 o N es menor a 6
      if (N % 2 != 0 || (N >= 6 && N <= 20)) System.out.println("Weird");
      else System.out.println("Not Weird");

      bf.close();
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}
