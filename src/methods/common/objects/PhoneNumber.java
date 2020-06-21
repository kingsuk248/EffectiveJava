package methods.common.objects;

import java.util.Comparator;

public class PhoneNumber implements Cloneable, Comparator<PhoneNumber> {
	final short area, prefix, lineNum;

	public PhoneNumber(int a, int p, int l) {
		this.area = (byte) a;
		this.prefix = (byte) p;
		this.lineNum = (byte) l;
	}

	@Override
	public boolean equals(Object o) {
		if (o.equals(this)) {
			return true;
		}
		if (!(o instanceof PhoneNumber)) {
			return false;
		}
		PhoneNumber opn = (PhoneNumber) o;
		return opn.area == this.area && opn.prefix == this.prefix && opn.lineNum == this.lineNum;
	}

	@Override
	public int hashCode() {
		int result = Short.hashCode(lineNum);
		result += 31 * result + Short.hashCode(area);
		result += 31 * result + Short.hashCode(prefix);
		return result;
	}

	@Override
	public PhoneNumber clone() {
		try {
			return (PhoneNumber) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
	
	@Override
	public int compare(PhoneNumber o1, PhoneNumber o2) {
		int result = Short.compare(area, o2.area);
		if (result == 0)
			Short.compare(prefix, o2.prefix);
		return result;
	}

}
