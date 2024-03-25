package Problrma5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Quadradomagico {


        public static void main(String[] args) {
            int[][] matriz = new int[4][4];
            int[] numeros = new int[16];
            int soma = 0;
            boolean quadradoMagico = true;

            // Leitura dos valores do arquivo numeros.txt
            try (BufferedReader br = new BufferedReader(new FileReader("numeros.txt"))) {
                String linha;
                int i = 0;
                while ((linha = br.readLine()) != null) {
                    numeros[i++] = Integer.parseInt(linha);
                }
            } catch (IOException e) {
                System.out.println("Erro na leitura do arquivo: " + e.getMessage());
                System.exit(1);
            }

            // Verifica se os números estão corretos
            for (int i = 1; i <= 16; i++) {
                boolean encontrado = false;
                for (int j = 0; j < 16; j++) {
                    if (numeros[j] == i) {
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Número " + i + " não encontrado.");
                    quadradoMagico = false;
                    break;
                }
            }

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    matriz[i][j] = numeros[i * 4 + j];
                }
            }


            for (int i = 0; i < 4; i++) {
                int somaLinha = 0;
                int somaColuna = 0;
                for (int j = 0; j < 4; j++) {
                    somaLinha += matriz[i][j];
                    somaColuna += matriz[j][i];
                }
                soma += matriz[i][i] + matriz[i][3 - i];
                if (somaLinha != soma || somaColuna != soma) {
                    quadradoMagico = false;
                    break;
                }
            }


            if (quadradoMagico) {
                System.out.println("É um quadrado mágico.");
            } else {
                System.out.println("Não é um quadrado mágico.");
            }
        }
    }




