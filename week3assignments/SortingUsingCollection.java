package week3assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {

List <String> l=new ArrayList<String>();
l.add("HCL");
l.add("Wipro");
l.add("Aspire Systems");
l.add("CTS");
System.out.println(l.size());
Collections.sort(l);
System.out.println(l);

for(int i=l.size()-1;i>0;i--)
{
System.out.println(l);
}


	}

}
