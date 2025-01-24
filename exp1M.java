import java.util.Scanner;

class Operation{
    void Sum(int [][]arr1,int [][]arr2,int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
            }
        }
    }
    void Sub(int [][]arr1,int [][]arr2,int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j]-arr2[i][j]+" ");
            }
        }
    }
    void Mul(int [][]arr1,int [][]arr2,int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j]*arr2[i][j]+" ");
            }
        }
    }
}

public class exp1M {
    public static void main(String[] args) {
        int m;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m");
        m = sc.nextInt();
        System.out.println("Enter n");
        n = sc.nextInt();
        int [][]arr1=new int[m][n];
        int [][]arr2=new int[m][n];
        System.out.println("Enter array");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        Operation op = new Operation();
        op.Sum(arr1, arr2, m, n);
        System.out.println();
        op.Sub(arr1, arr2, m, n);
        System.out.println();
        op.Mul(arr1, arr2, m, n);
    }
}
