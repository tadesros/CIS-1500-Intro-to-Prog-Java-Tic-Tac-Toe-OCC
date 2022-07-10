import java.util.ArrayList;

public class tickTacToe {

    private ArrayList<ArrayList<Character>> board;

    public tickTacToe(){
        board = new ArrayList<>();

        for (int row = 0; row < 3; row++) {
            board.add(new ArrayList<>());
            for (int column = 0; column < 3; column++) {
                board.get(row).add(' ');
            }
        }
    }

    public boolean isTied(){

        for(ArrayList<Character> row : board){

            if(row.contains(' ')){
                //Found a space return false
                return false;
            }
        }
        //If their s a winner, we can't be tied
        return !hasWinner();
    }

    public boolean hasWinner(){
       return hasWinnerByRow() || hasWinnerByColumn() || hasWInnerByDiagonal();
    }

    public boolean hasWinnerByRow(){
        for(ArrayList<Character> row: board){
            if(row.get(0) != ' ' && row.get(0) == row.get(1) && row.get(0) == row.get(2)){
                return true;
            }
        }
        return false;
    }

    public boolean hasWinnerByColumn
            (){
        for(ArrayList<Character> row: board){
            if(row.get(0) != ' ' && row.get(0) == row.get(1) && row.get(0) == row.get(2)){
                return true;
            }
        }
        return false;
    }




    public boolean isGameOver(){
        return isTie() || hasWinner();
    }
}
