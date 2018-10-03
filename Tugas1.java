
public class Tugas1 {

	public static void main(String[] args) {
		String ss = "AYAM JAGO";
		System.out.println("Plaintextnya : "+ss);
		
		String cc = encript(ss);
		System.out.println("Enkripsinya : "+cc);
		
		String ss1 = decript(cc);
		System.out.println("Dekripsinya : "+ss1);  
		
		
	}
	public static final String[] ss = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," "};
	public static final String[] cc = {"D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C"," "};
	
	
	public static String encript(String plaintext){
		String ciphertext = "";
		for(int i=0 ; i<plaintext.length(); i++){
			String s0 = plaintext.substring(i, i+1);
			String s1 = " ";							
			//
			for(int j=0; j<ss.length; j++){				
				if(s0.equals(ss[j])){					
					s1 = cc[j];
					break;
				}
			}
			ciphertext+=s1;
		}
				
		return ciphertext;
	}
	public static String decript(String ciphertext){
		String plaintext = "";
				for(int i=0 ; i<ciphertext.length(); i++){
					String s0 = ciphertext.substring(i, i+1);
					String s1 = " ";							
					//
					for(int j=0; j<cc.length; j++){				
						if(s0.equals(cc[j])){					
							s1 = ss[j];
							break;
						}
					}
					plaintext+=s1;
				}
		return plaintext;
	}
}
