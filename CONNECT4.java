import java.util.Scanner;
import java.util.Arrays;
public class CONNECT4{
    /**
     * CONNECT4
     * 2-player connect-4 game
     * @author Arjan Kahlon
     */
    //board- the board
    static String[][] board = new String [6][7];
    //yfill[column#]- cross-method variables shared by player1 and player2 methods to ensure pieces are always placed at lowest available row in selected column without replacing another value
    static int yfill0=5;
    static int yfill1=5;
    static int yfill2=5;
    static int yfill3=5;
    static int yfill4=5;
    static int yfill5=5;
    static int yfill6=5;
    //wincounter- count for if winchecker methods detect a win for each player, allowing them to subsequently end the game and declare a winner
    static int wincounter1=0;
    static int wincounter2=0;
    //movecounter- running total of moves used, allowing player1 and player2 methods to auto-activate endgame method when the board is filled
    static int movecounter=0;
    //name- default names for each player
    static String name1 = "Player 1";
    static String name2 = "Player 2";
    public static void player1(){
        /**
         * player1
         * facilitates the turn of the first player
         * x1- player1's input for column number
         * returns nothing but continues game by running winchecker1
         */
        if(movecounter==42){
            endgame();
        }
        else{
            System.out.println(Arrays.deepToString(board).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            System.out.println(name1+" (O), enter the column (1-7) of the spot you'd like to place your piece in:");
            Scanner move1=new Scanner(System.in);
            int x1= move1.nextInt();
            x1--;
            if(x1>=0&&x1<=6){
                //the following loops in this branch check if the selected column is already full and restarts the player1 method if it is
                if(yfill0==-1 && x1==0){
                    System.out.println("\f");
                    System.out.println("You can't go in the 1st column!");
                    player1();
                }
                if(yfill1==-1&&x1==1){
                    System.out.println("\f");
                    System.out.println("You can't go in the 2nd column!");
                    player1();
                }
                if(yfill2==-1&&x1==2){
                    System.out.println("\f");
                    System.out.println("You can't go in the 3rd column!");
                    player1();
                }
                if(yfill3==-1&&x1==3){
                    System.out.println("\f");
                    System.out.println("You can't go in the 4th column!");
                    player1();
                }
                if(yfill4==-1&&x1==4){
                    System.out.println("\f");
                    System.out.println("You can't go in the 5th column!");
                    player1();
                }
                if(yfill5==-1&&x1==5){
                    System.out.println("\f");
                    System.out.println("You can't go in the 6th column!");
                    player1();
                }
                if(yfill6==-1&&x1==6){
                    System.out.println("\f");
                    System.out.println("You can't go in the 7th column!");
                    player1();
                }
                //the following loops in this branch place player1's token in the lowest spot in the selected column
                if(x1==0){
                    board[yfill0][x1] = "O";
                    yfill0--;       
                }
                if(x1==1){
                    board[yfill1][x1] = "O";
                    yfill1--;       
                }
                if(x1==2){
                    board[yfill2][x1] = "O";
                    yfill2--;       
                }
                if(x1==3){
                    board[yfill3][x1] = "O";
                    yfill3--;       
                }
                if(x1==4){
                    board[yfill4][x1] = "O";
                    yfill4--;       
                }
                if(x1==5){
                    board[yfill5][x1] = "O";
                    yfill5--;       
                }
                if(x1==6){
                    board[yfill6][x1] = "O";
                    yfill6--;       
                }
                movecounter++;
                System.out.println("\f");
                System.out.println(movecounter+"/42 moves used.");
                winchecker1();
            }
            else{
                //if the selected column number isn't valid, the player1 method is rerun
                System.out.println("\f");
                player1();
            }
        }
    }
    public static void player2(){
        /**
         * player2
         * facilitates the turn of the second player (same as player1 but for player2)
         * x2- player2's input for column number
         * returns nothing but continues game by running winchecker1
         */
        if(movecounter==42){
            endgame();
        }
        else{
            /**
             * player2
             * this method has the same functionality as player1, but for player2
             */
            System.out.println(Arrays.deepToString(board).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            System.out.println(name2+" (X), enter the column (1-7) of the spot you'd like to place your piece in:");
            Scanner move2=new Scanner(System.in);
            int x2= move2.nextInt();
            x2--;
            if(x2>=0&&x2<=6){

                if(yfill0==-1&&x2==0){
                    System.out.println("\f");
                    System.out.println("You can't go in the 1st column!");
                    player2();
                }
                if(yfill1==-1&&x2==1){
                    System.out.println("\f");
                    System.out.println("You can't go in the 2nd column!");
                    player2();
                }
                if(yfill2==-1&&x2==2){
                    System.out.println("\f");
                    System.out.println("You can't go in the 3rd column!");
                    player2();
                }
                if(yfill3==-1&&x2==3){
                    System.out.println("\f");
                    System.out.println("You can't go in the 4th column!");
                    player2();
                }
                if(yfill4==-1&&x2==4){
                    System.out.println("\f");
                    System.out.println("You can't go in the 5th column!");
                    player2();
                }
                if(yfill5==-1&&x2==5){
                    System.out.println("\f");
                    System.out.println("You can't go in the 6th column!");
                    player2();
                }
                if(yfill6==-1&&x2==6){
                    System.out.println("\f");
                    System.out.println("You can't go in the 7th column!");
                    player2();
                }
                if(x2==0){
                    board[yfill0][x2] = "X";
                    yfill0--;       
                }
                if(x2==1){
                    board[yfill1][x2] = "X";
                    yfill1--;       
                }
                if(x2==2){
                    board[yfill2][x2]  = "X";
                    yfill2--;       
                }
                if(x2==3){
                    board[yfill3][x2]  = "X";
                    yfill3--;       
                }
                if(x2==4){
                    board[yfill4][x2]  = "X";
                    yfill4--;       
                }
                if(x2==5){
                    board[yfill5][x2]  = "X";
                    yfill5--;       
                }
                if(x2==6){
                    board[yfill6][x2]  = "X";
                    yfill6--;       
                }
                movecounter++;
                System.out.println("\f");
                System.out.println(movecounter+"/42 moves used.");
                winchecker2();
            }
            else{
                System.out.println("\f");
                player2();
            }
        }
    }
    public static void main(String[] args){
        /**
         * main
         * these lines of code handle the startup processes of the game before intiating the first turn
         * returns nothing but initiates the first turn
         */
        System.out.println("Welcome to Arjan's CONNECT4 game! Rules can be ");
        System.out.println("at wikipedia.org/wiki/Connect_Four/.");
        System.out.println("");
        System.out.println("Type the name of player 1:");
        Scanner namer1 = new Scanner(System.in);
        name1= namer1.next();
        System.out.println("Type the name of player 2:");
        Scanner namer2 = new Scanner(System.in);
        name2= namer2.next();
        for(int y = 0; y < 7; y++){
            for(int x=0; x<6;x++){
                board[x][y] = " ";
            }
        }
        //the above loop fills all spaces in the board as space (empty). the program then initiates the first turn
        player1();
    }
    public static void endgame(){
        /**
         * endgame
         * this method is run when 42 moves have been made without a win, filling up the board and resulting in a draw
         * returns nothing but ends the game
         */
        System.out.println("\f");
        System.out.println(Arrays.deepToString(board).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        System.out.println("Game over- draw! Board is filled. Better luck next time!");
    }
    public static void winchecker1(){
        /**
         * winchecker1
         * this method checks if player1 has won the game after placing a piece
         * row/column- checks value of place in the board using for loops   wincounter1- allows method to check for win of any type
         * returns nothing but either ends the game if a win is detected or continues it by initiating player2's turn
         */
        //the below branch checks for a horizontal win
        for(int row=0; row<6;row++){
            for(int column=0; column<4;column++){
                if(column<=4){
                    if(board[row][column].equals("O") &&board[row][column+1].equals("O")&& board[row][column+2].equals("O")&&board[row][column+3].equals("O")){
                        wincounter1++;
                    }
                }
            }
        }
        //the below branch checks for a vertical win
        for(int row=0; row<3;row++){
            for(int column=0; column<7;column++){
                if(row<=3){
                    if(board[row][column].equals("O") &&board[row+1][column].equals("O")&& board[row+2][column].equals("O")&&board[row+3][column].equals("O")){
                        wincounter1++;
                    }
                }
            }
        }
        //the below branch checks for a diagonal (top left to bottom right) win
        for(int row=0; row<3;row++){
            for(int column=0; column<4;column++){
                if(column<=4){
                    if(board[row][column].equals("O") &&board[row+1][column+1].equals("O")&& board[row+2][column+2].equals("O")&&board[row+3][column+3].equals("O")){
                        wincounter1++;
                    }
                } 
            }
        }
        //the below branch checks for a vertical win in the opposite direction (bottom left to top tight)
        for(int row=5; row>=3;row--){
            for(int column=0; column<4;column++){
                if(column>=0){
                    if(board[row][column].equals("O") &&board[row-1][column+1].equals("O")&& board[row-2][column+2].equals("O")&&board[row-3][column+3].equals("O")){
                        wincounter1++;
                    }
                } 
            }
        }
        // the below branch checks if a win by player1 has been detected. if it has, it declares player1 the winner; if not, it initiates player2's turn
        if(wincounter1>0){
            System.out.println("\f");
            System.out.println(Arrays.deepToString(board).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            System.out.println("Game over- "+name1+" wins!");
        }else{
            player2();
        }
    }
    public static void winchecker2(){
         /**
         * winchecker2
         * row/column- checks value of place in the board using for loops   wincounter2- allows method to check for win of any type (same as winchecker1 but for player2)
         * returns nothing but either ends the game if a win is detected or continues it by initiating player1's turn
         */
        for(int row=0; row<6;row++){
            for(int column=0; column<4;column++){
                if(column<=4){
                    if(board[row][column].equals("X") &&board[row][column+1].equals("X")&& board[row][column+2].equals("X")&&board[row][column+3].equals("X")){
                        wincounter2++;
                    }
                }
            }
        }
        for(int row=0; row<3;row++){
            for(int column=0; column<7;column++){
                if(row<=3){
                    if(board[row][column].equals("X") &&board[row+1][column].equals("X")&& board[row+2][column].equals("X")&&board[row+3][column].equals("X")){
                        wincounter2++;
                    }
                }
            }
        }
        for(int row=0; row<3;row++){
            for(int column=0; column<4;column++){
                if(column<=4){
                    if(board[row][column].equals("X") &&board[row+1][column+1].equals("X")&& board[row+2][column+2].equals("X")&&board[row+3][column+3].equals("X")){
                        wincounter2++;
                    }
                }
            }
        }
        for(int row=5; row>=3;row--){
            for(int column=0; column<4;column++){
                if(column>=0){
                    if(board[row][column].equals("X") &&board[row-1][column+1].equals("X")&& board[row-2][column+2].equals("X")&&board[row-3][column+3].equals("X")){
                        wincounter2++;
                    }
                }
            }
        }
        if(wincounter2>0){
            System.out.println("\f");
            System.out.println(Arrays.deepToString(board).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
            System.out.println("Game over- "+name2+" wins!");
        }else{
            player1();
        }
    }
}