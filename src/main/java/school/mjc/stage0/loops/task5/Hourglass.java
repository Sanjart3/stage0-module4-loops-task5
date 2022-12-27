package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i=1;i<=height;i++){
            for (int k=1;k<=height-i+1;k++){
                if (i + k < height - 1 && i > k || i + k > height - 1 && i < k) {
                    System.out.print(" ");
                } else {
                    System.out.print("8");
                }
            }
        }
    }
}
