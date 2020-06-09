import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a=s.split(" ");
        int[] b=new int[a.length-1];
        for(int i=0;i<a.length-1;i++){
            b[i]=Integer.parseInt(a[i]);
        }
        int k=Integer.parseInt(a[a.length-1]);
        Arrays.sort(b);
        for(int i=0;i<k;i++){
            System.out.print(b[i]);
            if(i!=k-1){
                System.out.print(" ");
            }
        }
    }
}
