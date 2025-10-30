import java.util.Scanner;
public class kuadrat05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, jumlah=0, kuadrat; 

        System.out.print("Masukkan juamlah bilangan : ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            jumlah = 0;
            System.out.print("n = " + i + " juamlah kuadrat = ");

            for (int j = 1; j <= i; j++){
                kuadrat = j * j;
                jumlah += kuadrat;

                System.out.print(kuadrat);
                if (j < i){
                    System.out.print(" + ");
                }   
            }
        
           System.out.println(" = " + jumlah);
        }
    }
} 

