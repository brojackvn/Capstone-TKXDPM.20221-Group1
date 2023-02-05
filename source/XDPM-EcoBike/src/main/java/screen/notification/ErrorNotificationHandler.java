package screen.notification;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import screen.BaseScreenHandler;
import screen.FXMLScreenHandler;
import screen.home.HomeScreenHandler;
import utils.Configs;
import utils.Utils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

public class ErrorNotificationHandler extends BaseScreenHandler {
    public static Logger LOGGER = Utils.getLogger(ErrorNotificationHandler.class.getName());

    @FXML
    private Button home;

    @FXML
    private ImageView logo;

    private HomeScreenHandler homeScreen;
    /**
     * @param screenPath
     * @throws IOException
     */
    public ErrorNotificationHandler(Stage stage, String screenPath) throws IOException {
        super(stage, screenPath);

        home.setOnMouseClicked(e -> {
            LOGGER.info("User clicked to return Home Screen");
            try {
                this.homeScreen = new HomeScreenHandler(stage, Configs.HOME_PATH);
                setScreenTitle("Home");
                homeScreen.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });

        logo.setOnMouseClicked(e -> {
            LOGGER.info("User clicked to return Home Screen");
            try {
                this.homeScreen = new HomeScreenHandler(stage, Configs.HOME_PATH);
                setScreenTitle("Home");
                homeScreen.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
    }
}
