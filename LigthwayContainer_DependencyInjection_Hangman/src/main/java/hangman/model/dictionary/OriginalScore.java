/********************************
* file: GameScore.java
* author: Brayan Macias
          Carolina Morales
* date last modified: 11/02/2021
* purpose: This is the model component for the original game score.

*********************************/

package hangman.model;
import hangman.model.dictionary.HangmanDictionary;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class OriginalScore extends GameScore {
  /*******************************************************************
  * Calculate the score
  * @pre the score starts with 100 points
  * @pos calculated GameScore
  * @param correctCount, correct score
  * @param incorrectCount, icorrect score
  * @throws ScoreException, NEGATIVE_NUMBER if the score is negative
  * @throws ScoreException, MINIMUM_SCORE IF the minimum score is 0
  ********************************************************************/
  public int calculateScore (int correctCount, int incorrectCount) throws HangmanException{
    private int initialScore = 100;
    if (initialScore < 0){
      throw new HangmanException(HangmanException.NO_SCORE);

    }
    else{
      
    }

  }
}
