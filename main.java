import java.util.Scanner;

public class main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int LC;
        do{
            System.out.println("---------------------MENU--------------------");
            System.out.println("[1]:Phuong Trinh Bac 2");
            System.out.println("[2]:Giai Thua");
            System.out.println("[3]:So Fibonaci");
            System.out.println("[4]:Tim UCLN va BCNN");
            System.out.println("[5]:Liet ke cac so nguyen to nho hon n");
            System.out.println("[6]:Liet ke n so nguyen to dau tien");
            System.out.println("[7]:Liet ke cac so nguyen to co 5 chu so");
            System.out.println("[8]:Tong cac chu so cua mot so nguyen");
            System.out.println("[9]:So thuan nghich");
            System.out.println("[10]:Liet ke so fibonaci nho hon n la so nguyen to");
            System.out.println("[0]:Thoat chuong trinh.");
            System.out.println("---------------------------------------------");
            System.out.print("Lua chon thao tac: ");
            LC=main.scanner.nextInt();
            System.out.println("---------------------------------------------");
            switch(LC){
                case 1:
                    System.out.println("[1]:Phuong Trinh Bac 2");
                    System.out.print("Nhap a: ");
                    float a = main.scanner.nextFloat();
                    System.out.print("Nhap b: ");
                    float b = main.scanner.nextFloat();
                    System.out.print("Nhap c: ");
                    float c = main.scanner.nextFloat();
                    BTCB.Bai1(a, b, c);
                    break;
                case 2:
                    System.out.println("[2]:Giai Thua");
                    System.out.print("Nhap n: ");
                    int n=main.scanner.nextInt();
                    System.out.print("Giai thua cua n la: ");
                    System.out.println(BTCB.Bai2(n));
                    break;
                case 3:
                    System.out.println("[3]:So Fibonaci");
                    System.out.print("Nhap n: ");
                    int z=main.scanner.nextInt();
                    System.out.print("So fibonaci thu n la: ");
                    System.out.println(BTCB.Bai3(z));
                    break;
                case 4:
                    System.out.println("[4]:Tim UCLN va BCNN");
                    System.out.print("Nhap so thu nhat: ");
                    long e=main.scanner.nextLong();
                    System.out.print("Nhap so thu hai: ");
                    long f=main.scanner.nextLong();
                    System.out.print("UCLN cua 2 so la: ");
                    System.out.println(BTCB.Bai4(e, f));
                    System.out.print("BCNN cua 2 so la: ");
                    System.out.println(BTCB.Bai4b(e, f));
                    break;
                case 5:
                    System.out.println("[5]:Liet ke cac so nguyen to nho hon n");
                    System.out.print("Nhap n: ");
                    int y=main.scanner.nextInt();
                    System.out.print("Cac so nguyen to nho hon n la: ");
                    System.out.println(BTCB.Bai5(y));
                    break;
                case 6:
                    System.out.println("[6]:Liet ke n so nguyen to dau tien");
                    System.out.print("Nhap n: ");
                    int m=main.scanner.nextInt();
                    System.out.print("n cac so nguyen to dau tien la: ");
                    System.out.println(BTCB.Bai6(m));
                    break;
                case 7:
                    System.out.println("[7]:Liet ke cac so nguyen to co 5 chu so");
                    System.out.print("Nhap so co 5 chu so: ");
                    int l=main.scanner.nextInt();
                    System.out.print("Cac so nguyen to co 5 chu so la: ");
                    System.out.println(BTCB.Bai7(l));
                    break;
                case 8:
                    System.out.println("[8]:Tong cac chu so cua mot so nguyen");
                    System.out.print("Nhap so nguyen: ");
                    int u=main.scanner.nextInt();
                    System.out.print("Tong la: ");
                    System.out.println(BTCB.Bai8(u));
                    break;
                case 9:
                    System.out.println("[9]:So thuan nghich");
                    System.out.print("Nhap so nguyen co 6 chu so: ");
                    int k=main.scanner.nextInt();
                    System.out.print("Day cac so thuan nghich co 6 chu so la: ");
                    System.out.println(BTCB.Bai9(k));
                    break;
                case 10:
                    System.out.println("[10]:Liet ke so fibonaci nho hon n la so nguyen to");
                    System.out.print("Nhap so tu nhien n: ");
                    int o=main.scanner.nextInt();
                    System.out.print("Cac so fibonaci nho hon n la so nguyen to la: ");
                    System.out.println(BTCB.bai10(o));
                    break;
                case 0: break;

            }
        }while(LC!=0);
    }
}