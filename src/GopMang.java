import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[10];
        String[] array2 = new String[10];
        String[] array3 = new String[20];
        System.out.println("nhap 10 phan tu cho mang array1");
        for (int i = 0; i < array1.length; i++) {
            int phanTuArray1 = scanner.nextInt();
            array1[i] = phanTuArray1;
        }
        System.out.println("nhap 10 phan tu cho mang array2");
        for (int i = 0; i < array2.length; i++) {
            int phanTuArray2 = scanner.nextInt();
            array1[i] = phanTuArray2;
        }
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] +"";
        }
        for (int i = 0; i < array2.length; i++) {
            array3[i + 10] = array2[i];
        }
        System.out.println("mang sau khi gop");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
