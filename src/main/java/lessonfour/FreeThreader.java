package lessonfour;

public class FreeThreader extends Thread {
    private static final Object monitor = new Object();
    private static char baseSymbol = 'A';

    private char operationalSymbol;
    private char nextSymbol;
    private int repeatCount;

    FreeThreader(char operationalSymbol, char nextSymbol, int repeatCount) {
        this.operationalSymbol = operationalSymbol;
        this.nextSymbol = nextSymbol;
        this.repeatCount = repeatCount;
    }

    @Override
    public void run() {
        for (int i = 0; i < repeatCount; i++) {
            synchronized (monitor) {
                try {
                    while (baseSymbol != operationalSymbol) {
                        monitor.wait();
                    }
                    System.out.print(operationalSymbol);
                    baseSymbol = nextSymbol;
                    monitor.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
