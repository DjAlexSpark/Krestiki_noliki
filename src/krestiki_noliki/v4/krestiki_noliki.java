package krestiki_noliki.v4;

public class krestiki_noliki {


    public static void main(String[] args) {
        //int a=1;
        
       ArrayDoings o= new ArrayDoings();//создаем объект из класа с действиями
        o.setSize(3);
       // System.out.println("o.getsize");
        char[][] arr = new char[o.getSize()][o.getSize()];//создать масссив  в главной

        o.getFull(arr,o.getSize(),o.getDOT_N()); //заполнить массив
        o.getPrint(arr);
        do {
            //переработать цикл для проверки на победу сразу после хода
            arr = Turns.humanTurn(arr, o.getSize(), o.getDOT_X());//ход человека(проверка на победу если да то финиш)
            if (Turns.checkWin(arr,o.getDOT_X())){
                o.getPrint(arr);
                System.out.println("\nhuman win");
                break;
            }
            o.getPrint(arr);//печать массива после хода
            arr = Turns.computerTurn(arr, o.getSize(), o.getDOT_O());//ход компа(проверка на победу если да то финиш)

            if (Turns.checkWin(arr,o.getDOT_O())){
                o.getPrint(arr);
                System.out.println("\ncomp win");
                break;
            }
            o.getPrint(arr);//печать массива после хода
        }while(true);
    }
}