import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            int year = scanner.nextInt();
            if(year >0){
                if(year % 4 ==0 && year % 100 !=0 || year % 400 ==0){
                    System.out.println("公元后" + year + "是闰年");
                }else{
                    System.out.println("公元后" + year + "是平年");
                }
            }else {
                if(year %4 == 1 || year % 400 == 1){
                    int beforyear = Math.abs(year); //求数值的绝对值 将负数转化为整数
                    System.out.println("公元前" + beforyear + "是闰年");
                }else {
                    int beforyear = Math.abs(year);
                    System.out.println("公元前" + beforyear + "是平年");
                }
            }
        }
    }
}
