package hangman.model;

import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest {
  /*
  * Clases de equivalencia
  *       PC = puntaje correcto
  *       PI = puntaje incorrecto
  *       E = pertenece
  *       OriginalScore:
  *           PC E I & (0 <= PC <= 100)
  *           PI E I & (0 > PC > 100)
  *       BonusScore:
  *           PC E I & (PC >= 0)
  *           PI E I & (PC < 0)
  *       PowerBonusScore:
  *           PC E I & (PC >= 0)
  *           PI E I & (PC < 0)
  *           PC E I & (0 <= PC <= 500)
  * Limites de frontera:
  *       OriginalScore:
  *           Se inicia con 100 puntos
  *           El puntaje minimo es 0
  *       BonusScore:
  *           El juego inicia con 0 puntos
  *           El puntaje minimo es 0
  *       PowerBonusScore:
  *           El juego inicia con 0 puntos
  *           El puntaje minimo es 0
  *           El puntaje maximo es 500
  */

}
