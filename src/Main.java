import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[][] board=new char[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                board[i][j]=' ';

        Scanner input=new Scanner(System.in);

        int r,k,spillerNr=1;
        boolean vundet=false;
        while(vundet==false) {
            System.out.println("Spiller "+ spillerNr+" angiv række og kolonne");
            r = input.nextInt();
            k = input.nextInt();
            if(spillerNr==1)
                board[r][k] = 'X';
            else
                board[r][k] = 'O';
            udskrivBoard(board);
            if(checkFunderVinder(board)==1) {
                System.out.println("Spiller 1 har vundet");
                vundet = true;
            }
            if(checkFunderVinder(board)==2) {
                System.out.println("Spiller 2 har vundet");
                vundet = true;
            }
            if(spillerNr==1)
                spillerNr=2;
            else
                spillerNr=1;
        }
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


    public static int checkFunderVinder(char [][] a){
        int antalX=0;
        int antalO=0;
        for(int i=0;i<3;i++) {
            antalX = 0;
            antalO = 0;
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == 'X')
                    antalX++;
                if(a[i][j]=='O')
                    antalO++;
            }
            if(antalX==3)
                return 1;
            if(antalO==3)
                return 2;
        }
        return 0;
    }
}