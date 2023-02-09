package model;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Rabbit extends TreeDecorator{

    public Circle[] circle = new Circle[9];

    public Rabbit(ChristmasTree tree) {
        super(tree);
    }

    public void draw(Pane paneRabbit) {
        super.draw(paneRabbit);
        drawRabbit(paneRabbit);
    }

    private void drawRabbit(Pane paneRabbit) {

        /*Polygon ese = new Polygon();
        ese.setFill(Color.BLACK);
        ese.getPoints().addAll(new Double[]{0.0, 0.0, 120.0, 90.0});

        Polygon ese2 = new Polygon();
        ese2.setFill(Color.BLACK);
        ese2.getPoints().addAll(new Double[]{0.0, 0.0, 100.0, 70.0});*/

        Ellipse body = new Ellipse();
        body.setCenterX(70.0f);
        body.setCenterY(380.0f);
        body.setRadiusX(35.0f);
        body.setRadiusY(45.0f);
        body.setFill(Color.GRAY);
        paneRabbit.getChildren().addAll(body);

        Ellipse body2 = new Ellipse();
        body2.setCenterX(70.0f);
        body2.setCenterY(320.0f);
        body2.setRadiusX(25.0f);
        body2.setRadiusY(25.0f);
        body2.setFill(Color.GRAY);
        paneRabbit.getChildren().addAll(body2);

        Ellipse body3 = new Ellipse();
        body3.setCenterX(60.0f);
        body3.setCenterY(270.0f);
        body3.setRadiusX(10.0f);
        body3.setRadiusY(35.0f);
        body3.setFill(Color.GRAY);
        paneRabbit.getChildren().addAll(body3);

        Ellipse body4 = new Ellipse();
        body4.setCenterX(83.0f);
        body4.setCenterY(270.0f);
        body4.setRadiusX(10.0f);
        body4.setRadiusY(35.0f);
        body4.setFill(Color.GRAY);
        paneRabbit.getChildren().addAll(body4);

        Ellipse body5 = new Ellipse();
        body5.setCenterX(80.0f);
        body5.setCenterY(315.0f);
        body5.setRadiusX(3.0f);
        body5.setRadiusY(3.0f);
        body5.setFill(Color.BLACK);
        paneRabbit.getChildren().addAll(body5);

        Ellipse body6 = new Ellipse();
        body6.setCenterX(62.0f);
        body6.setCenterY(315.0f);
        body6.setRadiusX(3.0f);
        body6.setRadiusY(3.0f);
        body6.setFill(Color.BLACK);
        paneRabbit.getChildren().addAll(body6);

        Ellipse body7 = new Ellipse();
        body7.setCenterX(71.0f);
        body7.setCenterY(320.0f);
        body7.setRadiusX(2.0f);
        body7.setRadiusY(2.0f);
        body7.setFill(Color.LIGHTPINK);
        paneRabbit.getChildren().addAll(body7);

        /*ese.setStroke(Color.BLACK);
        ese.setStrokeWidth(2);

        ese2.setStroke(Color.BLACK);
        ese2.setStrokeWidth(2);*/

        //paneRabbit.getChildren().addAll(circle[0], circle[1], circle[2], circle[3], circle[4], circle[5], circle[6], circle[7], circle[8], ese, ese2);
    }
}
