/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBN
 */
public class seguroVida {
    public seguroVida(){
        
    }
    public long calcular(
            long valorBase,
            boolean fumador,
            boolean alcoholico,
            boolean drogadicto,
            boolean cardiaco ){
        long total = 0;
        double recFumador = 0, recAlcoholico = 0, recDrogadicto = 0, recCardiaco = 0;  
        if(fumador){
            recFumador = valorBase * 0.10;
        }if (alcoholico) {
            recAlcoholico = valorBase * 0.20;
        }if (drogadicto) {
            recDrogadicto = valorBase * 0.25;
        }if (cardiaco) {
            recCardiaco = valorBase * 0.30;
        }
        total = (long)(valorBase - (recAlcoholico + recCardiaco + recDrogadicto + recFumador));
        return total;
    }
    
    
    
    
    
}
