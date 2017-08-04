package IntroToHashMaps;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(reverse(""));
	}

	static String reverse(String word) {
		if (word.length() == 1) {
			return word;
		} else {

			return reverse(word.substring(1)) + word.charAt(0);
		}
	}
}
