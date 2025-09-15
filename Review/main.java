package Review;

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         System.out.println("Hello");
//     }
// }

class Maba {
    String Nama,NIM;
    int ipk;

    // constructor

    Maba(String Nama,String NIM,int ipk){
        this.Nama = Nama;
        this.NIM = NIM;
        this.ipk = ipk;
    }

}

public class main  {
    public static void main(String[] args) {
        Maba[] list = new Maba[2];

        list[0] = new Maba("John Doe", "123456789", 3);
        list[1] = new Maba("John Cena", "987654321", 3);

        for (int i = 0; i < list.length; i++) {
            System.out.println("Nama "+ (i+1) + ": " + 
                list[i].Nama + " | NIM : " +
                list[i].NIM + " | IPK : " +
                list[i].ipk);
        }    
    }
}
