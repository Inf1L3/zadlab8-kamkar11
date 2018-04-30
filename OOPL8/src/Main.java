import FiguryPlaskie.Kolo;
import FiguryPlaskie.Kwadrat;
import FiguryPlaskie.Prostokat;
import FiguryPlaskie.Romb;
import FiguryPlaskie.Rownoleglobok;
import FiguryPlaskie.Trapez;
import FiguryPlaskie.Trojkat;
import FiguryPrzestrzenne.Kula;
import FiguryPrzestrzenne.Prostopadloscian;
import FiguryPrzestrzenne.Stozek;
import FiguryPrzestrzenne.Szescian;
import FiguryPrzestrzenne.Walec;
import KlasyAbstrakcyjne.FiguraGeometryczna;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Product[] tab = new Product[10];
        
        tab[0] = new Ksiazka(21, "Można", "tak");
        tab[1] = new Czekolada(43, "taka sobie", "tak");
        tab[2] = new Ksiazka(32, "MOżna inaczej", "tak");
        tab[3] = new Dlugopis(3, "taż ok", "nie");
        tab[4] = new Dzem(2, "taki", "tak");
        tab[5] = new Polopiryna(32, "tak", "tak");
        tab[6] = new Dzem(1, "tak",  "tak");
        tab[7] = new Czekolada(12,  "tak",  "tak");
        tab[8] = new Ksiazka(0,  "tak",  "tak");
        tab[9] = new Tractor(2400,  "tak",  "tak");
        
        for(int i=0; i<10 ;i++){
            
            tab[i].buy();
            tab[i].showInfo();
        }
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.println(" ");
        
        
        FiguraGeometryczna[] figury = new FiguraGeometryczna[15];
        
        figury[0] = new Kwadrat(12);
        figury[1] = new Walec(6, 12);
        figury[2] = new Trapez(4, 8, 2, 15);
        figury[3] = new Prostokat(4, 5);
        figury[4] = new Szescian(25.8);
        figury[5] = new Kula(30);
        figury[6] = new Romb(9, 15);
        figury[7] = new Kolo(33);
        figury[8] = new Trojkat(45, 222.3);
        figury[9] = new Prostopadloscian(3, 8, 4);
        figury[10] = new Rownoleglobok(43, 65);
        figury[11] = new Kwadrat(55);
        figury[12] = new Szescian(66);
        figury[13] = new Stozek(88, 69.9, 90);
        figury[14] = new Romb(4, 4.3);
        
        int i=0;
        while(i<figury.length){
            System.out.println(figury[i].toString());
            i++;
        }
        
        
        
    }
    
}
