import java.util.Arrays;
import java.util.Scanner;

public class MatrisTranspoz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");

        System.out.print("How many item in row:  ");
        int row = input.nextInt();

        System.out.print("How many item in col:  ");
        int col = input.nextInt();

        int[][] MyArrayList = new int[row][col];
        int[][] CopyArrayList = new int[col][row];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(i + ". row of " + j + " columns:   ");
                MyArrayList[i][j]= input.nextInt();
            }
        }
        for(int i = 0 ; i< row; i++){
            for(int j = 0; j<col; j++){
                CopyArrayList[j][i] = MyArrayList[i][j];
            }
        }
        for (int i = 0; i <MyArrayList.length ; i++){
            for(int j = 0 ; j<CopyArrayList[i].length;j++){
                System.out.print(CopyArrayList[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
