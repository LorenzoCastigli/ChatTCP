/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatTCP;

/**
 *
 * @author User
 */
public class MainClient {
    
    public static void main(String[] args){
        
        Client c = new Client(2000,"localhost");
        
        c.avviaClient();
    }
}
