import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Lab10_1_BinarySearchTree_Solution {
	
	private static class Word {
		String w;
		int cnt;
		Word(String wd) {
			w = wd; 
			cnt = 1;
		}
	}
	static BST<String, Word> bin_t = new BST<String, Word>();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader f_reader = new BufferedReader(new FileReader("D:\\chain\\chain\\chain\\chain2\\src\\test01.txt"));
				
		String str = null;
		do {
			str = f_reader.readLine();
			if(str == null) 
				break;
			Word w = bin_t.get(str);
			if(w != null) {
				w.cnt++;
			} else {
				bin_t.put(str, new Word(str));
			}	
		} while (true);
		long start=System.currentTimeMillis();
		Word w = bin_t.get("daisy");
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