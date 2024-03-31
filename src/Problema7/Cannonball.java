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
        this.y = 0;
        this.velocidade_x = 0;
        this.velocidade_y = 0;
    }


    public void move(double deltaSec) {
        double dt = deltaSec;
        double g = -9.81;

        double dx = velocidade_x * dt;
        double dy =velocidade_y * dt + 0.5 * g * dt * dt;

        x = dx;
        y = dy;

        vy = vy + (-9.81) * dt;
    }

    public Point getLocation() {
        int x_inteira = (int) Math.round(x);
        int y_inteira = (int) Math.round(y);
        return new Point(x_inteira, y_inteira);
    }


    public ArrayList<Point> shoot(double alpha, double v, double deltaSec) {
        ArrayList<Point> posicao = new ArrayList<Point>();
        double radian = Math.toRadians(alpha);
        velocidade_x = v * Math.cos(radian);
        velocidade_y = v * Math.sin(radian);

        while (int y >= 0) {
            move(deltaSec);
            Point posicao = getposicao();
            posicao.add(posicao);
        }

        return posicao;
    }
}

