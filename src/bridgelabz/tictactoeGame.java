package bridgelabz;

import java.util.Scanner;

public class tictactoeGame {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args)
    {
        char ch[]=assignvalue();
        System.out.println("Player 1");
        char x=choose();
        System.out.println("Player1 chose="+x);
        System.out.println("Player 2");
        char y=choose();
        System.out.println("Player2 chose="+y);
        showBoard(ch);
    }
    public static char[] assignvalue(){
        char ch[]=new char[10];
        for(int i=1;i<ch.length;i++){
            ch[i]='\0';
        }
//        for (int i=1;i<ch.length;i++){
//            System.out.println(ch[i]);
//        }
        return ch;
    }
    public static char choose(){
        System.out.println("Enter the input X or O");
        char val=sc.next().charAt(0);
        return val;
    }
    public static void showBoard(char ch[]) {
        System.out.println("before choosing");
        for (int i : ch) {
            System.out.println(i);
        }
    }
}
