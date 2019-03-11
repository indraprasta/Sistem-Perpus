package View;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class xPeminjaman {

    @FXML
    private AnchorPane anchor;

    @FXML
    private JFXButton back;
	
	 @FXML
    private JFXTextField text_idanggota;

    @FXML
    private JFXTextField text_idbuku;

    @FXML
    private JFXButton buttonProses;


    @FXML
    void prosesPeminjaman(ActionEvent event) {

    }

    @FXML
    void back(ActionEvent event) throws IOException {
        anchor.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent parent = loader.load();
        anchor.getChildren().add(parent);
    }

}