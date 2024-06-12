import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Launchjson {
	public static void main(String[] args) throws IOException {
		
		/// java-->json
		StudentsPojo obj=new StudentsPojo();
		obj.setCity("ongole");
		obj.setId(1);
		obj.setName("Deepika");
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writeValueAsString(obj);
	      System.out.println( "Java to json :"+json);
	      
	      //json to java
	      File jsonFile = new File("json/sample.json"); 
	      StudentsPojo obj1= mapper.readValue(jsonFile,StudentsPojo.class);
	      System.out.println(" json to java  :"+obj1);
	      
	}

}
