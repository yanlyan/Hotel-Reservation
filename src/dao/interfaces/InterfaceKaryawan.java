/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

import dao.entity.EntKaryawan;
import java.util.List;

/**
 *
 * @author lyan
 */
public interface InterfaceKaryawan {
    public List<EntKaryawan> selectAllKaryawan() throws Exception;
    public EntKaryawan selectOneKaryawan(String id_karyawan) throws Exception;
    public EntKaryawan login(String id_karyawan, String password_karyawan) throws Exception;
}
