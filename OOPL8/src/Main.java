
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Product[] tab =new Product[10];
        
        tab[0] = new Ksiazka(21, "Mzżna", "tak");
        tab[1] = new Czekolada(43, "taka sobie", "tak");
        tab[2] = new Ksiazka(32, "MOżna inaczej", "tak");
        tab[3] = new Dlugopis(3, "taż ok", "nie");
        tab[4] = new Dzem(2, "taki", "tak");
        tab[5] = new Polopiryna(32, "tak", "tak");
        tab[6] = new Dzem(1, "tak",  "tak");
        tab[7] = new Czekolada(12,  "tak",  "tak");
        tab[8] = new Dlugopis(43,  "tak",  "tak");
        tab[9] = new Ksiazka(0,  "tak",  "tak");
        tab[10] = new Tractor(2400,  "tak",  "tak");
        
        for(int i=0; i<tab.length;i++){
            
            tab[i].buy();
            tab[i].showInfo();
        }
        
        
        
    }
    
}
