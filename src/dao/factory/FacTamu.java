/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.factory;

import com.mysql.jdbc.Connection;
import dao.implement.ImplTamu;
import dao.interfaces.InterfaceTamu;
import util.DBUtil;

/**
 *
 * @author lyan
 */
public class FacTamu {
    private static InterfaceTamu tamuDAO;
    
    public static InterfaceTamu getTamuDAO(){
        DBUtil db = new DBUtil();
        tamuDAO = new ImplTamu((Connection) db.getConn());
        return tamuDAO;
    }
}
