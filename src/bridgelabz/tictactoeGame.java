package bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class tictactoeGame {
    static Scanner sc =new Scanner(System.in);
    static char ch[]=new char[10];
    public static void main(String[] args)
    {
        ch=assignvalue();
       if(toss()=="heads") {
           System.out.println("Player 1 starts");
           char x = choose();
           System.out.println("Player1 chose=" + x);
           System.out.println("Player 2");
           char y = choose();
           System.out.println("Player2 chose=" + y);
           showBoard(ch);
           System.out.println("Player 1 choose index");
           int idx = checkcell(ch);
           checkfreespace(ch, x, idx);
           System.out.println("Player 2 choose index");
           idx = checkcell(ch);
           checkfreespace(ch, y, idx);
       }
       else {
           System.out.println("Player 2 starts");
           char y = choose();
           System.out.println("Player1 chose=" + y);
           System.out.println("Player 2");
           char x = choose();
           System.out.println("Player2 chose=" + x);
           showBoard(ch);
           System.out.println("Player 2 choose index");
           int idx = checkcell(ch);
           checkfreespace(ch, y, idx);
           System.out.println("Player 1 choose index");
           idx = checkcell(ch);
           checkfreespace(ch, x, idx);
       }
    }
    public static char[] assignvalue(){

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
    public static int checkcell(char ch[]){
        System.out.println("Enter the index");
        int idx=sc.nextInt();
        if(ch[idx]=='\0'){
            return idx;
        }
        return 0;
        //return ch;
    }
    public static void checkfreespace(char ch[],char val,int idx){
        if(idx==0)
        {
            System.out.println("Cannot make the move,index occupied");;
        }
        else{
            ch[idx]=val;
        }

    }
    public static String  toss(){
        String t[]={"heads","tails"};

        Random r=new Random();
        int v=r.nextInt(2);
        return t[v];
    }
}
