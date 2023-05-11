import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhap so de kiem tra: ");
        int inputNum = scanner.nextInt();
        boolean isNguyenTo = false;
        for (int i = 2; i < inputNum; i++){
            isNguyenTo = true;
            boolean isDevisible = inputNum % i == 0;
            if (isDevisible){
                isNguyenTo = false;
                break;
            }
        }
        if (isNguyenTo || inputNum == 2){
            System.out.printf("%d la so nguyen to", inputNum);
        } else {
            System.out.printf("%d khong la so nguyen to", inputNum);
        }
    }
}