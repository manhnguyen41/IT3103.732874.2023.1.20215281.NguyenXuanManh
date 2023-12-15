package lab05.GUIProject.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class PainterController {
    private Paint penColor;
    @FXML
    private Pane drawingAreaPane;

    @FXML
    private ToggleGroup identical;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Circle newCircle = new Circle(event.getX(),
                event.getY(), 4, penColor);
        drawingAreaPane.getChildren().add(newCircle);
    }

    @FXML
    void eraserButtonPressed(ActionEvent event) {
        penColor = Color.WHITE;
    }

    @FXML
    void penButtonPressed(ActionEvent event) {
        penColor = Color.BLACK;
    }
}
