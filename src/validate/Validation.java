package validate;

import java.util.Random;
import java.util.Scanner;

public class Validation {

  private static Scanner sc = new Scanner(System.in);

  public static int randomId(int min, int max) {
    Random random = new Random();
    return random.nextInt(max - min + 1) + min;
  }

  public static int inputInt(String msg, int min, int max) {
    System.out.print(msg);
    while (true) {
      String input = sc.nextLine();
      try {
        int number = Integer.parseInt(input);
        if (number < min || number > max) {
          System.out.print("Please input between " + min + " - " + max + ": ");
          continue;
        }
        return number;
      } catch (Exception e) {
        System.out.print("Please input an integer number: ");
      }
    }
  }

  public static String inputString(String msg) {
    System.out.print(msg);
    while (true) {
      String input = sc.nextLine();
      if(input.equals("")) {
        System.out.print("Please input a non-empty string: ");
        continue;
      }
      return input;
    }
  }

  public static double inputDouble(String msg, double min, double max) {
    System.out.print(msg);
    while (true) {
      String input = sc.nextLine();
      try {
        double number = Double.parseDouble(input);
        if (number < min || number > max) {
          System.out.print("Please input between " + min + " - " + max + ": ");
          continue;
        }
        return number;
      } catch (Exception e) {
        System.out.print("Please input an double number: ");
      }
    }
  }
}
