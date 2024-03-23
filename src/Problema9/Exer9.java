package Problema9; // Define o pacote do código

import java.util.Random; // números aleatórios

public class Exer9 {

    public static void main(String[] args) { // Método principal
        Random random = new Random();

        for (int i = 0; i < 10; i++) { // Loop para iterar 10 vezes
            double valordado = 330;
            double tolerancia = 0.1; // Define a tolerância da resistência
            // Gera uma variação aleatória entre -10% e +10% do valor dado
            double variação = (random.nextDouble() * 2 - 1) * valordado * tolerancia;
            double valorreal = valordado + variação; // Calcula o valor real da resistência
            // Imprime o valor real da resistência para cada iteração
            System.out.println("Valor real da resistência " + (i + 1) + ": " + valorreal + " ohms");
        }
    }
}
