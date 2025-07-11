// File Latihan Java
// Soal : Chatgpt

// ===================================================================
// Nomor 1 : Gudang 

// class Barang {
//     String nama,kode;
//     int stok;

//     // Constructor 

//     Barang(String namaBarang, String kodeBarang, int stokAwal) {
//         nama = namaBarang;
//         kode = kodeBarang;
//         stok = stokAwal;
//     }
// }

// public class Latihan {
//     public static void main(String[] args) {
//         // Bikin Object pake Array 
//         Barang[] daftar = new Barang[3];

//         // inisialisasi data 
//         daftar[0] = new Barang("Laptop","PRKTK",20);
//         daftar[1] = new Barang("Keyboard","PRKIN",10);
//         daftar[2] = new Barang("Monitor","PRKOU",9);

//         // Loop untuk menampilkan data 

//         for (int i = 0; i < daftar.length; i++) {
//             System.out.println("Barang "+ (i+1) + ": " + 
//                 daftar[i].nama + " | Kode : " +
//                 daftar[i].kode + " | Stok : " +
//                 daftar[i].stok);
//         }

//     }
// }
// ===================================================================

// ===================================================================
// Nomor 2 : Lomba Panahan 

// =========================================================
// Target Output :
// Peserta 1: Faiz | NIM: 123456 | Kategori: Pro
// Peserta 2: Nisa | NIM: 654321 | Kategori: Beginner
// Peserta 3: Andi | NIM: 112233 | Kategori: Intermediate
// =========================================================

   // Membuat Class

//    class Peserta {
//     String nama,nim,kategori;

//     // Constructor

//     Peserta(String nama, String nim, String kategori) {
//         this.nama = nama;
//         this.nim = nim;
//         this.kategori = kategori;
//     }

//    }

//    public class Latihan {

//     public static void main(String[] args) {
//         Peserta[] daftar = new Peserta[3];

//         daftar[0] = new Peserta("Faiz","123456","Pro");
//         daftar[1] = new Peserta("Nisa","654321","Begginer");
//         daftar[2] = new Peserta("Andi","112233","Intermediete");

//         // Gak Pake loop 
//         System.out.println("Nama : " + daftar[0].nama + " | "  + "NIM : " + daftar[0].nim + " | " + "Kategori: " + daftar[0].kategori);
//         System.out.println("Nama : " + daftar[1].nama + " | "  + "NIM : " + daftar[1].nim + " | " + "Kategori: " + daftar[1].kategori);
//         System.out.println("Nama : " + daftar[2].nama + " | "  + "NIM : " + daftar[2].nim + " | " + "Kategori: " + daftar[2].kategori);
//     }
    
//    }

//===================================================================

// Nomor 4 : Barang

// class BarangBaru{
//     String nama;
//     int harga,stok;

//     //construtor
//     public BarangBaru(String nama, int harga, int stok) {
//         this.nama = nama;
//         this.harga = harga;
//         this.stok = stok;
//     }

//     void show(){
//         System.out.println("Barang: " + this.nama);
//         System.out.println("Harga: " + this.harga );
//         System.out.println("Stok: " + this.stok);
//     }

//     void kurang(int n){
//         System.out.println("Stok Dikurangi : " + n);

//         this.stok -= n;
//     }

 
// }


// public class Latihan {
//     public static void main(String[] args) {
//         BarangBaru brgb = new BarangBaru("Indomie",3000 , 10);

//         // panggil methodnya
        
//         brgb.show();
//         System.out.println();
//         brgb.kurang(2);
//         System.out.println();
//         brgb.show();

       
     
//     }
// }


