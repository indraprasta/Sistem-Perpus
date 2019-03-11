package View;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class xKunjungan {

    @FXML
    private AnchorPane anchor;

    @FXML
    private JFXButton back;
	
	@FXML
    private JFXTextField text_idanggota;

    @FXML
    private JFXButton buttonProsesKunjungan;

    @FXML
    void back(ActionEvent event) throws IOException {
        anchor.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent parent = loader.load();
        anchor.getChildren().add(parent);
    }

    @FXML
    void prosesKunjunagn(ActionEvent event) {

    }

}
