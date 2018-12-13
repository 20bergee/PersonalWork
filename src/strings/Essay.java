package strings;

public class Essay {
private String name;
private String text;
public Essay(){
	name="John Smith";
	text="Computer Science is pretty cool";
}
public void setName(String xName){
	name=xName;}
public void setText(String xText){
	text=xText;
}
public String getLastName(){
int index=name.indexOf(" ");
String last=name.substring(index+1,name.length());
return last.toUpperCase();
}
public int getCharacters(){
	int index=name.indexOf(" ");
String first=name.substring(0,index);
int length=first.length();
return length;
}
public boolean predicate(){
	boolean x=name.contains("X"); 
	return x;
	}
public int words(){
	int word=1;
for (int index=0; index<text.length(); index++){
	if (text.charAt(index)==' '){
		word++;
	}
}
return word;}
}

