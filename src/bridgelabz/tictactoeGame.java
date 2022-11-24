package bridgelabz;

public class tictactoeGame {
    public static void main(String[] args)
    {
        assign();
    }
    public static void assign(){
        char ch[]=new char[10];
        for(int i=1;i<=ch.length;i++){
            ch[i]=' ';
        }
        for (int i=1;i<ch.length;i++){
            System.out.println(ch[i]);
        }


    }
}
