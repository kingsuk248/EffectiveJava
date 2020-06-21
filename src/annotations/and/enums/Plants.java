package annotations.and.enums;

public class Plants {
	
	private final String name;
	private final Lifecycle lifecycle;
	
	Plants(String name, Lifecycle l) {
		this.name = name;
		this.lifecycle = l;
	}
	
	enum Lifecycle {
		ANNUAL,
		BIENNIAL,
		PERENNIAL
	}
	
	@Override
	public String toString() {
		return this.name;
	}

	public String getName() {
		return name;
	}

	public Lifecycle getLifecycle() {
		return lifecycle;
	}
}
