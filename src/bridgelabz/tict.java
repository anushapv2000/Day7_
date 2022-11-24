package bridgelabz;

import java.util.Scanner;
import java.util.SortedMap;

public class tict {
    static int position=0;
    static char ch[]=new char[10];
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args)
    {
        ch=assign();
        System.out.println("Player 1");
        char x=choose();
        System.out.println("Player1 chose="+x);
        System.out.println("Player 2");
        char y=choose();
        System.out.println("Player2 chose="+y);
        showBoard(ch);
        System.out.println("Player 1 choose index");
         int idx=addvaluetocell(ch);
         checkfreespace(ch,x,idx);
        System.out.println("Player 2 choose index");
        idx=addvaluetocell(ch);
        checkfreespace(ch,x,idx);
    }
    public static char[] assign(){

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
    public static int addvaluetocell(char ch[]){
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

}

