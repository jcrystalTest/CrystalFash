package dev.jcrystal.crystalfash.entities;


public enum Categories {
	MEN(1000, "Men"),
	WOMEN(2000, "Women"),
	KIDS(3000, "Kids");
	public final long id;
	public final String name;
	private Categories(long id, String name) {
		this.id = id;
		this.name = name;
	}
	public static Categories fromId(int id) {
		for (Categories val: Categories.values()) {
			if (val.id==id) {
				return val;
			}
		}
		return null;
	}
}