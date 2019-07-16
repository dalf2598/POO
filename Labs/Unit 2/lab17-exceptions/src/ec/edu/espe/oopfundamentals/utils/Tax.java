
package ec.edu.espe.oopfundamentals.utils;

/**
 *
 * @author David Lopez 
 */
public class Tax {
    
    public static float computeIva(float base){
        
        float iva;
        iva = base*0.12f;
        
        return iva;
    }
    
    public static float computeTotal(float base){
        
        float total;
        total = base+computeIva(base);
        
        return total;
    }
}