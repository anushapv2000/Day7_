package bridgelabz;

import java.util.Scanner;

public class tict {
    static int position=0;
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args)
    {
        char ch[]=assign();
        System.out.println("Player 1");
        char x=choose();
        System.out.println("Player1 chose="+x);
        System.out.println("Player 2");
        char y=choose();
        System.out.println("Player2 chose="+y);
        showBoard(ch);
        System.out.println("Player 1 choose index");
         ch=addvaluetocell(ch,x);
        System.out.println("Player 2 choose index");
        ch=addvaluetocell(ch,y);
    }
    public static char[] assign(){
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
    public static char[] addvaluetocell(char ch[],char val){
        System.out.println("Enter the index");
        int idx=sc.nextInt();
        if(ch[idx]=='\0'){
                ch[idx]=val;
            }
        return ch;

    }

}

