/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.entity;

/**
 *
 * @author lyan
 */
public class EntTamu {
    private String id_tamu;
    private String nama_tamu;
    private String alamat_tamu;
    private String telp_tamu;

    public String getId_tamu() {
        return id_tamu;
    }

    public void setId_tamu(String id_tamu) {
        this.id_tamu = id_tamu;
    }

    public String getNama_tamu() {
        return nama_tamu;
    }

    public void setNama_tamu(String nama_tamu) {
        this.nama_tamu = nama_tamu;
    }

    public String getAlamat_tamu() {
        return alamat_tamu;
    }

    public void setAlamat_tamu(String alamat_tamu) {
        this.alamat_tamu = alamat_tamu;
    }

    public String getTelp_tamu() {
        return telp_tamu;
    }

    public void setTelp_tamu(String telp_tamu) {
        this.telp_tamu = telp_tamu;
    }
    
}
