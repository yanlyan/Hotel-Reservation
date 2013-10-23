/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.implement;

import com.mysql.jdbc.Connection;
import dao.entity.EntTamu;
import dao.interfaces.InterfaceTamu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lyan
 */
public class ImplTamu implements InterfaceTamu{
    Connection conn;

    public ImplTamu(Connection conn) {
        this.conn = conn;
    }
    
    @Override
    public List<EntTamu> getAllTamu() throws Exception {
        List<EntTamu> allTamu = new ArrayList<>();
        String sql = "SELECT * FROM tb_tamu";
        PreparedStatement st = this.conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            EntTamu tamu = new EntTamu();
            tamu.setId_tamu(rs.getString(1));
            tamu.setNama_tamu(rs.getString(2));
            tamu.setAlamat_tamu(rs.getString(3));
            tamu.setTelp_tamu(rs.getString(4));
            allTamu.add(tamu);
        }
        return allTamu;
    }

    @Override
    public void insertTamu(EntTamu tamu) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteTamu(String id_tamu) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateTamu(String id_tamu) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EntTamu getOneTamu(String id_tamu) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
