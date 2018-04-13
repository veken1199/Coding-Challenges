package adapter;

import java.util.Iterator;
import java.util.StringTokenizer;

public class TokernizerToIterator implements Iterator<String> {
	private StringTokenizer tokernizer;
	
	
	public TokernizerToIterator(StringTokenizer tokernizer) {
		super();
		this.tokernizer = tokernizer;
	}
	

	// This is the request method basically 
	@Override
	public boolean hasNext() {
		return this.tokernizer.hasMoreTokens();
	}


	@Override
	public String next() {
		return this.tokernizer.nextToken();
	}
	
	
}
