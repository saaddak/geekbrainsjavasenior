package lessonfive;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class MainClass {
    public static final int CARS_COUNT = 4;
    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }

        CyclicBarrier prepareBarrier = new CyclicBarrier(CARS_COUNT);
        final CountDownLatch prepareCountDown = new CountDownLatch(CARS_COUNT);
        for (int i = 0; i < cars.length; i++) {
            final int k = i;
            new Thread(() -> {
                try {
                    cars[k].prepare();
                    prepareBarrier.await();
                    prepareCountDown.countDown();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
        try {
            prepareCountDown.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");

        CyclicBarrier startBarrier = new CyclicBarrier(CARS_COUNT);
        final CountDownLatch finalCountDown = new CountDownLatch(CARS_COUNT);
        for (int i = 0; i < cars.length; i++) {
            final int k = i;
            new Thread(() -> {
                try {
                    cars[k].run();
                    startBarrier.await();
                    finalCountDown.countDown();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
        try {
            finalCountDown.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}
