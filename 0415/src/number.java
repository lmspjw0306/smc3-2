import java.util.Scanner;
import java.util.Random;
public class number {

    public static void main(String[] args) {

        System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지): ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int a,b = 0;

        Random random = new Random(); //랜덤
        for (int i=0;i<=9;i++) {
            a = random.nextInt(50)+1;
            System.out.print(a+" ");
            if (a==num) {
                b=1;
            }
        }

        if(b==1){
            System.out.println("\n당첨! 일치하는 숫자가 있습니다.");
        }
        else {
            System.out.println("\n아쉽군요! 일치하는 숫자가 없습니다.");
        }


    }
}
