package lab05.AimsProject.screen;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import lab05.AimsProject.Cart;
import lab05.AimsProject.media.Media;
import javafx.scene.control.cell.PropertyValueFactory;
import lab05.AimsProject.media.Playable;

public class CartScreenController {
    private Cart cart;

    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediaCategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;

    @FXML
    private Label lbTotalCost;

    public CartScreenController(Cart cart) {
        super();
        this.cart = cart;
//        loader.load();
    }

    @FXML
    private void initialize() {
        colMediaTitle.setCellValueFactory(
                new PropertyValueFactory<Media, String>("title"));
        colMediaCategory.setCellValueFactory(
                new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(
                new PropertyValueFactory<Media, Float>("cost"));
        tblMedia.setItems(this.cart.getItemsOrdered());
        lbTotalCost.setText(Double.toString(cart.totalCost()) + " $");

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        tblMedia.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Media>() {
                    @Override
                    public void changed(ObservableValue<? extends Media> observable, Media oldValue,
                                        Media newValue) {
                        if (newValue != null) {
                            updateButtonBar(newValue);
                        }
                    }
                });
    }

    void updateButtonBar(Media media){
        btnRemove.setVisible(true);
        btnPlay.setVisible(media instanceof Playable);
    }

    @FXML
    void btnRemovePressed (ActionEvent event) throws Exception {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
        lbTotalCost.setText(Double.toString(cart.totalCost()) + " $");
    }

    @FXML
    void btnPlaceOrderPressed(ActionEvent event) {

    }

    @FXML
    void btnPlayPressed(ActionEvent event) {

    }
}