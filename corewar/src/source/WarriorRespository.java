package source;

import java.io.File;
import java.util.ArrayList;

public class WarriorRespository {
	private ArrayList<Warrior> warriorList;
	private String warriorPath = new String("E:\\java\\eclipse\\corewar\\WarriorRespository");
	
	public WarriorRespository() {
		File warriorDirect = new File(warriorPath);
		File[] listwarriors = warriorDirect.listFiles();
		
		for(int i=0;i<listwarriors.length;i++) {
			if(listwarriors[i].isFile()) {
				warriorList.add(new Warrior(listwarriors[i]));
			}
		}
	}
}
