/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.factory;

import com.mysql.jdbc.Connection;
import dao.implement.ImplKaryawan;
import dao.interfaces.InterfaceKaryawan;
import util.DBUtil;

/**
 *
 * @author lyan
 */
public class FacKaryawan {
    private static InterfaceKaryawan karyawanDAO;
    
    
    public static InterfaceKaryawan getKaryawanDAO() {
        DBUtil db = new DBUtil();
        karyawanDAO = new ImplKaryawan((Connection) db.getConn());
        return karyawanDAO;
        
    }
    
    
}
