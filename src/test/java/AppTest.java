import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void checkWinner_rockBeatsScissors_PlayerOneWins() {
    App testApp = new App();
    assertEquals("Player one wins!", testApp.checkWinner("rock", "scissors"));
}

  @Test
  public void checkWinner_paperBeatsRock_PlayerOneWins() {
    App testApp = new App();
    assertEquals("Player one wins!", testApp.checkWinner("paper", "rock"));
  }

 @Test
 public void checkWinner_scissorsBeatsPaper_PlayerOnesWins() {
   App testApp = new App();
   assertEquals("Player one wins!", testApp.checkWinner("scissors", "paper"));
 }

 @Test
 public void checkWinner_tieCase_true() {
   App testApp = new App();
   assertEquals("It's a tie!", testApp.checkWinner("scissors", "scissors"));
 }

}
