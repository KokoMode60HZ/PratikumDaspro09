import java.util.Scanner;

public class StudiKasus209 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEM VALIDASI DANA PENGHARGAAN MAHASISWA ===");
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jenis Kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        String jenisKegiatan = scanner.nextLine();
// cabang lomba 1
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("Mandiri")) {

            System.out.print("Masukkan Peringkat Juara (1, 2, 3, atau 0 jika bukan juara): ");
            int peringkat = scanner.nextInt();

            
            if (peringkat >= 1 && peringkat <= 3) {
                System.out.print("Masukkan Jumlah Dokumen yang Diupload (0-4): ");
                int jumlahDokumen = scanner.nextInt();

                
                if (jumlahDokumen == 4) {
                    System.out.println("\n[DANA PENGHARGAAN DIBERIKAN]");
                    System.out.println("Alasan: Mahasiswa meraih Juara " + peringkat + " pada kegiatan " + jenisKegiatan + " dan dokumen telah lengkap (4/4).");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("\n[DANA PENGHARGAAN TIDAK DIBERIKAN]");
                    System.out.println("Alasan: Dokumen belum lengkap. Jumlah dokumen yang kurang: " + kurang + " dokumen.");
                }
            } else {
                System.out.println("\n[DANA PENGHARGAAN TIDAK DIBERIKAN]");
                System.out.println("Alasan: Hanya peraih Juara 1, 2, atau 3 yang berhak menerima dana penghargaan.");
            }
        }
        // cabang PKM 2
        else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Masukkan Status Pendanaan PKM (1 = Lolos, 0 = Tidak Lolos): ");
            int statusPKM = scanner.nextInt();

            if (statusPKM == 1) {
                System.out.print("Masukkan Jumlah Dokumen yang Diupload (0-4): ");
                int jumlahDokumen = scanner.nextInt();

                if (jumlahDokumen == 4) {
                    System.out.println("\n[DANA PENGHARGAAN DIBERIKAN]");
                    System.out.println("Alasan: Tim PKM lolos pendanaan dan dokumen telah lengkap (4/4).");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("\n[DANA PENGHARGAAN TIDAK DIBERIKAN]");
                    System.out.println("Alasan: Dokumen belum lengkap. Jumlah dokumen yang kurang: " + kurang + " dokumen.");
                }
            } else {
                System.out.println("\n[DANA PENGHARGAAN TIDAK DIBERIKAN]");
                System.out.println("Alasan: Hanya tim PKM yang lolos pendanaan yang berhak menerima dana penghargaan.");
            }

        } else {
            System.out.println("\n[DANA PENGHARGAAN TIDAK DIBERIKAN]");
            System.out.println("Alasan: Kegiatan kategori '" + jenisKegiatan + "' tidak memperoleh dana penghargaan.");
        }

        scanner.close();
    }
}