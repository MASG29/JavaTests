import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        //Declare and initialize a 4x3 2D array of doubles called `scores` below

        double[][] scores = {{80.4, -1, -1}, {96.2, -1, -1}, {100.0, -1, -1}, {78.9, -1, -1}};


        System.out.println(Arrays.deepToString(scores));

        //Manually enter the scores for the second exam below
        scores[0][1] = 89.7;
        scores[1][1] = 90.5;
        scores[2][1] = 93.6;
        scores[3][1] = 88.1;

        System.out.println(Arrays.deepToString(scores));

        //Declare and initialize an empty 4x2 2D array of double values called `newScores` below
        double[][] newScores = new double[4][2];

        //Use `for` loops to copy the scores below

        for (int i = 0; i < newScores.length; i++) {
            for (int j = 0; j < newScores[i].length; j++) {
                if(newScores[i][j] == -1){

                } else {
                    newScores[i][j] = scores[i][j];
                }

            }

        }


        System.out.println(Arrays.deepToString(newScores));

        //Iterate through the `newScores` 2D array and use `if` statement to add 2 additional points below
        for (double[] score : newScores)
            for (double score1 : score){
                if (score1 < 90){
                    score1 += 2;
                }
            }
        System.out.println(Arrays.deepToString(newScores));
    }
}