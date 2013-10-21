/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.factory;

import com.mysql.jdbc.Connection;
import dao.implement.ImplJabatan;
import dao.interfaces.InterfaceJabatan;
import util.DBUtil;

/**
 *
 * @author lyan
 */
public class FacJabatan {
    private static InterfaceJabatan jabatanDAO;
    
    
    public static InterfaceJabatan getJabatanDAO() {
        DBUtil db = new DBUtil();
        jabatanDAO = new ImplJabatan((Connection) db.getConn());
        return jabatanDAO;
        
    }
}
