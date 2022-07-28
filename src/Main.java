import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bấc 2: ax2 + bx + c = 0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập giá trị của b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập giá trị của c: ");
        double c = sc.nextDouble();
        PtBac2 d = new PtBac2(a, b, c);
        System.out.println("Delta = " + d.getDelta());

        if (d.getDelta() == 0){
            System.out.println("Phương trình có nghiệm kép là: " + d.getRoot1());
        } else  if (d.getDelta() < 0){
            System.out.println("Phương trình vô nghiệm");
        } else {
            System.out.println("Nghiệm 1 là: " + d.getRoot1());
            System.out.println("Nghiệm 2 là: " + d.getRoot2());
        }

    }
}
