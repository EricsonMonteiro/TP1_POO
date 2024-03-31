package Problema4;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class Array {


        public static void main(String[] args) {
            int[] array = new int[10];
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(11);
            }

            ArrayList<Integer> indicesPares = new ArrayList<>();
            ArrayList<Integer> pares = new ArrayList<>();
            ArrayList<Integer> reverseArray = new ArrayList<>();

            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0) {
                    indicesPares.add(array[i]);
                }
                if (array[i] % 2 == 0) {
                    pares.add(array[i]);
                }
            }

            for (int i = array.length - 1; i >= 0; i--) {
                reverseArray.add(array[i]);
            }

            escreverOutputFile(array, indicesPares, pares, reverseArray);
        }

        private static void escreverOutputFile(int[] array, ArrayList<Integer> indicesPares,
                                               ArrayList<Integer> pares, ArrayList<Integer> reverseArray) {
            try {
                FileWriter writer = new FileWriter("output.txt");
                String line0 = "Todo elemento que está num índice par: " + indicesPares.toString() + "\n";
                String line1 = "Todo elemento par: " + pares.toString() + "\n";
                String line2 = "Todos os elementos na ordem inversa: " + reverseArray.toString() + "\n";
                String line3 = "Apenas o primeiro elemento: " + array[0] + "\n";
                String line4 = "Apenas o último elemento: " + array[array.length - 1] + "\n";

                writer.write(line0);
                writer.write(line1);
                writer.write(line2);
                writer.write(line3);
                writer.write(line4);

                writer.close();
                System.out.println("Os dados foram escritos no arquivo output.txt.");
            } catch (IOException ex) {
                System.out.println("Ocorreu um erro ao escrever no arquivo.");
                ex.printStackTrace();
            }
        }
    }


