import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FastStringScanner {
	BufferedReader bf;
	FastStringScanner(InputStream in) {
		bf = new BufferedReader(new InputStreamReader(in));
		
	}
	int readLine() {
		int s = 0;
		try {
			s = Integer.parseInt(bf.readLine());
				//bf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}
	
public static void main(String[] str) throws IOException {
	FastStringScanner fs = new FastStringScanner(System.in);
	HashMap<Integer, Integer> hash = new HashMap<>();
	int s;
	int n = fs.readLine();
	//System.out.println("n "+n);
	int i=1;
	while(i<=n) {
		// code
		s = fs.readLine();
		Integer w = hash.get(s);
		if(w != null) {
			hash.put(s, w+1);
		} else {
			hash.put(s, 1);
		}
		i++;
		/*
		if(w != null) {
			System.out.println("Found");
			System.out.println(w);
		} else {
			System.out.println("Not found");
		}*/
	}
	int n2 = fs.readLine();
	//System.out.println("n2 "+n2);
	int i2=0;
	while(i2<=n2) {
	Integer w = hash.get(fs.readLine());
	//System.out.println(w);
	if(w != null) {
		System.out.println("Yes");
	
	} else {
		System.out.println("No");
	}
	i2++;		

	}
	
	/*if(flag==true)
		System.out.println("duplicate");
	else
		System.out.println("no duplicate");*/
	}
}
