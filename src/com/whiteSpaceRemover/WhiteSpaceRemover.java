package com.whiteSpaceRemover;

public class WhiteSpaceRemover {

	StringBuffer spaceRemove(String str)
	{
		StringBuffer strBuff=new StringBuffer();
		char[] strArray=new char[str.length()];
		strArray=str.toCharArray();
		for(char i: strArray)
		{
			if(i!=' ')
			{
				strBuff.append(i);
			}
		}
		return strBuff;
	}
	
		public static void main(String[] args) {
			
			WhiteSpaceRemover ob=new WhiteSpaceRemover();
			String str=" Hello world how hello pratik how are you you are fine say hello ";
			StringBuffer cleanString=ob.spaceRemove(str);
			System.out.println(cleanString);
			
		}
}
