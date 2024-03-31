package Problema7;

import java.awt.Point;
import java.util.ArrayList;

public class Cannonball {
    private double x;
    private double y;
    private double velocidade_x;
    private double velocidade_y;

    public Cannonball(double x, double y) {
        this.x = x;
        this.y = y;
        this.velocidade_x = 0;
        this.velocidade_y = 0;
    }

    public void move(double deltaSec) {
        double dt = deltaSec;
        double g = -9.81;

        double dx = velocidade_x * dt;
        double dy = velocidade_y * dt + 0.5 * g * dt * dt;

        x += dx; // Atualiza a posição corretamente
        y += dy; // Atualiza a posição corretamente

        velocidade_y += g * dt; // Atualiza a velocidade corretamente
    }

    public Point getLocation() {
        int x_inteira = (int) Math.round(x);
        int y_inteira = (int) Math.round(y);
        return new Point(x_inteira, y_inteira);
    }

    public ArrayList<Point> shoot(double alpha, double v, double deltaSec) {
        ArrayList<Point> posicoes = new ArrayList<Point>(); // Renomeado para evitar conflito de nomes
        double radian = Math.toRadians(alpha);
        velocidade_x = v * Math.cos(radian);
        velocidade_y = v * Math.sin(radian);

        while (y >= 0) { // Condição corrigida
            move(deltaSec);
            Point posicao = getLocation(); // Chamada corrigida para getLocation()
            posicoes.add(posicao); // Adiciona a posição à lista corretamente
        }

        return posicoes;
    }
}
