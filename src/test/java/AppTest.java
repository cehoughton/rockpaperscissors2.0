import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
public void checkWinner_rockBeatsScissors_PlayerOneWins() {
  App testApp = new App();
  assertEquals("Player one wins!", testApp.checkWinner("rock", "scissors"));
}



}
