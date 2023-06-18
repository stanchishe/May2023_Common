package Debugger;

public class Multithreading extends Thread implements Runnable {
    private int threadNum;
    public Multithreading(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " coming from " + threadNum);
            if (threadNum == 2) {
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class StartingClass {
    public static void main(String[] args) {
//        for(int i = 0; i < 5; i++) {
//            Debugger.Multithreading myThread = new Debugger.Multithreading(i);
//            myThread.start();
//        }
        System.out.println("Hello, Threads! ");
        Mathematics newMath = new Mathematics();
        final int sum = newMath.sumOnePlusTwo();
//        sum += 10;
        System.out.println(sum);
//        MathematicsExtra newMathematicsExtra = new MathematicsExtra();
//        System.out.println(newMathematicsExtra.sumOnePlusTwo());

    }
}

final class Mathematics {
    static int one = 1;
    static int two = 2;
    final public int sumOnePlusTwo() {
        int sum = one + two;
//        System.out.println(sum);
        return sum;
    }
}
