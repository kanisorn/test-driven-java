import java.util.ArrayList;
import java.util.List;


public class MainClass {

	public static void main(String[] args) {
		DuplicateRemover.getUnique(getDuplicateList());
		DuplicateRemover.getUnique_1(getDuplicateList());
		DuplicateRemover.getUniqueWithOccurence(getDuplicateList());
	}

	private static List<String> getDuplicateList() {
		
		List<String> duplicateList = new ArrayList<String>();
		duplicateList.add("goofy");
		duplicateList.add("betty");
		duplicateList.add("omega");
		duplicateList.add("betty");
		duplicateList.add("foto");
		duplicateList.add("goofy");
		duplicateList.add("goofy");
		duplicateList.add("betty");
		duplicateList.add("omega");
		duplicateList.add("betty");
		duplicateList.add("foto");
		duplicateList.add("goofy");
		
		return duplicateList;
	}
}
