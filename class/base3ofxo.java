 import java.util.*;
public class base3ofxo {
    public static char board[][]={{'-','-','-'},{'-','-','-'},{'-','-','-'}};
    public static void main(String[] args) {
        for(int k=0;k<9;k++){
         Scanner sc = new Scanner(System.in);
        int c =sc.nextInt();
        
         xo(c);
         base(board);
        }    
     }
    public static void base(char board[][] ){
     for(int i=0;i<board.length;i++){
            if(i<3){
                System.out.print(" | ");
            }
        for(int j=0;j<board.length;j++){
              System.out.print(board[i][j]);
            if(j<3){
                System.out.print(" | ");
            }
        }   
        System.out.println(); 
    }
    }
    public static void xo(int c){
    switch(c){
        case 1:
        board[0][0] = 'o';
        break;
        case 2:
        board[0][1] = 'o';
        break;
        case 3:
        board[0][2] = 'o';
        break;
        case 4:
        board[1][0] = 'o';
        break;
        case 5:
        board[1][1] = 'o';
        break;
        case 6:
        board[1][2] = 'o';
        break;
        case 7:
        board[2][0] = 'o';
        break;
        case 8:
        board[2][1] = 'o';
        break;
        case 9:
        board[2][2] = 'o';
        break;
        default:
            System.out.println("there is no day available");
            break;
}
    }
}




