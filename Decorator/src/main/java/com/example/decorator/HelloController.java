package com.example.decorator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import model.*;

public class HelloController {
    @FXML
    public Pane paneLight;
    public Pane panePresent;
    public Pane paneTree;
    public Pane paneStar;
    public Pane paneRabbit;

    @FXML
    public void initialize() {
        paneTree.toFront();
        ChristmasTree tree = new ChristmasTreeImpl();
        tree.draw(paneTree);

    }

    public void addLights(ActionEvent actionEvent) {
        paneLight.toFront();
        ChristmasTree tree = new Girland(new ChristmasTreeImpl());
        tree.draw(paneLight);
    }

    public void addPresents(ActionEvent actionEvent) {
        panePresent.toFront();
        ChristmasTree tree = new Presents(new ChristmasTreeImpl());
        tree.draw(panePresent);
    }

    public void addStar(ActionEvent actionEvent) {
        paneStar.toFront();
        ChristmasTree tree = new Star(new ChristmasTreeImpl());
        tree.draw(paneStar);
    }

    public void addRabbit(ActionEvent actionEvent) {
        paneRabbit.toFront();
        ChristmasTree tree = new Rabbit(new ChristmasTreeImpl());
        tree.draw(paneRabbit);
    }

    public void addAll(ActionEvent actionEvent) {

        paneLight.toFront();
        ChristmasTree tree = new Presents(new Girland(new Star(new Rabbit(new ChristmasTreeImpl()))));
        tree.draw(paneLight);
    }

    public void del(ActionEvent actionEvent) {

        paneLight.getChildren().clear();
        paneStar.getChildren().clear();
        panePresent.getChildren().clear();
        paneTree.getChildren().clear();
        paneRabbit.getChildren().clear();
        ChristmasTree tree = new ChristmasTreeImpl();
        tree.draw(paneTree);
    }

}