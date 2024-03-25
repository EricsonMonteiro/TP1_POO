package Problema2; // Declaração do pacote do código

import java.util.ArrayList;
import java.util.Scanner;

public class Exer2 {




        public void main(String[] args) {
            ArrayList<Point> points = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            // Ler coordenadas do utilizador e guardar no ArrayList
            System.out.println("Quantos pontos deseja inserir?");
            int numPoints = scanner.nextInt();
            for (int i = 0; i < numPoints; i++) {
                System.out.print("Insira a coordenada x para o ponto " + (i + 1) + ": ");
                double x = scanner.nextDouble();
                System.out.print("Insira a coordenada y para o ponto " + (i + 1) + ": ");
                double y = scanner.nextDouble();
                points.add(new Point(x, y));
            }

            // Calcular e imprimir distâncias entre pontos consecutivos
            for (int i = 0; i < points.size() - 1; i++) {
                Point p1 = points.get(i);
                Point p2 = points.get(i + 1);
                double distancia = distanciaDePontos(p1.getX(), p1.getY(), p2.getX(), p2.getY());
                System.out.println("Distância entre ponto " + (i + 1) + " e ponto " + (i + 2) + ": " + distancia);
            }
        }

        private static double distanciaDePontos(double x1, double y1, double x2, double y2) {
            // Calcular distância euclidiana entre dois pontos
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }


    class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }



}
