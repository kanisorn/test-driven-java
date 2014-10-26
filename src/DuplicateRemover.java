import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Write a Java method getUnique that removes all duplicates in a given list. 
 * Assume the following:
 *   a. The method accepts an object of type List
 *   b. The return type of the method is void
 *   c. Duplicates are determined using the equals() method (rather than by the == operator)
 *   
 * Your implementation of getUnique should handle, in an appropriate way, the case in which a null List is passed in to the method. 
 * Test your method by writing code in a main method, which does the following:
 *   a. It creates an instance of List and loads it with the following String values:
 *      {“goofy”, “betty”, “omega”, “betty”, “foto”, “goofy”, “lazy”, “lazy”, ”omega”}
 *   b. It invokes the getUnique, passing in this instance of List.
 *   c. It outputs the modified list to the console.
 */

public class DuplicateRemover {

	
	/*
	 * Description:
	 *   Iterate to every element from duplicateList and add to uniqueList if it's not duplicate.
	 *   Print out the uniqueList.
	 */
	public static void getUnique(List<String> duplicateList) {
		if (duplicateList.size() <= 1) return;
		
		List<String> uniqueList = new ArrayList<String>();
		uniqueList.add(duplicateList.get(0));
		
		for (int i=1; i<duplicateList.size(); i++) {
			boolean found = false;
			for (int j=0; j<uniqueList.size(); j++) {
				if (duplicateList.get(i).equals(uniqueList.get(j))) {
					found = true;
				}
			}
			
			if (!found) uniqueList.add(duplicateList.get(i));
		}
		
		System.out.println("getUnique");
		for (String item : uniqueList) {
			System.out.println(item);
		}
	}
	
	/*
	 * Description:
	 *   Convert List object "duplicateList" to HashSet
	 *   Print out the uniqueList 
	 */
	public static void getUnique_1(List<String> duplicateList) {
		if (duplicateList.size() <= 1) return;
		Set<String> duplicateSet = new HashSet<String>(duplicateList); 
		
		System.out.println("getUnique_1");
		for (String item : duplicateSet) {
			System.out.println(item);
		}
	}

}
