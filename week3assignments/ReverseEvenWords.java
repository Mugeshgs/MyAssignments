package week3assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {

String s="I am a software tester";

s.split(s);

char ch[] =s.toCharArray();

System.out.println("Odd Position");
for(int i=0;i<ch.length;i++) {
	
	if(i%2!=0) {
	
	System.out.println(ch[i]);	
}

		
	}

System.out.println("Even Position Reversed");

for(int i=ch.length-1;i>=0;i--)
{
	if(i%2==0) {
	System.out.println(ch[i]);

}
}
	}

}
