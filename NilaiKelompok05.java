import java.util.Scanner;   
public class NilaiKelompok05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, nilai, kelompokTertinggi=0;
        float totalNilai, rataNilai, rataTertinggi=0;

         i =1;
        while (i <=6){
            System.out.println("kelompok " + i);

            totalNilai = 0;
            for ( j = 1; j <=5; j++){
                System.out.print("masukkan nilai anggota ke-" + j + " : ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("\nkelomok " + i + " nilai rata rata : " + rataNilai);
            System.out.println();

            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
            i++;
        }
        System.out.println("==================================================================================");
        System.out.println("kelompok dengan nilai rata-rata tertinggi adalah kelompok " + kelompokTertinggi + 
                            " dengan nilai rata-rata " + rataTertinggi+"\n");
     
        sc.close();
}
}