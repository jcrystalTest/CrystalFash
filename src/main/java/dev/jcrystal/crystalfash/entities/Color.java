package dev.jcrystal.crystalfash.entities;

public enum Color {
	RED(1000),
	BLUE(2000),
	YELLOW(3000);
	public final long id;
	private Color(long id) {
		this.id = id;
	}
	public static Color fromId(long id) {
		for (Color val: Color.values()) {
			if (val.id==id) {
				return val;
			}
		}
		return null;
	}

}
