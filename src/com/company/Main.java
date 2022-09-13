package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final double E = Math.E;
        final double P = Math.PI;
        short[] c = new short[(16 - 2) / 2 + 1];
        float[] x = new float[13];
        double[][] y = new double[8][13];

        //Заполнение массива c
        int k = 0;
        for (short i = 2; i <= 16; i += 2) {
            c[k++] = i;
        }



//        Заполнение и вывод массива x

        for (int i = 0; i < 13; i++) {
            x[i] = new Random().nextFloat() * 19 - 14;
        }

// Заполнение финального массива y
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 13; j++) {
                double x_1 = x[j];
                if (c[i] == 8) {
                    y[i][j] = Math.cos(Math.pow((0.75 / (Math.pow(x_1, (x_1 - 0.25) / x_1) + 1)), Math.cbrt(x_1)));
                }
                else if (c[i] == 2 || c[i] == 6 || c[i] == 12 || c[i] == 14) {
                    double num = Math.cbrt(x_1) / 2;
                    double degree = Math.asin((x_1 - 4.5) / 19);
                    y[i][j] = Math.cbrt(Math.pow(num, degree));
                }
                else {
                    y[i][j] = Math.asin(Math.cos(P / (Math.pow(E, Math.cbrt(x_1)) + 3 )));
                }
            }
        }

//        Вывод массива
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(String.format(" %.4f ", y[i][j]));
            }
            System.out.println();
        }


        }
    }

