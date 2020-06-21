package methods.common.objects;

public class CaseInsensitiveString {
	final String str;
	
	public CaseInsensitiveString(String s) {
		this.str = s;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof CaseInsensitiveString) {
			CaseInsensitiveString ciso = (CaseInsensitiveString) o;
			return this.str.equalsIgnoreCase(ciso.str);
		}
		if (o instanceof String) {
			String str = (String)o;
			return this.str.equalsIgnoreCase(str);
		}
		return false;
	}
}
