import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap();

      model.put("template", "templates/input.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());



  }


public static String checkWinner(String player1Input, String player2Input) {
  String winner = "";

  if (player1Input == "rock" && player2Input == "scissors") {
    winner = "Player one wins!";
  } else if (player1Input == "paper" && player2Input == "rock") {
    winner = "Player one wins!";
  } else if (player1Input == "scissors" && player2Input == "paper") {
    winner = "Player one wins!";
  } else if (player1Input == player2Input) {
    winner = "It's a tie!";
  } else {
    winner = "Player two wins!";
  }return winner;

}
}
