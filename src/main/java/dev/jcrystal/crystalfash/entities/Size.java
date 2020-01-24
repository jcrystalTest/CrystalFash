package dev.jcrystal.crystalfash.entities;

public enum Size {
	XS(1000),
	S(2000),
	M(3000),
	L(4000),
	XL(5000);
	public final long id;
	private Size(long id) {
		this.id = id;
	}
	public static Size fromId(long id) {
		for (Size val: Size.values()) {
			if (val.id==id) {
				return val;
			}
		}
		return null;
	}
}
