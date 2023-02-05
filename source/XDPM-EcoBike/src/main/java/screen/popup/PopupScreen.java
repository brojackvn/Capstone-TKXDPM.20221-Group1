package screen.popup;

import java.io.IOException;
import java.sql.SQLException;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import screen.home.HomeScreenHandler;
import utils.Configs;
import screen.BaseScreenHandler;


public class PopupScreen extends BaseScreenHandler{
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private ImageView tickicon;

    @FXML
    private Label message;

    public PopupScreen(Stage stage) throws IOException{
        super(stage, Configs.POPUP_PATH);
    }

    private static PopupScreen popup(String message, String imagepath, Boolean undecorated) throws IOException{
        PopupScreen popup = new PopupScreen(new Stage());
        if (undecorated) popup.stage.initStyle(StageStyle.UNDECORATED);
        popup.message.setText(message);
        if (imagepath.contains("green")) {
            popup.anchorPane.setStyle("-fx-border-color: #00a13f; -fx-background-color: #fefefe");
            popup.message.setTextFill(Color.rgb(0,163,63));
        } else {
            popup.anchorPane.setStyle("-fx-border-color: #FF0000; ; -fx-background-color: #fefefe");
            popup.message.setTextFill(Color.RED);
        }
        popup.setImage(imagepath);
        return popup;
    }

    public static void success(String message) throws IOException{
        popup(message, Configs.IMAGE_PATH + "/" + "tickgreen.png", true).show(true);
    }

    public static void error(String message) throws IOException{
        popup(message, Configs.IMAGE_PATH + "/" + "tickerror.png", true).show(true);
    }

    public static PopupScreen loading(String message) throws IOException{
        return popup(message, Configs.IMAGE_PATH + "/" + "loading.gif", true);
    }

    public void setImage(String path) {
        super.setImage(tickicon, path);
    }

    public void show(Boolean autoclose) {
        super.show();
        if (autoclose) close(2);
    }

    public void show(double time) {
        super.show();
        close(time);
    }

    public void close(double time){
        PauseTransition delay = new PauseTransition(Duration.seconds(time));
        delay.setOnFinished( event -> stage.close());
        delay.play();
    }
}
