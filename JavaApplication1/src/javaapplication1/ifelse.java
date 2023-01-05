package javaapplication1;
/**
 *
 * @author hcombita
 */
public class ifelse {
    public static void main(String[] args) {
        
        int a = 45;
        
        if (a < 10 || a ==7) { //<, > ==< !=, &&, ||
            System.out.println("verdadero");
        }else{
            System.out.println("falso ");
        }
        
        switch (a) {
            case 1:
                System.out.println("el nunmero es 1");
                break;
            case 2:
                System.out.println("el numero es 2");
                break;
            default:
                System.out.println("es otro numero");
        }
        
        
    }
    
}
