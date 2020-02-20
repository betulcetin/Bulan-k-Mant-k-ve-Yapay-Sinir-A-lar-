/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulanikodev1;

import java.io.File;
import java.net.URISyntaxException;
import net.sourceforge.jFuzzyLogic.FIS;

/**
 *
 * @author betul
 */
public class KaracigerHastalik {
    private double corpuscular_hacmi;
    private double alkalen_fosfataz;
    private double alanin_aminotransferaz;
    private double aspartat_aminotransferaz;
    private double glutamil_transferaz;
    private double drinks_number;
    private FIS fis;
    
    public KaracigerHastalik(double corp, double alka, double ala, double asp, double glu, double dnum) throws URISyntaxException
    {
        this.corpuscular_hacmi = corp;
        this.alkalen_fosfataz = alka;
        this.alanin_aminotransferaz = ala;
        this.aspartat_aminotransferaz = asp;
        this.glutamil_transferaz = glu;
        this.drinks_number = dnum;
        
        File dosya = new File(getClass().getResource("karaciger.fcl").toURI());
        fis = FIS.load(dosya.getPath());
        fis.setVariable("corpuscular_hacmi", corpuscular_hacmi);
        fis.setVariable("alkalen_fosfataz", alkalen_fosfataz);
        fis.setVariable("alanin_aminotransferaz", alanin_aminotransferaz);
        fis.setVariable("aspartat_aminotransferaz", aspartat_aminotransferaz);
        fis.setVariable("glutamil_transferaz", glutamil_transferaz);
        fis.setVariable("drinks_number", drinks_number);
        fis.evaluate();
    }
    
    public FIS getModel()
    {
        return fis;
    }
    
    @Override
    public String toString()
    {
        String cikti = "Train/Test: "+Math.round(fis.getVariable("train_test").getValue());        
        return cikti;
        
    }
}
