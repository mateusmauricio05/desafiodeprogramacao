package desafiodeprogramacao2;

import java.util.Scanner;

/**
 *
 * @author Mateus
 * informa número minimo de caracteres para uma senha segura 
 */
public class DesafioDeProgramacao2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha;
        int tamanho;
        
        //solicita senha
        System.out.println("Digite uma senha:");
        senha = entrada.next();  //pega a senha escrita na proxima linha
        tamanho = senha.length(); //analisa o comprimento da palavra
        if(tamanho <6){
            //informa quantidade necessaria de caracteres adicionais
            System.out.println("Tamanho minimo permitido é 6. Insira mais "+(6 - tamanho)+ " caracteres.");
        }else{
            //informa tamanho adequado
           System.out.println("Senha atende o tamanho minimo."); 
        }
    }
}