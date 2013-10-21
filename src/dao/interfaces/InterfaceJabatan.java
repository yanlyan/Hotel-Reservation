/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

import dao.entity.EntJabatan;
import java.util.List;

/**
 *
 * @author lyan
 */
public interface InterfaceJabatan {
    public List<EntJabatan> selectAllJabatan() throws Exception;
    public EntJabatan selectOneJabatan(String id_jabatan) throws Exception;
}
