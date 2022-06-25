
package halaman_konfirmasi_pengguna;
        

import javafx.beans.property.SimpleStringProperty;

public class Daftar_Pengguna {
    private SimpleStringProperty username;
    private SimpleStringProperty detail;
    
    public Daftar_Pengguna() {
        this("", "");
    }
    public Daftar_Pengguna(String username, String detail) {
        this.username = new SimpleStringProperty(username);
        this.detail = new SimpleStringProperty(detail);
    }
    
    public String getUsername () {
        return username.get();
    }
    
    public void setUsername(String un){
    this.username.set(un);
}
    
      public String getDetail () {
        return detail.get();
    }
    
    public void setDetail(String dt){
    this.detail.set(dt);
}
}
