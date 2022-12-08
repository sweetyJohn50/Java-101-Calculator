package calcultor;

import java.util.Scanner;



public class CalcMachine {

    public static void main(String[] args) {
        
             

    int n1 , n2 , calc;

    Scanner i = new Scanner(System.in);

    System.out.print("Ilk sayiyi giriniz : ");

    n1 = i.nextInt();

    System.out.print("Ikinci sayiyi giriniz : ");

    n2 = i.nextInt();
    
    System.out.println("Lutfen yapmak isteginiz islemi secin\n 1-TOPLAMA\n 2-CIKARMA\n 3-CARPMA\n 4-BOLME");

      calc = i.nextInt();

      i.close();

    switch (calc) {
        case 1:
        System.out.println("Toplama : "+ (n1 + n2));
            break;
        case 2: 
        System.out.println("Cikarma : "+ (n1 - n2));
        break;
        case 3:
        System.out.println("Carpma : "+(n1 * n2));
        break;
        case 4:
          if(n2 != 0){
        System.out.println("Bolme : "+ (n1 / n2));
           }
           else{
            System.out.print("Bir sayi 0'a bolunemez!!");
           }
        break;
        default:
        System.out.println("Yanlis secim yaptiniz Tekrar Deneyin!!!"); 
    
        
    }

    
    }
}
          // Hakan Çoban
          // https://app.patika.dev/hknxx
          