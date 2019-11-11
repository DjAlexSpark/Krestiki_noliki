package krestiki_noliki.v4;

public class ArrayDoings {
    private char DOT_X = 'X';
    private char DOT_O='O';
    private char DOT_N='*';
    private int size ;
   // private char[][] arr;
String s;
    public static char[][] getFull(char[][]arr,int size, char DOT_N){
        ArrayDoings a= new ArrayDoings();
        for(int i=0;i<size;i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j]=DOT_N;
            }
        }
        return arr;
    }
    static char[][] getPrint(char [][]arr){
        System.out.println("\n  1 2 3");
        for (int i = 0; i < 3; i++) {
            if (i > 0) System.out.println();
            System.out.print(i + 1);
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + arr[i][j]);
            }
        }
        return arr;
    }
//getter DOTs
    public char getDOT_X() {
        return DOT_X;
    }

    public char getDOT_O() {
        return DOT_O;
    }

    public char getDOT_N() {
        return DOT_N;
    }
//end

//Size
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
//end

 /*   //getArr
    public char[][] getArr() {

        return arr;
    }
*/
  /*  public char[][] setArr(char[][] arr) {
       // public static char[][] getFull(int size, char DOT_N){
        this.arr = arr;
            for(int i=0;i<size;i++) {
                for (int j = 0; j < size; j++) {
                    arr[i][j]=getDOT_N();

                }
            }
            return arr;
        }*/

    }

