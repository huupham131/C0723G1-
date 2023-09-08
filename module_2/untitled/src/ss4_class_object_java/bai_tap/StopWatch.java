package ss4_class_object_java.bai_tap;

public class StopWatch {
    long startTime;
    long endTime;

    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    private StopWatch() {
        this.startTime = System.currentTimeMillis();
        this.endTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        int[] numbersArray = new int[100000];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = (int) (Math.random() * 100000);
        }
        watch.start();
        int minIndex;
        for (int i = 0; i < numbersArray.length-1; i++) {
            minIndex = i;
            for (int j = i + 1; j < numbersArray.length; j++) {
                if (numbersArray[j] < numbersArray[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbersArray[minIndex];
            numbersArray[minIndex] = numbersArray[i];
            numbersArray[i] = temp;
        }
        watch.stop();
        System.out.println("Thoi gian bat dau "+ watch.getStartTime());
        System.out.println("Thoi gian ket thuc "+ watch.getEndTime());
        System.out.println("Thoi gian thuc thi thuat toan la " + watch.getElapsedTime()+ " millisecond");
    }
}
