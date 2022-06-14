package ru.netology.sqr;

public class SQRService {

public int enumeration (int limit1, int limit2) {

            int count = 0;

            if (limit1 > limit2) {
                System.out.println("Нижняя граница интервала должна быть меньше верхней границы!");

            }
            for (int i = 10; i <= 99; i++) {
                if (limit1 > limit2) {
                    int temp = limit1;
                    limit1 = limit2;
                    limit2 = temp;
                }

                if (limit1 <= i * i && i * i <= limit2) {
                    count++;
                }

            }

            return count;
        }

    }



