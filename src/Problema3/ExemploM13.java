package Problema3;
import java.util.Scanner;

public class ExemploM13 {




        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            System.out.print("Digite um texto para ser encriptado com o processo MUDAR13: ");
            String textooriginal = ler.nextLine();
            String textoencriptado = Mudar13.rodarTexto(textooriginal);
            System.out.println(" O texto inicial que voce inserio: " + textooriginal);
            System.out.println(" O texto encriptado ficou assim: " + textoencriptado);
        }
    }

