
public class Main {
	public static void main(String[] args) {
		
		String[] words = {"salut","werleyyyy","python","is","better","ma","voici","good-year","konnichiwa","hello","tata","coco","crayon","stylo","feutre","taille-crayon","pointe","mine","gomme","dessin","coloriage","rayure","peinture","pinceau","couleur","craie","papier","feuille","cahier","carnet","carton","ciseaux","découpage","pliage","plier","colle","affaire","boîte","casier","caisse","trousse","cartable","jouet","jeu"};
		boolean change = true;
		String[] tmplist = new String[2];
		
		while (change == true) {
			change = false;
			
			for (int indice = 0 ; indice < words.length-1 ; indice++ ) {
				tmplist = changeOrder(words[indice] ,words[indice+1] );
				System.out.println(words[indice]);
				System.out.println(tmplist[0]);
				if (tmplist[0].equals(words[indice]) ) {
					words[indice] = tmplist[1]; words[indice+1] = tmplist[0];
					change = true;
				}
			}
		}
		
		for (String wordprintable : words) {
			System.out.println(wordprintable);
		}
	}
	
	public static String[] changeOrder(String word1 , String word2 ) {
		
		char[] alphaorder = { '-',' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String[] twoorder = new String[2];
		int maxcount, iword1 = 0, iword2 = 0 ;
		
		if (word1.length() > word2.length()) {
			maxcount = word2.length();
		}
		else {
			maxcount = word1.length();
		}
		for (int i = 0 ; i < maxcount ; i++) {
			for (int z = 0;z < alphaorder.length;z++ ) {
				if (word1.charAt(i) == alphaorder[z] ) {
					iword1 = z;
				}
				if (word2.charAt(i) == alphaorder[z] ) {
					iword2 = z;
				}
			}
			if (iword1 != iword2) {
				if (iword1 < iword2 ) {
					twoorder[0] = word2; twoorder[1] = word1; 
				}
				else {
					twoorder[0] = word1; twoorder[1] = word2; 
				}
				return twoorder;
			}
		}
		return twoorder;
		
	}
		
//      VERSION PLUS SIMPLE :		
//		
//		for (char alphaletter : alphaorder) {
//			for (String word : words) {
//				if (word.charAt(0) == alphaletter) {
//					wordsinorder[indice] = word;
//					indice++;
//				}
//			}
//		}
//		for (String wordprintable : wordsinorder) {
//			System.out.println(wordprintable);
//		}
//	}
}