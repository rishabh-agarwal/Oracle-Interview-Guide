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
		// Retrieve things from our dictionary
		System.out.println(englSpanDictionary.get("Monday"));
		System.out.println(englSpanDictionary.get("Tuesday"));
		System.out.println(englSpanDictionary.get("Wednesday"));
		System.out.println(englSpanDictionary.get("Thrusday"));
		System.out.println(englSpanDictionary.get("Friday"));
		
		System.out.println(englSpanDictionary.keySet());
		System.out.println(englSpanDictionary.values());
	}
}
