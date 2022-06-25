/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package halaman_konfirmasi_pengguna;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author ACER_ASPIRE E14
 */
public class FXMLDocumentController implements Initializable {
    
    ListArray data;
    
    @FXML
    private TableView tvKonfirmasi;
        @FXML
    private TableColumn<Daftar_Pengguna, String> tcUsername;
            @FXML
    private TableColumn<Daftar_Pengguna, String> tcDetail;
    
@FXML
    private void handleHapusAction(ActionEvent event) {
        int selectedIndex = tvKonfirmasi.getSelectionModel().getSelectedIndex();
        data.getData().remove(selectedIndex);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       tcUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
        tcDetail.setCellValueFactory(new PropertyValueFactory<>("detail"));

        data = new ListArray();
        data.setDummy();
        tvKonfirmasi.setItems(data.getData());
    }    
    
}
