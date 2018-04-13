package adapter;

import java.util.Iterator;
import java.util.StringTokenizer;

public class Client {
	
	public static void main(String args[]) {
		printWordsLineByLine("This is a wonderful day");
	}
	
	private static void printWordsLineByLine(String input) {
		StringTokenizer tokenizer = new StringTokenizer(input);
		
		TokernizerToIterator t = new TokernizerToIterator(tokenizer);
		//the iterator should contain the elements of the tokenizer
		Iterator<String> iterator = null;
		
		//Since we implemented the iterator, we will basically create new object and pass
		
		//function elementsToString() takes as input an Iterator
		String output = CollectionLibrary.elementsToString(t);
		System.out.print(output);
	}
}
