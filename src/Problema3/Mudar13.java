package Problema3;

public class Mudar13 {

    public static char rotação_de_13(char letra) {
        if (letra >= 'a' && letra <= 'z') {
            return (char) ((letra - 'a' + 13) % 26 + 'a');
        } else if (letra >= 'A' && letra <= 'Z') {
            return (char) ((letra - 'A' + 13) % 26 + 'A');
        } else {
            return  System.out.println("Essa letra",+ letra + "nao pertence ao alfabeto");
        }
    }


    public static String rodarTexto(String textooriginal) {
        String textonovo = "";
        for (int i = 0; i < textooriginal.length(); i++) {
            char letra = textooriginal.charAt(i);
            textonovo += rotação_de_13(letra);
        }
        return textonovo;
    }
}


