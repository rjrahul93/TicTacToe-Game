 /* This Project created by Rahul Jaiswar.
 * Linkedin: https://www.linkedin.com/in/rjrahul93
 * GitHub: https://github.com/rjrahul93
 * EMail: rjrahul9322@gmail.com
 */

import java.util.Scanner;
public class TicTacToe {

    static String b1=" ";
    static String b2=" ";
    static String b3=" ";
    static String b4=" ";
    static String b5=" ";
    static String b6=" ";
    static String b7=" ";
    static String b8=" ";
    static String b9=" ";

    static String winner=" ";
    static String player1=" ";
    static String player2=" ";
    static int p1Count=0;
    static int p2Count=0;
    static int draw=0;
    static int count=0;

    
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter First Player name");
        player1=sc.nextLine();
        System.out.println("Now, Please enter Second Player name");
        player2=sc.nextLine();

        while(true)
        {
        System.out.println("Which Player want to Play First??");
        System.out.println("1."+player1);
        System.out.println("2."+player2);

        int p=sc.nextInt();
        if(p==1)
        {
            user1();
        }
        else{
            user2();
        }
        
        if(winner==player1)
        {
            p1Count++;

        }
        else if(winner==player2)
        {
            p2Count++;
        }
        else{
            draw++;
        }

        if(count==9)
        {
            System.out.println("============================");
            if(winner!=" ")
            {
                System.out.println(winner +" is winner");
            }
            else{
                System.out.println("oops, Draw");
            }
            System.out.println("============================");
            System.out.println(b1 +" "+b2+" "+b3);
            System.out.println(b4 +" "+b5+" "+b6);
            System.out.println(b7 +" "+b8+" "+b9);
            System.out.println("============================");
            System.out.println(player1 +" : " +p1Count);
            System.out.println(player2 +" : " +p2Count);
            System.out.println("Draw/Tie : " +draw);
            System.out.println("============================");

        }
        System.out.println("Want To Continue Game?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        int c=sc.nextInt(); //continue game or not

        if(c==1)
        {
            //if user choose yes then we need to reset all var with default;
            // 2nd way we can use non static var then we don't need to write below code;
            count=0;
            b1=" "; b2=" "; b3=" "; b4=" "; b5=" "; b6=" "; b7=" "; b8=" "; b9=" ";
            winner=" ";

        }
        else{
            break;
        }
    }

    }

//user1

