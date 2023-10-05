import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[][] board=new char[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                board[i][j]=' ';

        Scanner input=new Scanner(System.in);
        int antalInput=0;
        int r,k,spillerNr=1;
        boolean vundet=false;
        while(vundet==false && antalInput<9) {
            System.out.println("Spiller "+ spillerNr+" angiv række og kolonne");
            r = input.nextInt();
            k = input.nextInt();
            antalInput++;
            if(spillerNr==1)
                board[r][k] = 'X';
            else
                board[r][k] = 'O';
            udskrivBoard(board);
            if(checkFundetVinder(board)==1) {
                System.out.println("Spiller 1 har vundet");
                vundet = true;
            }
            if(checkFundetVinder(board)==2) {
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
       /* System.out.printf("_________________\n");
        System.out.printf("| %c  |  %c  | %c  |\n",a[0][0],a[0][1],a[0][2]);
        System.out.printf("_________________\n");
        System.out.printf("| %c  |  %c  | %c  |\n",a[1][0],a[1][1],a[1][2]);
        System.out.printf("_________________\n");
        System.out.printf("| %c  |  %c  | %c  |\n",a[2][0],a[2][1],a[2][2]);
        System.out.printf("_________________\n");*/

        for(int i=0;i<3;i++){
            System.out.printf("_________________\n");
            System.out.printf("| %c  |  %c  | %c  |\n",a[i][0],a[i][1],a[i][2]);
        }
        System.out.printf("_________________\n");
    }


    public static int checkFundetVinder(char [][] a){
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

        for(int k=0;k<3;k++){
            antalX = 0;
            antalO = 0;
            for(int r=0;r<3;r++){
                if (a[r][k] == 'X')
                    antalX++;
                if(a[r][k]=='O')
                    antalO++;
            }
            if(antalX==3)
                return 1;
            if(antalO==3)
                return 2;
        }

        if(a[0][0]=='X' && a[1][1]=='X' && a[2][2]=='X')
            return 1;
        if(a[0][2]=='X' && a[1][1]=='X' && a[2][0]=='X')
            return 1;
        if(a[0][0]=='0' && a[1][1]=='0' && a[2][2]=='0')
            return 2;
        if(a[0][2]=='0' && a[1][1]=='0' && a[2][0]=='0')
            return 2;



        return 0;
    }
}