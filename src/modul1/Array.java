package modul1;

public class Array {
    public static void main(String[] args){
        int[] number={1,2,3,4,5};
        String[] mahasiswa={"andi","budi"};
        System.out.println(number[0]);
        System.out.println(mahasiswa[0]);

        int jumlah=number.length;
        System.out.println(jumlah);
        /*metode 1: pengulangan(loop) panjang
        for(int i=0;i<=jumlah ;i++){
            System.out.println(number[i]);*/

        //metode 2 : pengulagan(loop) pendek
        for(int j : number){
            System.out.println(j);
        }
    }
}
