import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 
public class ReadFileIntoList {

	public static void main(String[] args) {List<String> lines = Collections.emptyList(); 
    try
    { 
      lines = 
       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
    } 
  
    catch (IOException e) 
    { 
      e.printStackTrace(); 
    } 
    return lines; 
  } 
  public static void main(String[] args) 
  { 
    List l = ReadFileIntoList("C:\\Users\\HP\\eclipse-workspace\\MethodOverloading\\src\\ReadFileIntoList.java"); 
  
    Iterator<String> itr = l.iterator(); 
    while (itr.hasNext()) 
      System.out.println(itr.next()); 
  } 
}


