/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dao.entity.EntJabatan;
import dao.factory.FacJabatan;
import dao.interfaces.InterfaceJabatan;
import java.security.MessageDigest;

/**
 *
 * @author lyan
 */
public class StringUtil {
    private String origin;
    
    public StringUtil(String origin) {
        this.origin = origin;
    }
    
    public String md5() throws Exception{
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(origin.getBytes());
        byte[] digest = md.digest();
        StringBuilder sb = new StringBuilder();
        for(byte b : digest){
            sb.append(Integer.toHexString((int) (b & 0xff)));
        }
        
        return sb.toString();
    }
    
     public String getIdJabatan() throws Exception{
        String id;
        InterfaceJabatan daoJabatan = FacJabatan.getJabatanDAO();
        EntJabatan modelJabatan = daoJabatan.selectOneJabatan(origin.substring(0, 2));
        if(modelJabatan != null){
            id = modelJabatan.getId_jabatan();
        } else {
            id = "NA";
        }
        
        return id;
    }
}
