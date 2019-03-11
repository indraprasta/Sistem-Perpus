package View;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class xDatabuku {

    @FXML
    private AnchorPane anchor;

    @FXML
    private JFXButton back;

    @FXML
    void back(ActionEvent event) throws IOException {
        anchor.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent parent = loader.load();
        anchor.getChildren().add(parent);
    }
	    @FXML
    private JFXTreeTableView<?> table_buku;

    @FXML
    private JFXTextField text_Nomorbuku;

    @FXML
    private JFXButton buttonSimpan;

    @FXML
    private JFXButton buttonEdit;

    @FXML
    private JFXButton buttonHapus;

    @FXML
    private JFXTextField text_Judulbuku;

    @FXML
    private JFXTextField text_Pengarangbuku;

    @FXML
    private JFXTextField text_Penerbitbuku;

    @FXML
    void editBuku(ActionEvent event) {

    }

    @FXML
    void hapusBuku(ActionEvent event) {

    }

    @FXML
    void simpanBuku(ActionEvent event) {

    }

}