    public static void user1()
    {
        Scanner sc=new Scanner(System.in);

        while(count!=9){
        System.out.println(player1 + " Please Choose Block Between 1 to 9");
        int a=sc.nextInt();

        if(a==1)
        {
            if(b1==" ")
            {
                b1="O";
                count++;
                checkWin1();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }
        else if(a==2)
        {
            if(b2==" ")
            {
                b2="O";
                count++;
                checkWin1();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }
        else if(a==3)
        {
            if(b3==" ")
            {
                b3="O";
                count++;
                checkWin1();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }
        else if(a==4)
        {
            if(b4==" ")
            {
                b4="O";
                count++;
                checkWin1();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }
        else if(a==5)
        {
            if(b5==" ")
            {
                b5="O";
                count++;
                checkWin1();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }
        else if(a==6)
        {
            if(b6==" ")
            {
                b6="O";
                count++;
                checkWin1();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }
        else if(a==7)
        {
            if(b7==" ")
            {
                b7="O";
                count++;
                checkWin1();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }
        else if(a==8)
        {
            if(b8==" ")
            {
                b8="O";
                count++;
                checkWin1();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }
        else if(a==9)
        {
            if(b9==" ")
            {
                b9="O";
                count++;
                checkWin1();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }
        }
    }

 /* This Project created by Rahul Jaiswar.
 * Linkedin: https://www.linkedin.com/in/rjrahul93
 * GitHub: https://github.com/rjrahul93
 * EMail: rjrahul9322@gmail.com
 */

//user2

    public static void user2()
    {
        Scanner sc=new Scanner(System.in);

        while(count!=9){
        System.out.println(player2 + " Please Choose Block Between 1 to 9");
        int a=sc.nextInt();

        if(a==1)
        {
            if(b1==" ")
            {
                b1="X";
                count++;
                checkWin2();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }
        else if(a==2)
        {
            if(b2==" ")
            {
                b2="X";
                count++;
                checkWin2();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }
        else if(a==3)
        {
            if(b3==" ")
            {
                b3="X";
                count++;
                checkWin2();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }
        else if(a==4)
        {
            if(b4==" ")
            {
                b4="X";
                count++;
                checkWin2();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }
        else if(a==5)
        {
            if(b5==" ")
            {
                b5="X";
                count++;
                checkWin2();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }
        else if(a==6)
        {
            if(b6==" ")
            {
                b6="X";
                count++;
                checkWin2();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }
        else if(a==7)
        {
            if(b7==" ")
            {
                b7="X";
                count++;
                checkWin2();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }
        else if(a==8)
        {
            if(b8==" ")
            {
                b8="X";
                count++;
                checkWin2();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }
        else if(a==9)
        {
            if(b9==" ")
            {
                b9="X";
                count++;
                checkWin2();
            }
            else{
                System.out.println("Sorry this Block is already in use, Choose diffrent Block");
            }
        }

        }

    }
//checkwin
    public static void checkWin1()
    {
        System.out.println("============================");
        System.out.println(b1 +" "+b2+" "+b3);
        System.out.println(b4 +" "+b5+" "+b6);
        System.out.println(b7 +" "+b8+" "+b9);
        System.out.println("============================");

        if(b1=="O" && b2=="O" && b3=="O")
        {
            winner=player1;
            count=9;

        }
        else if(b4=="O" && b5=="O" && b6=="O")
        {
            winner=player1;
            count=9;
        }
         else if(b7=="O" && b8=="O" && b9=="O")
        {
            winner=player1;
            count=9;
        }
        else if(b1=="O" && b4=="O" && b7=="O")
        {
            winner=player1;
            count=9;
        }
         else if(b2=="O" && b5=="O" && b8=="O")
        {
            winner=player1;
            count=9;
        }
         else if(b3=="O" && b6=="O" && b9=="O")
        {
            winner=player1;
            count=9;
        }
         else if(b7=="O" && b5=="O" && b3=="O")
        {
            winner=player1;
            count=9;
        }
         else if(b1=="O" && b5=="O" && b9=="O")
        {
            winner=player1;
            count=9;
        }
        else{
            user2();
        }
    }

//checkwin
     public static void checkWin2()
    {
        System.out.println("============================");
        System.out.println(b1 +" "+b2+" "+b3);
        System.out.println(b4 +" "+b5+" "+b6);
        System.out.println(b7 +" "+b8+" "+b9);
        System.out.println("============================");
       
        if(b1=="X" && b2=="X" && b3=="X")
        {
            winner=player2;
            count=9;
        }
        else if(b4=="X" && b5=="X" && b6=="X")
        {
            winner=player2;
            count=9;
        }
         else if(b7=="X" && b8=="X" && b9=="X")
        {
            winner=player2;
            count=9;
        }
        else if(b1=="X" && b4=="X" && b7=="X")
        {
            winner=player2;
            count=9;
        }
        else if(b2=="X" && b5=="X" && b8=="X")
        {
            winner=player2;
            count=9;
        }
         else if(b3=="X" && b6=="X" && b9=="X")
        {
            winner=player2;
            count=9;
        }
         else if(b7=="X" && b5=="X" && b3=="X")
        {
            winner=player2;
            count=9;
        }
         else if(b1=="X" && b5=="X" && b9=="X")
        {
            winner=player2;
            count=9;
        }
        else{
            user1();
        }
    }
}

 /* This Project created by Rahul Jaiswar.
 * Linkedin: https://www.linkedin.com/in/rjrahul93
 * GitHub: https://github.com/rjrahul93
 * EMail: rjrahul9322@gmail.com
 */