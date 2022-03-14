import java.util.Scanner;

public class Watermelon {
    public boolean check_watermelon(int w){
        if(w!=2 && w%2==0 && w>=1 && w<=100)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Watermelon w1=new Watermelon();

        Scanner s = new Scanner(System.in);
        int w =s.nextInt();
        s.close();

        if(w1.check_watermelon(w))
            System.out.println("YES");
        else
            System.out.println("NO");


    }
}


