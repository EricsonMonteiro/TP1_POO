package Problema2; // Declaração do pacote do código

import java.util.ArrayList;
import java.util.Scanner;

public class Exer2 { // Declaração da classe Exer2

    public static void main(String[] args) {
        ArrayList<Double[]> pontos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in); // Criação de um objeto Scanner para entrada de dados do usuário

        System.out.print("Digite o número de pontos: ");
        int n = scanner.nextInt(); // Lê o número de pontos fornecido pelo usuário

        for (int i = 1; i <= n; i++) { // Loop para solicitar as coordenadas de cada ponto
            System.out.printf("Digite as coordenadas x e y do ponto %d separadas por espaço: ", i);
            double x = scanner.nextDouble(); // Lê a coordenada x do ponto atual fornecida pelo usuário
            double y = scanner.nextDouble(); // Lê a coordenada y do ponto atual fornecida pelo usuário
            Double[] ponto = {x, y}; // Cria um array de Double contendo as coordenadas x e y do ponto atual
            pontos.add(ponto); // Adiciona o ponto à lista de pontos
        }

        for (int i = 0; i < pontos.size() - 1; i++) { // Loop para calcular e imprimir a distância entre cada par de pontos consecutivos
            Double[] ponto1 = pontos.get(i); // Obtém as coordenadas do ponto atual
            Double[] ponto2 = pontos.get(i + 1); // Obtém as coordenadas do próximo ponto na lista
            double distancia = distanciaDePontos(ponto1[0], ponto1[1], ponto2[0], ponto2[1]); // Calcula a distância entre os dois pontos consecutivos
            System.out.printf("Distância entre o ponto %d e o ponto %d: %.2f\n", i + 1, i + 2, distancia); // Imprime a distância entre os pontos atual e próximo
        }
    }

    private static double distanciaDePontos(double x1, double y1, double x2, double y2) { // Método para calcular a distância entre dois pontos
        double deltaX = x2 - x1; // Calcula a diferença entre as coordenadas x dos dois pontos
        double deltaY = y2 - y1; // Calcula a diferença entre as coordenadas y dos dois pontos
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY); // Calcula e retorna a distância euclidiana entre os dois pontos usando o teorema de Pitágoras
    }
}
