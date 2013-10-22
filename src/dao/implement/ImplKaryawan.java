/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.implement;

import com.mysql.jdbc.Connection;
import dao.entity.EntKaryawan;
import dao.interfaces.InterfaceKaryawan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import util.StringUtil;

/**
 *
 * @author lyan
 */
public class ImplKaryawan implements InterfaceKaryawan{
    private Connection conn;

    public ImplKaryawan(Connection conn) {
        this.conn = conn;
    }
    
    
    @Override
    public List<EntKaryawan> selectAllKaryawan() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EntKaryawan selectOneKaryawan(String id_karyawan) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EntKaryawan login(String id_karyawan, String password_karyawan) throws Exception {
       EntKaryawan karyawan = null;
       StringUtil strUtil = new StringUtil(id_karyawan);
       String sql = "SELECT `id_karyawan`, `pwd_karyawan`, `nama_karyawan`, `alamat_karyawan`, `telp_karyawan`, `id_jabatan` FROM `tb_karyawan` WHERE `id_karyawan`=? AND `pwd_karyawan`=? AND `id_jabatan`=?";
       PreparedStatement st = this.conn.prepareStatement(sql);
       st.setString(1, id_karyawan);
       st.setString(2, password_karyawan);
       st.setString(3, strUtil.getIdJabatan());
       ResultSet rs = st.executeQuery();
       if (rs.next()) {
           karyawan = new EntKaryawan();
           karyawan.setId_karyawan(rs.getString(1));
           karyawan.setPwd_karyawan(rs.getString(2));
           karyawan.setNama_karyawan(rs.getString(3));
           karyawan.setAlamat_karyawan(rs.getString(4));
           karyawan.setTelp_karyawan(rs.getString(5));
           karyawan.setId_jabatan((new ImplJabatan(this.conn)).selectOneJabatan(rs.getString(6)));
       }
       return karyawan;
    }
    
}
