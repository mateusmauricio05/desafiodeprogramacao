package desafiodeprogramacao1;

/**
 *
 * @author Mateus
 * Gera uma escada de tamanho n = 6
 */
public class DesafioDeProgramacao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String escada, degrau; 
        int n;
        
        for(n = 0 ;n<=6;n++){
            escada=" ";
            degrau="*";
            System.out.println(escada.repeat(6-n) + degrau.repeat(n) );
        }
    }
    
}

