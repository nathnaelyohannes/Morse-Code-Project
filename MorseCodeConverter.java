import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MorseCodeConverter {
	
	private static MorseCodeTree morseCodeTree = new MorseCodeTree();
	
	public MorseCodeConverter() {
		
	}
	
	public static String printTree() {
		ArrayList<String> treeData = morseCodeTree.toArrayList();
		return String.join(" ", treeData);
	}
	
	public static String convertToEnglish(String code) {
		String[] words = code.trim().split(" / ");
		StringBuilder english = new StringBuilder();
		
		for(String word : words) {
			for(String morseChar : word.split(" ")) {
				english.append(morseCodeTree.fetch(morseChar));
			}
			english.append(" ");
		}
		
		return english.toString().trim().toLowerCase();
	}
	
	public static String convertToEnglish(File codeFile) throws FileNotFoundException{
		Scanner scanner = new Scanner(codeFile);
		StringBuilder code = new StringBuilder();
		
		while(scanner.hasNextLine()) {
			code.append(scanner.nextLine()).append(" / ");
		}
		scanner.close();
		
		return convertToEnglish(code.toString().trim());
	}

}