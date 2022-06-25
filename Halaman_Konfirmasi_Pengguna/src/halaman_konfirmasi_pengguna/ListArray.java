/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package halaman_konfirmasi_pengguna;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ListArray {
    private ObservableList<Daftar_Pengguna> listData;

    public ListArray() {
        listData = FXCollections.observableArrayList();
    }

    public ObservableList<Daftar_Pengguna> getData() {
        return this.listData;
    }

    public void setData(String username, String detail) {
        listData.add(new Daftar_Pengguna(username, detail));
    }

    public void setDummy() {
        listData.add(new Daftar_Pengguna("Si paling membutuhkan","urgen banget!!!"));
        listData.add(new Daftar_Pengguna("Naur12","perlu 3 hari dari sekarang!"));
    }
}
