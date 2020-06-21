package general.programming;

import java.io.InputStream;
import java.net.URL;

public class URLReader {
	public static void main(String[] args) {
		try (InputStream in = new URL("www.amazon.in").openStream()) {
			byte[] b = new byte[2048];
			int i = 0;
			while ((i = in.read(b)) != -1) {
				System.out.print(b[i]);
			}
		} catch (Exception ex) {
			
		}
	}
}
