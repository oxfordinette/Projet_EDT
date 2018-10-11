/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emploi_du_temps;
import emploi_du_temps.Rendez_Vous;
import java.time.LocalDate;
import java.time.LocalTime;



/**
 *
 * @author sandra baraket
 */
public class Emploi_du_Temps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    LocalDate date= LocalDate.now(); 
    LocalTime time = LocalTime.now(); 
    
    System.out.println(date);
    System.out.println(time);
    }
    
}
