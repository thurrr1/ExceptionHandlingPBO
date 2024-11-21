import java.util.Scanner; 
//import scanner agar bisa melakukan input data 
public class ProgramFaktur { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        try { 
            // Input data faktur 
            System.out.print("Masukkan No Faktur: "); 
            String noFaktur = scanner.nextLine(); 
 
            System.out.print("Masukkan Kode Barang: "); 
            String kodeBarang = scanner.nextLine(); 
 
            System.out.print("Masukkan Nama Barang: "); 
            String namaBarang = scanner.nextLine(); 
 
            System.out.print("Masukkan Harga Barang: "); 
            double hargaBarang = scanner.nextDouble(); 
            if (hargaBarang <= 0) { // Validasi harga barang 
                throw new IllegalArgumentException("Harga barang harus lebih dari 0!"); 
            } 
            System.out.print("Masukkan Jumlah Beli: "); 
            int jumlahBeli = scanner.nextInt(); 
            if (jumlahBeli <= 0) { // Validasi jumlah beli 
                throw new IllegalArgumentException("Jumlah beli harus lebih dari 0!"); 
            } 
 
            // Membuat objek Faktur (inheritance digunakan di sini) 
            Faktur faktur = new Faktur(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli); 
 
            // Menampilkan faktur 
            System.out.println("\n--- Detail Faktur Pembelian ---"); 
            faktur.tampilkanFaktur(); 
 
        } catch (IllegalArgumentException e) { 
            // Menangani exception jika input tidak valid 
            System.out.println("Error: " + e.getMessage()); 
        } catch (Exception e) { 
            // Menangani exception lainnya 
            System.out.println("Terjadi kesalahan: " + e.getMessage()); 
        } finally { 
            scanner.close(); 
        } 
    } 
} 
