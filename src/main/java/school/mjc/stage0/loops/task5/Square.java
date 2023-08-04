package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        if (sideLength == 0) {
            return;
        }
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (j == 0  || j == sideLength - 1 || i == 0  || i == sideLength - 1) {
                    System.out.print(8);
                    continue;
                }
                System.out.print(' ');
            }
            System.out.print('\n');
        }
    }
}
