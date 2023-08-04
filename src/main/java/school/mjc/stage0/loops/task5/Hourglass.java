package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height == 0) {
            return;
        }
        for (int i = 0; i < height; i++) {
            int from = Math.min(height - i - 1, i);
            int to = Math.max(height - i - 1, i);

            for (int j = 0; j < height; j++) {
                if (j >= from && j <= to) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
