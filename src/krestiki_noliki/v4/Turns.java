package krestiki_noliki.v4;

import java.util.Scanner;

public class Turns  {


    private static Scanner scanner = new Scanner(System.in);
    public static char[][] humanTurn(char[][]arr, int size,char DOT)throws  ArrayIndexOutOfBoundsException {

        int x;
        int y;
        do {
               System.out.println("\nвведите строку и столбец через пробел");
            y = scanner.nextInt() - 1;//1 1
            x = scanner.nextInt() - 1;
            System.out.println("end of scanners");
            arr[x][y] = DOT;
        } while (!isCellValid( x,  y,  arr, size, DOT));//false

        //System.out.println(y+""+x);

        System.out.println("end of humanTurn");
        return arr;
    }


    public static char[][] computerTurn (char[][]arr, int size,char DOT){
        int x;
        int y;
        do {
           // System.out.println("\nвведите строку и столбец через пробел");
            y = (int)(Math.random()*3);
            x = (int)(Math.random()*3);//   System.out.println(123);
            System.out.println(x+" "+y);
            arr[x][y] = DOT;
        } while (!isCellValid( x,  y,  arr, size, DOT));
        System.out.println("end of computerTurn");
        return arr;
    }



    public static boolean checkWin(char[][] map, char DOT){
        if (((map[0][0] == DOT)&(map[0][1] == DOT)&(map[0][2]== DOT))|
                ((map[1][0] == DOT)&(map[1][1] == DOT)&(map[1][2]==DOT))|
                ((map[2][0] == DOT)&(map[2][1] == DOT)&(map[2][2]==DOT))|
                ((map[0][0] == DOT)&(map[1][0] == DOT)&(map[2][0]==DOT))|
                ((map[0][1] == DOT)&(map[1][1] == DOT)&(map[2][1]==DOT))|
                ((map[0][2] == DOT)&(map[1][2] == DOT)&(map[2][2]==DOT))|
                ((map[0][0] == DOT)&(map[1][1] == DOT)&(map[2][2]==DOT))|
                ((map[0][2] == DOT)&(map[1][1] == DOT)&(map[2][0]==DOT))) {
            System.out.println("end of chekWin ith true");
            return true;
        }else{
            System.out.println("end of checkWIn false");
            return false;}

    }
    private static boolean isCellValid(int x, int y, char[][] arr, int size,char DOT) {
      ArrayDoings o= new ArrayDoings();
        boolean result = true;
        if (arr[x][y] == o.getDOT_N()) {//todo срвнивать не с DOT ,а с DOT_N
            System.out.println("end of isCellValid with false wrong arr symbol");
            return false;
        }
        if (x >= size || y >= size || x < 0 || y < 0) {
            System.out.println("end of isCellValid with false out of numbers");
            return false;
        }
        return result;
    }
    }

