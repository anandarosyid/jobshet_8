import java.util.Scanner;   
public class NilaiKelompok05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, nilai;
        float totalNilai, rataNilai;

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
            System.out.println("kelomok " + i + " nilai rata rata : " + rataNilai);
            i++;
            
          
        }
        

     
        
}
}