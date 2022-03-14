import java.util.Scanner;

public class YP {
    public boolean check(int [][] test , int n){

        int x_sum=0,y_sum=0,z_sum=0;


        for (int i = 0; i < n; i++) {
            if(test[i][0]<-100 || test[i][0]>100 || test[i][1]<-100 || test[i][1]>100 || test[i][2]<-100 || test[i][2]>100)
                return false;

            x_sum+=test[i][0];
            y_sum+=test[i][1];
            z_sum+=test[i][2];
        }

        if(x_sum==0 && y_sum==0 && z_sum==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        YP a = new YP();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x,y,z;

        int [][] test = new int [n][3];

        int row=0;

        while ( row < n ) {
            x=scan.nextInt();
            y=scan.nextInt();
            z=scan.nextInt();

            test[row][0]=x;
            test[row][1]=y;
            test[row][2]=z;
            row++;
        }
        scan.close();

        if(a.check(test,n))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}

