package desafiodeprogramacao3;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mateus
 * Encontra anagrama par de conjunto de caracteres
 */
public class DesafioDeProgramacao3 {
    public static void main(String[] args) {
        
        String[] arrAnagrama, entradaaux = null;
        String[] comparador = null;
        String anagrama;
        int i, j, contanagrama = 0;
        
        Scanner entrada = new Scanner(System.in);
                
        System.out.println("Digite uma palavra:");
        anagrama = entrada.next();
        arrAnagrama = anagrama.split("(?!^)");
        
        for (i=0; i<=arrAnagrama.length;i++){
            entradaaux[i] = arrAnagrama[i];
            Arrays.sort(entradaaux);
            for(j=0; j < comparador.length; j++){
                if(arrAnagrama[i] == null ? comparador[j] == null : arrAnagrama[i].equals(comparador[j])){
                    contanagrama ++;
                    comparador[j] = arrAnagrama[i];
                    Arrays.sort(comparador);
                    if(Arrays.equals(arrAnagrama, comparador)){
                        contanagrama ++;
                    }
                }else if(j==comparador.length-1){
                    comparador[j] = arrAnagrama[i];
                    Arrays.sort(comparador);
                }     
            }
        }
    }
}
