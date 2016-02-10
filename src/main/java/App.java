import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap();

      model.put("template", "templates/inputPlayer1.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


    get("/results", (request, response) -> {
      HashMap model = new HashMap();
      String player1input = request.queryParams("player1input");
      String player2input = request.queryParams("player2input");
      String winner = checkWinner(player1input, player2input);

      model.put("player1input", player1input);
      model.put("player2input", player2input);
      model.put("winner", winner);
      model.put("template", "templates/results.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }


public static String checkWinner(String player1Input, String player2Input) {
  String winner = "";

  if (player1Input.equals("rock") && player2Input.equals("scissors")) {
    winner = "Player one wins!";
  } else if (player1Input.equals("paper") && player2Input.equals("rock")) {
    winner = "Player one wins!";
  } else if (player1Input.equals("scissors") && player2Input.equals("paper")) {
    winner = "Player one wins!";
  } else if (player1Input.equals(player2Input)) {
    winner = "It's a tie!";
  } else {
    winner = "Player two wins!";
  } return winner;

 }
}
