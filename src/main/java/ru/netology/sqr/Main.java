package ru.netology.sqr;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();

        int result = service.enumeration(300, 200);
        System.out.println(result);

    }

}
