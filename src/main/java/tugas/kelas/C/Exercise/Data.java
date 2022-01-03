/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.kelas.C.Exercise;

/**
 *
 * @author asus
 */
public class Data {
    private String ID;
     private String name  ; 
     private String alamat;
     private String noKTP;
     
     public Data(){
             super()  ;  
     }
      
     public Data(String ID, String name, String alamat, String noKTP){
        super(); 
        this.ID = ID;
        this.name = name;
        this.alamat = alamat;
        this.noKTP = noKTP;
        
     }
}
