import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[][] board=new char[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                board[i][j]=' ';

        Scanner input=new Scanner(System.in);
        System.out.println("Spiller 1 angiv række og kolonne");
        int r,k;
        r=input.nextInt();
        k=input.nextInt();
        board[r][k]='X';


        udskrivBoard(board);
    }

    public static void udskrivBoard(char [][] a){
        System.out.printf("_________________\n");
        System.out.printf("| %c  |  %c  | %c  |\n",a[0][0],a[0][1],a[0][2]);
        System.out.printf("_________________\n");
        System.out.printf("| %c  |  %c  | %c  |\n",a[1][0],a[1][1],a[1][2]);
        System.out.printf("_________________\n");
        System.out.printf("| %c  |  %c  | %c  |\n",a[2][0],a[2][1],a[2][2]);
        System.out.printf("_________________\n");
    }
}