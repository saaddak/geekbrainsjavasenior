package lessonfive;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Tunnel extends Stage {
    ReentrantLock lock = new ReentrantLock();
    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }
    @Override
    public void go(Car c) {
        Semaphore semmy = new Semaphore(MainClass.CARS_COUNT / 2);
        lock.lock();
        try {
            new Thread(() -> {
                try {
                    System.out.println(c.getName() + " перед семафором на участке: " + description);
                    semmy.acquire();
                    System.out.println(c.getName() + " начал этап: " + description);
                    Thread.sleep(length / c.getSpeed() * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println(c.getName() + " закончил этап: " + description);
                    semmy.release();
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
