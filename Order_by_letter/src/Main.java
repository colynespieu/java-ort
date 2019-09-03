
public class Main {
	public static void main(String[] args) {
		
		char[] alphaorder = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String[] words = {"salut","werleyyyy","python","is","better","ma","voici","good_year","konnichiwa","hello","tata","coco"};
		String[] wordsinorder = new String[words.length];
		int indice = 0;
		
		for (char alphaletter : alphaorder) {
			for (String word : words) {
				if (word.charAt(0) == alphaletter) {
					wordsinorder[indice] = word;
					indice++;
				}
			}
		}
		for (String wordprintable : wordsinorder) {
			System.out.println(wordprintable);
		}
	}
}