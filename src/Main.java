import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {
    System.out.println("Anzahl der Zeilen: ");
    Scanner sc = new Scanner(System.in);
    int zeilen = sc.nextInt();
    if (zeilen>60){
      System.out.println("Zeilen Maximum ist 60");
      zeilen = 60;
    }
    for(int i = 0; i<= zeilen; i++){
      String line = "*";
      for(int o = 1; o <= i; o++){
       line = line +"*";
      }
      System.out.println(line);
    }

    System.out.println("Schachbrett");
    int[][] chessBoard = new int[8][8];
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        chessBoard[i][j] = (j + 1)+i;
      }
    }
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        System.out.printf("%3d ", chessBoard[i][j]);
      }
      System.out.println();

  }
}}


