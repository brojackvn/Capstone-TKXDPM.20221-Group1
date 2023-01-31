package utils;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
/**
 * Contains the configs for AIMS Project
 */
public class Configs {

	// api constants
	public static final String GET_BALANCE_URL = ".................";
	public static final String GET_VEHICLECODE_URL = ".................";
	public static final String PROCESS_TRANSACTION_URL = ".................";
	public static final String RESET_URL = ".....................";

	// demo data
	public static final String POST_DATA = "{"
			+ " \"secretKey\": \"...............\" ,"
			+ " \"transaction\": {"
			+ " \"command\": \"pay\" ,"
			+ " \"cardCode\": \"..........\" ,"
			+ " \"owner\": \".........\" ,"
			+ " \"cvvCode\": \"..........\" ,"
			+ " \"dateExpried\": \"........\" ,"
			+ " \"transactionContent\": \"Pei debt\" ,"
			+ " \"amount\": ............ "
			+ "}"
		+ "}";
	public static final String TOKEN = "................";

	// database Configs
	public static final String DB_NAME = "ecobike";
	public static final String DB_USERNAME = System.getenv("DB_USERNAME");
	public static final String DB_PASSWORD = System.getenv("DB_PASSWORD");

	public static String CURRENCY = "VND";
	public static float PERCENT_VAT = 10;

	// static resource
	public static final String POPUP_PATH = "/views/popup.fxml";
	public static final String STATION_SCREEN_PATH = "/views/Station-Screen.fxml";
	public static final String BIKE_STATION_PATH = "/views/Bike-Station-Screen.fxml";
	public static final String IMAGE_PATH = "src/main/resources/assets/image";
	public static final String BAR_CODE_SCREEN = "/views/Barcode-Form.fxml";
	public static final String BIKE_DETAILS_SCREEN_PATH = "/views/Bike-Details-Screen.fxml";
	public static final String DEPOSIT_FORM_PATH = "/views/Deposit-Form.fxml";
	public static final String ERROR_NOTIFICATION_PATH = "/views/Error-Notification.fxml";
	public static final String HOME_PATH  = "/views/Home-Screen.fxml";
	public static final String PAYMENT_SCREEN_PATH = "/views/Payment-Screen.fxml";
	public static final String RENTAL_BIKE_SCREEN_PATH = "/views/ViewRentingBike.fxml";
	public static final String RESULT_SCREEN_PATH = "/views/Result-Screen.fxml";
	public static final String SPLASH_SCREEN_PATH = "/views/Splash-Screen.fxml";
	public static final String STATION_DETAILS_SCREEN_PATH = "/views/Station-Details-Screen.fxml";
	public static final String BIKE_SCREEN = "/views/Bike.fxml";
	public static Font REGULAR_FONT = Font.font("Segoe UI", FontWeight.NORMAL, FontPosture.REGULAR, 24);

}
