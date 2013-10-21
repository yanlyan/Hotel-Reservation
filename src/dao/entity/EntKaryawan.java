/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.entity;

/**
 *
 * @author lyan
 */
public class EntKaryawan {
    private String id_karyawan;
    private String pwd_karyawan;
    private String nama_karyawan;
    private String alamat_karyawan;
    private String telp_karyawan;
    private EntJabatan id_jabatan;

    public String getId_karyawan() {
        return id_karyawan;
    }

    public void setId_karyawan(String id_karyawan) {
        this.id_karyawan = id_karyawan;
    }

    public String getPwd_karyawan() {
        return pwd_karyawan;
    }

    public void setPwd_karyawan(String pwd_karyawan) {
        this.pwd_karyawan = pwd_karyawan;
    }

    public String getNama_karyawan() {
        return nama_karyawan;
    }

    public void setNama_karyawan(String nama_karyawan) {
        this.nama_karyawan = nama_karyawan;
    }

    public String getAlamat_karyawan() {
        return alamat_karyawan;
    }

    public void setAlamat_karyawan(String alamat_karyawan) {
        this.alamat_karyawan = alamat_karyawan;
    }

    public String getTelp_karyawan() {
        return telp_karyawan;
    }

    public void setTelp_karyawan(String telp_karyawan) {
        this.telp_karyawan = telp_karyawan;
    }

    public EntJabatan getId_jabatan() {
        return id_jabatan;
    }

    public void setId_jabatan(EntJabatan id_jabatan) {
        this.id_jabatan = id_jabatan;
    }
    
    
}
