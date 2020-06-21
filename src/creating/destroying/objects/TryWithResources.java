package creating.destroying.objects;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TryWithResources {
	public void copy(String src, String dest) throws IOException {
		try (
				InputStream is = new FileInputStream(src);
				OutputStream os = new FileOutputStream(dest);
			) {
			byte[] b = new byte[1000];
			int n;
			while ((n = is.read(b)) >= 0) {
				os.write(b, 0, n);
			}
		}
	}
}
