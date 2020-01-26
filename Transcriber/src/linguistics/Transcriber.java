package linguistics;

import java.util.*;

import javax.swing.JOptionPane;


public class Transcriber {

	public static void main(String[] args) {
		
		transcribe();

	}

	
	private static void transcribe(){
		
		
		String userInput;
		userInput = JOptionPane.showInputDialog("Entre en un dialecto por favor (opciones: Chileno, España centro-norteño, Argentino/Uruguayo, Caribeño)");
		if (userInput.equals("chileno") | userInput.equals("Chileno")) {
			String input = JOptionPane.showInputDialog("Entre en una palabra/oración por favor");
			 Map<String, String> letterMap = new HashMap<>();
			    letterMap.put("ll","ʝ");
			    letterMap.put("y","ʝ");
			    letterMap.put("j", "x");
			    letterMap.put("s", "h");
			    letterMap.put("z", "s");
			    letterMap.put("c", "k");
			    letterMap.put("v", "β");
			    letterMap.put("é", "e");
			    letterMap.put("í", "i");
			    letterMap.put("ó", "o");
			    letterMap.put("ú", "u");
			    letterMap.put("á", "a");
			    letterMap.put("ch", "ʧ");
			    letterMap.put("d", "ð");
			    letterMap.put("h", "x");
			    letterMap.put("b", "β");
			    letterMap.put("g", "ɤ");

			    StringBuilder output = new StringBuilder();
			    boolean temp;
			    temp = false;
			    for (String c : input.split("")) {
			  
			    	
			    	if (c.equals("l")) {
			    		if (temp) {
			    			output.append("ʝ");
			    			temp = false;
			    		}
			    		else {
			    			temp = true;
			    		}
			    	} else {
			    		
			    		if (temp) {
			    			output.append("l");
			    		}
			    		output.append(letterMap.getOrDefault(c, c));
			    		temp = false;
			    
			    	}
			    }
			    
			    if(temp) {
			    	output.append("l");
			    }
			    	
			    System.out.println(output.toString());
		}
		
		if (userInput.equals("Caribeño") | userInput.equals("caribeño") | userInput.equals("Caribeno") | userInput.equals("caribeno")) {
			String input = JOptionPane.showInputDialog("Entre en una palabra/oración por favor");
			 Map<String, String> letterMap = new HashMap<>();
			    letterMap.put("ll","ʝ");
			    letterMap.put("y","ʝ");
			    letterMap.put("j", "x");
			    letterMap.put("s", "h");
			    letterMap.put("z", "s");
			    letterMap.put("c", "k");
			    letterMap.put("v", "β");
			    letterMap.put("é", "e");
			    letterMap.put("í", "i");
			    letterMap.put("ó", "o");
			    letterMap.put("ú", "u");
			    letterMap.put("á", "a");
			    letterMap.put("ch", "ʧ");
			    letterMap.put("d", "ð");
			    letterMap.put("h", "x");
			    letterMap.put("b", "β");
			    letterMap.put("g", "ɤ");
			    letterMap.put("rr", "ᴚ");
			    letterMap.put("n", "ŋ");
			    

			    StringBuilder output = new StringBuilder();
			    boolean temp;
			    temp = false;
			    boolean temp1;
			    temp1 = false;
			    for (String c : input.split("")) {
			  
			    	
			    	if (c.equals("l")) {
			    		if (temp) {
			    			output.append("ʝ");
			    			temp = false;
			    		}
			    		else {
			    			temp = true;
			    		}
			    	} else {
			    		
			    		if (temp) {
			    			output.append("l");
			    		}
			    		
			    		temp = false;
			    
			    	}
			    	if (c.equals("r")) {
			    		if (temp1) {
			    			output.append("ᴚ");
			    			temp1 = false;
			    		}
			    		else {
			    			temp1 = true;
			    		}
			    	} else {
			    		
			    		if (temp1) {
			    			output.append("r");
			    		}
			    		output.append(letterMap.getOrDefault(c, c));
			    		temp1 = false;
			    
			    	}
			    }
			    
			    if(temp) {
			    	output.append("l");
			    }
			    	
			    System.out.println(output.toString());
		}
		
		if (userInput.equals("Argentino/Uruguayo") | userInput.equals("argentino/uruguayo")) {
			String input = JOptionPane.showInputDialog("Entre en una palabra/oración por favor");
			 Map<String, String> letterMap = new HashMap<>();
			    letterMap.put("ll","ʃ");
			    letterMap.put("y","ᴣ");
			    letterMap.put("j", "x");
			    letterMap.put("s", "h");
			    letterMap.put("z", "h");
			    letterMap.put("c", "k");
			    letterMap.put("v", "β");
			    letterMap.put("é", "e");
			    letterMap.put("í", "i");
			    letterMap.put("ó", "o");
			    letterMap.put("ú", "u");
			    letterMap.put("á", "a");
			    letterMap.put("ch", "ʧ");
			    letterMap.put("d", "ð");
			    letterMap.put("h", "x");
			    letterMap.put("b", "β");
			    letterMap.put("g", "ɤ");
			    

			    StringBuilder output = new StringBuilder();
			    boolean temp;
			    temp = false;
			    for (String c : input.split("")) {
			  
			    	
			    	if (c.equals("l")) {
			    		if (temp) {
			    			output.append("ʃ");
			    			temp = false;
			    		}
			    		else {
			    			temp = true;
			    		}
			    	} else {
			    		
			    		if (temp) {
			    			output.append("l");
			    		}
			    		output.append(letterMap.getOrDefault(c, c));
			    		temp = false;
			    
			    	}
			    }
			    
			    if(temp) {
			    	output.append("l");
			    }
			    	
			    System.out.println(output.toString());
		}
		
		
		if (userInput.equals("España centro-norteño") | userInput.equals("españa centro-norteño")| userInput.equals("Espana centro-norteno")| userInput.equals("espana centro-norteno")) {
			String input = JOptionPane.showInputDialog("Entre en una palabra/oración por favor");
			 Map<String, String> letterMap = new HashMap<>();
			    letterMap.put("ll","ʎ");
			    letterMap.put("y","ʝ");
			    letterMap.put("j", "x");
			    letterMap.put("s", "s̺");
			    letterMap.put("z", "θ");
			    letterMap.put("c", "k");
			    letterMap.put("v", "β");
			    letterMap.put("é", "e");
			    letterMap.put("í", "i");
			    letterMap.put("ó", "o");
			    letterMap.put("ú", "u");
			    letterMap.put("á", "a");
			    letterMap.put("ch", "ʧ");
			    letterMap.put("d", "ð");
			    letterMap.put("h", "x");
			    letterMap.put("b", "β");
			    letterMap.put("g", "ɤ");

			    StringBuilder output = new StringBuilder();
			    boolean temp;
			    temp = false;
			    for (String c : input.split("")) {
			  
			    	
			    	if (c.equals("l")) {
			    		if (temp) {
			    			output.append("ʝ");
			    			temp = false;
			    		}
			    		else {
			    			temp = true;
			    		}
			    	} else {
			    		
			    		if (temp) {
			    			output.append("l");
			    		}
			    		output.append(letterMap.getOrDefault(c, c));
			    		temp = false;
			    
			    	}
			    }
			    
			    if(temp) {
			    	output.append("l");
			    }
			    	
			    System.out.println(output.toString());
		}
		else {
			System.out.println("ELIJA UN DIALECTO DE LAS OPCIONES Y INTENTE DE NUEVO ☺");
		}
	}
}