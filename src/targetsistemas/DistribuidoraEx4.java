package targetsistemas;

import java.util.Locale;

public class DistribuidoraEx4 {
    
    public static void main(String[] args) {
    	
    	Locale.setDefault(Locale.US);
        
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        
        double total = sp + rj + mg + es + outros;
        
        double pct_sp = (sp / total) * 100;
        double pct_rj = (rj / total) * 100;
        double pct_mg = (mg / total) * 100;
        double pct_es = (es / total) * 100;
        double pct_outros = (outros / total) * 100;
        
        
        System.out.println("Percentual de representação por estado:");
        System.out.println("SP: " + String.format("%.2f",pct_sp) + "%");
        System.out.println("RJ: " + String.format("%.2f",pct_rj) + "%");
        System.out.println("MG: " + String.format("%.2f",pct_mg) + "%");
        System.out.println("ES: " + String.format("%.2f",pct_es) + "%");
        System.out.println("Outros: " + String.format("%.2f",pct_outros) + "%");
    }
}
