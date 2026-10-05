import java.util.Scanner;

public class StudiKasus109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int HARGA_PER_CUP = 18000;
        int MINIMAL_PEMBELIAN = 100000;
        double DISKON = 0.10;



        System.out.print("Masukkan jumlah kopi yang dibeli: ");
        int jumlahCup = input.nextInt();

        int totalBelanja = jumlahCup * HARGA_PER_CUP;
        double potongan = 0;

        if (totalBelanja >= MINIMAL_PEMBELIAN) {
            potongan = totalBelanja * DISKON;
        }

        double totalBayar = totalBelanja - potongan;

        System.out.println("\n--- Struk Pembelian ---");
        System.out.println("Harga per cup: Rp18.000");
        System.out.println("Jumlah cup: " + jumlahCup);
        System.out.println("Total belanja: Rp" + totalBelanja);
        System.out.println("Diskon: Rp" + potongan);
        System.out.println("Total yang harus dibayar: Rp" + totalBayar);

        input.close();
    }

}



