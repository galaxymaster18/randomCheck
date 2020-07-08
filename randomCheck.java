package com.randomCheck;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class randomCheck {
  private static final Random rndm = new Random();
  private static final Scanner scnnr = new Scanner(System.in);
  private static int[] nmbrs;
  private static int cntr = 0, lst = 0;

  public static void main(String[] args) {
    while (true) {
      System.out.print("How many numbers to check? ");
      nmbrs = new int[scnnr.nextInt()];
      System.out.print("How many trys? ");
      cntr = scnnr.nextInt();
      long time = System.currentTimeMillis();
      for (int a = 0; a < cntr; a++) {
        ++nmbrs[rndm.nextInt(nmbrs.length)];
      }
      System.out.println("Script done with " + (System.currentTimeMillis() - time) + "ms");
      for (int i = 0; i < nmbrs.length; i++) {
        System.out.println(i + "=" + nmbrs[i]);
      }
      Arrays.sort(nmbrs);
      System.out.println("Range is " + (nmbrs[nmbrs.length - 1] - nmbrs[0]));
    }
  }
}
