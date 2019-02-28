import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Lab10_1_ArrayList_Solution {
	
	private static class Word {
		String w;
		int cnt;
		Word(String wd) {
			w = wd; 
			cnt = 1;
			}
	}
	
	static ArrayList<Word> l = new ArrayList<Word>();
	
	private static Word isFound(String str) {
		if(str == null) 
			return null;
		
		for(Word tmp : l) {
			if(tmp.w.equals(str)) {
				return(tmp);
			}
		}
		return null;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader f_reader = new BufferedReader(new FileReader("D:\\chain\\chain\\chain\\chain2\\src\\test01.txt"));
				
		String str = null;
		do {
			str = f_reader.readLine();
			if(str == null) 
				break;
			Word w = isFound(str);
			if(w != null) {
				w.cnt++;
			} else {
				l.add(new Word(str));
			}	
		} while (true);
		long start=System.currentTimeMillis();
		Word w = isFound("daisy");
		if(w != null) {
			System.out.println("Found");
			System.out.println(w.cnt);
		} else {
			System.out.println("Not found");
		}
		f_reader.close();
		long stop=System.currentTimeMillis();
		System.out.println("Time = "+(stop-start));
	}
}