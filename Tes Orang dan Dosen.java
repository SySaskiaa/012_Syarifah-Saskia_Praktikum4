package Praktikum4;

/**
 *
 * @author SyarifahSaskia
 */
public class Tes {
    public static void main(String[] args) {
        System.out.println("Memasukkan Identitas Dosen 1 : Bambang");
        Dosen dosen1 = new Dosen("Bambang");
 
        System.out.println("Memasukkan Identitas Dosen 2 : Paijo, NIP. 1357");
        Dosen dosen2 = new Dosen("Paijo", 1357);
 
        System.out.println("Memasukkan Identitas Dosen 3 : Sutejo, NIP. 157, umur 51");
        Dosen dosen3 = new Dosen("Sutejo", 157, 51);

        System.out.println();
        dosen1.info();
        System.out.println();
        dosen2.info();
        System.out.println();
        dosen3.info();
    }    
}
