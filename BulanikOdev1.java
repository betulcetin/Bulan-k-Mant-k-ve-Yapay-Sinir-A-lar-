/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulanikodev1;

import com.sun.xml.internal.ws.util.FastInfosetReflection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;

/**
 *
 * @author betul
 */
public class BulanikOdev1 {

    /**
     * @param args the command line arguments
     * @throws java.net.URISyntaxException
     */
    public static void main(String[] args) throws URISyntaxException, FileNotFoundException, IOException {
        // TODO code application logic here
        
        
        File file = new File("src//bupa.data");
        Scanner dosya = new Scanner(file);        
        int satir=1;
                         
        while(dosya.hasNextLine())
        {
            int toplam=0;
            
            int corpuscular_hacmi = dosya.nextInt();            
            int alkalen_fosfataz = dosya.nextInt();
            int alanin_aminotransferaz = dosya.nextInt();
            int aspartat_aminotransferaz = dosya.nextInt();
            int glutamil_transferaz = dosya.nextInt();
            double drinks_number = dosya.nextDouble();
            int sonuc = dosya.nextInt();
            KaracigerHastalik kh = new KaracigerHastalik(corpuscular_hacmi,alkalen_fosfataz,alanin_aminotransferaz,aspartat_aminotransferaz,glutamil_transferaz,drinks_number);  
            
            toplam = (Math.abs(sonuc - kh.hashCode())/sonuc)*(100/satir);
            System.out.println(satir + ".satır: "+ sonuc + "  |||| Hesaplanan Çıktı: " + kh + " |||| " + "MAPE: " + toplam );
            
            satir++;
            
        }
        dosya.close();
        
        Scanner in = new Scanner(System.in);
        System.out.println("\nİstediğiniz bir satırın değerlerini girip üyelik fonksiyonlarını çizdirme:");
        System.out.print("Corpuscular Hacmi (78-103):");
        double corp = in.nextDouble();
        System.out.print("Alkalen Fosfataz (23-138):");
        double alka = in.nextDouble();
        System.out.print("Alanin Aminotransferaz (4-155):");
        double ala = in.nextDouble();
        System.out.print("Aspartat Aminotransferaz (5-82):");
        double asp = in.nextDouble();
        System.out.print("Glutamil Transferaz (5-297):");
        double glu = in.nextDouble();
        System.out.print("Drinks Number (0.0-20.0):");
        double dnum = in.nextDouble(); 
        KaracigerHastalik kh = new KaracigerHastalik(corp,alka,ala,asp,glu,dnum);
        System.out.println(kh); 
        
        
        JFuzzyChart.get().chart(kh.getModel());
        
    }
    
}
