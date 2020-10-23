package Qello_numrin;

import javax.swing.JOptionPane;

public class Qello_numrin_random {
	public static void main(String[] args) {
		int numri_i_gjeneruar=(int)(Math.random()*100 + 1);
		int Numri_i_shfrytezuesit=0;
		System.out.println("Numri i dhene duhet te jete: " +numri_i_gjeneruar);
		int numero=1;
		
		while(numri_i_gjeneruar != Numri_i_shfrytezuesit) {
			String pergjigjja = JOptionPane.showInputDialog(null , "Ju lutem numri duhet te jete ne mes 1 dhe 100");
			
			Numri_i_shfrytezuesit=Integer.parseInt(pergjigjja);
            JOptionPane.showMessageDialog(null, ""+ metodaShfrytezuesi(numri_i_gjeneruar, Numri_i_shfrytezuesit, numero));
            numero++;
		}
	}
	
	public static String metodaShfrytezuesi(int numri_i_gjeneruar, int Numri_i_shfrytezuesit, int numero) {
		
		if(Numri_i_shfrytezuesit <=0 || numri_i_gjeneruar >100) {
			return "Numri i futur eshte gabim";
			
		}else if(Numri_i_shfrytezuesit == numri_i_gjeneruar) {
			return "Numri juaj eshte i sakt: " +numero;
			
		}else if(Numri_i_shfrytezuesit > numri_i_gjeneruar) {
			return "Numri juaj eshte me i madhe, provo perseri \n Keni provuar :" +numero;
			
		}else if(Numri_i_shfrytezuesit < numri_i_gjeneruar) {
			return "Numri juaj eshte me i vogel, provo perseri\n Keni provuar: " +numero;
		}else {
		return "Numri juaj eshte i pasakt, provo perseri\n Keni provuar: " +numero;
		}
	}
}
