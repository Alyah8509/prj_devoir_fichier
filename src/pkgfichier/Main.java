package pkgfichier;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
	calcul();
    }
    public static void f_v () throws IOException {
        BufferedReader fic=new BufferedReader(new FileReader("ventes.txt"));
        String ligne=fic.readLine();
        while (ligne != null){

            System.out.println(ligne);
            ligne=fic.readLine();
        }
        fic.close();
    }
    public static void calcul () throws IOException {
        double [] resultat=new double[5];
        String [] tab;
        double w=0;
        BufferedReader fic=new BufferedReader(new FileReader("ventes.txt"));
        String ligne= fic.readLine();
        while (ligne!=null){
            for (int i=0; i<=resultat.length-1; i++) {
                tab=ligne.split(".");
                w=Double.parseDouble(ligne);
                resultat[i] =w+ ((0.05) * w);
                ligne = fic.readLine();
            }
        }
        fic.close();
        PrintWriter fichier;
        fichier=new PrintWriter(new FileOutputStream("commission.txt"));//pas eu le temps de finir ici
        for (int y=0; y<=resultat.length; y++) {
            fichier.println(resultat[y]);
        }
    }
}
