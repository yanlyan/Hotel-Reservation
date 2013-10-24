/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

import dao.entity.EntTamu;
import java.util.List;

/**
 *
 * @author lyan
 */
public interface InterfaceTamu {
    public List<EntTamu> getAllTamu() throws Exception;
    public void insertTamu(EntTamu tamu) throws Exception;
    public void deleteTamu(String id_tamu) throws Exception;
    public void updateTamu(String id_tamu) throws Exception;
    public EntTamu getOneTamu(String id_tamu) throws Exception;
    public List<EntTamu> searchTamu(String field, String param) throws Exception;
    
}
