package methods.common.objects;

public class HashTable implements Cloneable {
	public Entry[] buckets;
	
	
	private static class Entry {
		final Object key;
		private Object value;
		private Entry next;
		
		Entry(Object k, Object v, Entry n) {
			this.key = k;
			this.value = v;
			this.next = n;
		}
		
		Entry deepCopy() {
			return new Entry(key, value, next == null ? null : next.deepCopy());
		}
	}
	
	@Override
	public HashTable clone() {
		try {
			HashTable ht = (HashTable)super.clone();
			ht.buckets = this.buckets;
			for (int i = 0; i < buckets.length; i++) {
				ht.buckets[i] = this.buckets[i].deepCopy();
			}
			return ht;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
}
