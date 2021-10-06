import java.util.Scanner;

class Exam4_4_5_6 {
  public static void main(String[] args) {
    int[] Catalogue = new int[3];
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < Catalogue.length; i++) {
      System.out.print((i + 1) + "人目の点数を入力してください > ");
      Catalogue[i] = scan.nextInt();
    }
    int max, min, posmax, posmin;
    max = Integer.MIN_VALUE;
    min = Integer.MAX_VALUE;
    posmax = -1;
    posmin = -1;
    for (int i = 0; i < Catalogue.length; i++) {
      int v = Catalogue[i];
      int n = i + 1;
      if (max < v) {
        max = v;
        posmax = n;
      }
      if (v < min) {
        min = v;
        posmin = n;
      }
    }
    System.out.printf("最高得点は%d人目の%d点です%n", posmax, max);
    System.out.printf("最低得点は%d人目の%d点です%n", posmin, min);
  }
}