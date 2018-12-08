package sample;


import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import sample.model.ChessBoard;
import sample.model.Figure;
import sample.model.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Controller {


    public Pane board;
    Game game= new Game();

    public Controller() {
    }

    public void setBoard(){


    }


    public void onButtonClicked(MouseEvent mouseEvent) {
        List<Node> Buttons = new ArrayList<>(board.getChildren());

        System.out.println("asdfghjk");
        Button rect=((Button) mouseEvent.getSource());
        System.out.println(rect.getId());
        int vertical =Integer.parseInt(rect.getId().substring(0,1));
        int horizontal =Integer.parseInt(rect.getId().substring(1,2));
        Figure figure = ChessBoard.at(vertical,horizontal);
        System.out.println(figure.getColor());
        List<String> positionsToBeColoured = figure.getPossibleMoves().stream().map(pair -> pair.first.toString()+pair.second.toString())
                .collect(Collectors.toList());
        Buttons.stream().filter(node -> node.getId().contains("w")).forEach(node -> node.setStyle("-fx-background-color: white"));
        Buttons.stream().filter(node -> node.getId().contains("b")).forEach(node -> node.setStyle("-fx-background-color: black"));
        for (Node it:Buttons) {
            if(positionsToBeColoured.contains(it.getId().substring(0,2))) it.setStyle("-fx-background-color: lime");
        }


    }
}


