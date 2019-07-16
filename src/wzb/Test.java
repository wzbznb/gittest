package wzb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {
     
	public static void main(String[] args) {

		  Map<String, String> map = new HashMap<String, String>(); 
		  List<Map.Entry<String, String>> topnProductList = new ArrayList<Map.Entry<String, String>>(); 
		  Map<String,String> map123=new HashMap<String,String>();
		  map123.put("1","one");
		  map123.put("2","two");
		  map123.put("3","three");
		  for (Map.Entry<String, String> productCountEntry : map123.entrySet()) {
			  topnProductList.add(productCountEntry);
		}
		  map.put("key1", "value1");    
		  map.put("key2", "value2");    
		  map.put("key3", "value3");    
		 
			for(Map.Entry<String, String> topnProductEntry : topnProductList) {
				System.out.println("----------------------"+topnProductEntry.getKey()+"--------"+topnProductEntry.getValue());
			}
		      
		  //第一种：普遍使用，二次取值    
		  System.out.println("第1种通过Map.keySet遍历key和value：");    
		  for (String key : map.keySet()) {    
		   System.out.println("key= "+ key + " and value= " + map.get(key));    
		  }    
		      
		  //第二种    
		  System.out.println("第2种通过Map.entrySet使用iterator遍历key和value：");    
		  Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();    
		  while (it.hasNext()) {    
		   Map.Entry<String, String> entry = it.next();    
		   System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());    
		  }    
		      
		 //第三种：推荐，尤其是容量大时</span>    
		  System.out.println("第3种通过Map.entrySet遍历key和value");    
		  for (Map.Entry<String, String> entry : map.entrySet()) {    
		   System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());    
		  }    
		    
		  //第四种    
		  System.out.println("第4种通过Map.values()遍历所有的value，但不能遍历key");    
		  for (String v : map.values()) {    
		   System.out.println("value= " + v);    
		  }
	}

}
