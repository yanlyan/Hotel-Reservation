/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.implement;

import com.mysql.jdbc.Connection;
import dao.entity.EntJabatan;
import dao.entity.EntKaryawan;
import dao.interfaces.InterfaceJabatan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author lyan
 */
public class ImplJabatan implements InterfaceJabatan{
    private Connection conn;

    public ImplJabatan(Connection conn) {
        this.conn = conn;
    }


    @Override
    public List<EntJabatan> selectAllJabatan() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EntJabatan selectOneJabatan(String id_jabatan) throws Exception {
       EntJabatan jabatan = null;
       String sql = "SELECT `id_jabatan`, `nama_jabatan` FROM `tb_jabatan` WHERE `id_jabatan`=?";
       PreparedStatement st = this.conn.prepareStatement(sql);
       st.setString(1, id_jabatan);
       ResultSet rs = st.executeQuery();
       if (rs.next()) {
           jabatan = new EntJabatan();
           jabatan.setId_jabatan(rs.getString(1));
           jabatan.setNama_jabatan(rs.getString(2));
       }
       return jabatan;
    }
    
    
}
