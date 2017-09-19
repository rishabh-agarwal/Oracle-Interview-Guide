/*Map Example*/

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

	public static void main(String[] args)
	{
		// English to Spanish Dictionary
		Map<String,String> englSpanDictionary = new HashMap<String,String>();
		// Putting things inside our dictionary
		englSpanDictionary.put("Monday","Lunes");
		englSpanDictionary.put("Tueday", "Martes"); 
		englSpanDictionary.put("Wednesday", "Miercoles");
		englSpanDictionary.put("Thrusday", "Jueves");
		englSpanDictionary.put("Friday", "Viernes");
		englSpanDictionary.put("Saturday", "sabado");
		englSpanDictionary.put("Sunday", "Domingo");
		// Retrieve things from our dictionary
		System.out.println(englSpanDictionary.get("Monday"));
		System.out.println(englSpanDictionary.get("Tuesday"));
		System.out.println(englSpanDictionary.get("Wednesday"));
		System.out.println(englSpanDictionary.get("Thrusday"));
		System.out.println(englSpanDictionary.get("Friday"));
		
		System.out.println(englSpanDictionary.keySet());
		System.out.println(englSpanDictionary.values());
		
		System.out.println("The Size of our Dictionary is: "+englSpanDictionary.size());
		
		System.out.println();
		System.out.println();
		
		Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
		//why we can't write small boolean, need to be capitalize as there is 
		//no reference to it, capitalizing it make a object to boolean
		
		shoppingList.put("Ham", true);
		shoppingList.put("Bread", Boolean.TRUE);
		shoppingList.put("Oreos", Boolean.TRUE);
		shoppingList.put("Eggs", Boolean.FALSE);
		shoppingList.put("Sugar", false);
		
		//Retrieve item
		System.out.println(shoppingList.get("Ham"));
		System.out.println(shoppingList.get("Oreos"));
		System.out.println(shoppingList.toString());
		
		//Remove things
		shoppingList.remove("Eggs");
		System.out.println("Eggs Remove:"+shoppingList.toString());
		
		//Replace value
		shoppingList.replace("Bread", Boolean.FALSE);
		System.out.println("Bread Replace:"+shoppingList.toString());
		// Key Value Pairs Print Out
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.isEmpty());
	
	}
}
