package source;

import java.io.File;

public class Warrior {
	public String name;
	private File warrior;
	
	public Warrior(File war) {
		this.name = war.getName();
		this.warrior = war;
	}
}
