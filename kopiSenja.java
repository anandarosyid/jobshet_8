import java.util.Scanner;
public class kopiSenja {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Maukkan Jumlah cabang :");
        int cabang = sc.nextInt();
        System.out.print("\n======INPUT PENJUALAN PERCABANG=======\n");

       int totalPelanggan = 0, totalItem = 0;

        for (int i = 1; i <= cabang; i++) {
            System.out.print("\n---cabang"+ i +"---\n");
           System.out.print("jumlah pelanggan : ");
            int pelanggan = sc.nextInt();

            int itemCabang = 0;
            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("-pelanggan "+ j + " memesan  berapa item? ");
                int item = sc.nextInt();
                itemCabang += item;
            }

        System.out.println("Cabang "+i);
        System.out.println("-Pelanggan\t:"+pelanggan +" orang");
        System.out.println("-Item terjual\t:"+ itemCabang+"\n");

        totalPelanggan += pelanggan;
        totalItem += itemCabang;
        }

        System.out.println("===== TOTAL SELURUH CABANG =====");
        System.out.println("Pelnaggan\t:"+totalPelanggan+" orang");
        System.out.println("Item terjual\t:"+totalItem+" item");

    }
    
}
