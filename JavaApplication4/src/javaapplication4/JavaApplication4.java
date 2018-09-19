/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author user
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int nilai = 70;        
//        if (nilai >= 80){
//            System.out.println("A");
//    }
//    else if (nilai >= 75){
//       System.out.println("B");
//    }
//    else if (nilai >= 65){
//        System.out.println("C");
//    }
//    else if (nilai >=55){
//        System.out.println("D");
//    }
//    else{
//         System.out.println("E");
//}        
        int umur = 21;
        String paras = "cantik";
        String ilmu = "pintar";
        
        if((umur >20 && umur <=23) && paras == "cantik" && ilmu == "pintar" ){
            System.out.println("PASTI MAU!!!");
        }
        else if(umur >20 && umur <=23 && (paras == "cantik" || ilmu == "pintar")){
            System.out.println("OKE LAHHHH");
        }
         else if(umur >=23 && (paras == "cantik" || ilmu == "pintar")){
            System.out.println("SAYA PIKIR DULU");
        }
        else {
            System.out.println("NO WHY");
        }
    }
}    
