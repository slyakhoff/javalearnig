package commonpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;


public class RandomData {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введите начало периода в Формате dd.MM.yyyy");
        String strDateB = Scan.nextLine();
        System.out.println("Введите конец периода в Формате dd.MM.yyyy");
        String strDateE = Scan.nextLine();

        //Инициализируем две переменные типа Date
        Date dateB = null;
        Date dateE = null;



        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        try {
            dateB = sdf.parse(strDateB);
            dateE = sdf.parse(strDateE);

            // Количество миллисекунд между датами
            long intDateE = dateE.getTime();
            long intDateB = dateB.getTime();
            long difference = intDateE - intDateB;

            Random rnd = new Random();

            for (int i = 0; i<=100;i++) {

                long intDateC = intDateB + (long) (difference*rnd.nextInt(1000) / 1000);
                Date dateC = new Date(intDateC);
                System.out.println(sdf.format(dateC));


            }
            /*
                Наверно проще и понятнее в случае больших чисел использовать Math.random()
            */
            System.out.println("Начало секции Math.random()");

            for (int i = 0; i<=100;i++) {

                long intDateD = intDateB + (long) (difference*Math.random());
                Date dateD = new Date(intDateD);
                System.out.println(sdf.format(dateD));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }



        System.out.println();
        System.out.println("done!");
    }
}
