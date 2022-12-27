package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i=1;i<=height;i++){
            for (int k=1;k<=length;k++){
                if (i==1||k==1||i==height||k==length){
                    System.out.print("8");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
