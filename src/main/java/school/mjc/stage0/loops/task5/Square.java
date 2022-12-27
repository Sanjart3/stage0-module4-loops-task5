package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int i=1;i<=sideLength;i++){
            for (int k=1;k<=sideLength;k++){
                if (sideLength-k==0||k==1||i==1||sideLength-i==0){
                    System.out.print("8");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
