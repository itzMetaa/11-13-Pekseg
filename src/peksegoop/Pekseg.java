
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
                String[] st = sor.split(" ");
                if (st[0].equals("Pogácsa")) {
                    menu.add(new Pogacsa(Double.parseDouble(st[1]),Double.parseDouble(st[2])));
                }
                else if (st[0].equals("Kávé")){
                    menu.add(new Kave(st[1].equals("habos")));
                }
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
    
    public void etelLeltar(){
        for (Arlap item : menu){
            if (item instanceof Pogacsa) {
                System.out.println(item);
            }
        }
    }
}
