package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        if (height == 0) {
            return;
        }
        for (int i=0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (j == 0  || j == length-1 || i == 0  || i == height-1) {
                    System.out.print(8);
                    continue;
                }
                System.out.print(' ');
            }
            System.out.print('\n');
        }
    }
}
