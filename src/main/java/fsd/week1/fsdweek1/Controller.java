package fsd.week1.fsdweek1;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller
{
    @FXML
    private Label promptLabel;

    @FXML
    private TextField enterName;
    @FXML
    protected void handleSubmitButtonPressed()
    {
        System.out.println(enterName.getText());
        enterName.setText("");
    }

    public void handleCancelButtonPressed()
    {
        enterName.setText("");
    }

    public void handleQuitButtonPressed()
    {
        Platform.exit();
    }
}