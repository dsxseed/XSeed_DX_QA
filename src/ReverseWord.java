import java.util.Stack;

public class ReverseWord {

	//"Be Social at Scale” Output: “eB laicoS ta elacS"
 public static void main(String [] args){
	 String str = "Be Social at Scale ";
	 char[] input= str.toCharArray();
	 //String rev="";
	 Stack<Character> stk = new Stack<Character>();
	 StringBuilder rev1=new StringBuilder("");
	 for (char c: input){	 
		
		if(c==' ' || c=='\0' && !stk.isEmpty()){
			while(!stk.isEmpty())
		{
			 rev1=rev1.append(stk.pop());
		}
			rev1.append(' ');
		}
		else stk.push(c);
		
	 }
	 System.out.println(rev1);
	 
	 String str1 = "eB laicoS ta elacS";
	 char[] input1= str1.toCharArray();
	 int len = input1.length;
	 for (int i=0,j=len-1;i<j;i++,j--){

	 char temp = input1[i]; 
	 input1[i]=input1[j];
	 input1[j]=temp;
	 }
	 System.out.println(input1);
 }
}
