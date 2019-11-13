
package peksegoop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Pekseg {
    private List<Arlap> menu;
    
    public Pekseg(String fajlNev){
        menu = new ArrayList<>();
        try{
            FileReader f = new FileReader(fajlNev);
            BufferedReader br = new BufferedReader(f);
            String sor = br.readLine();
            while(sor!= null){
                
                
                sor=br.readLine();
            }

            br.close();
            f.close();
        } catch(FileNotFoundException e){
            System.out.println("Nem található a fájl");
        } catch (IOException e){
            System.out.println("Valami hiba történt");
        }
        
    }
}
