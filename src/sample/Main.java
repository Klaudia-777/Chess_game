package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sample.model.ChessBoard;
import sample.model.Game;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Chess Game");
        primaryStage.setScene(new Scene(root, Pane.USE_COMPUTED_SIZE, Pane.USE_COMPUTED_SIZE));


        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
        Game game = new Game();
        game.startGame();
        game.printBoard();

    }
}
