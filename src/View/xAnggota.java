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

public class xAnggota {

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
    private JFXTreeTableView<?> table_anggota;

    @FXML
    private JFXTextField text_Namasiswa;

    @FXML
    private JFXTextField text_Kelas;

    @FXML
    private JFXButton buttonSimpan;

    @FXML
    private JFXButton buttonEdit;

    @FXML
    private JFXButton buttonHapus;


    @FXML
    void editAnggota(ActionEvent event) {

    }

    @FXML
    void hapusAnggota(ActionEvent event) {

    }

    @FXML
    void simpanAnggota(ActionEvent event) {

    }


}