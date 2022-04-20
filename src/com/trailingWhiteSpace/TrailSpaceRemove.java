package com.trailingWhiteSpace;

public class TrailSpaceRemove {

		StringBuffer spaceRemove(String str)
		{
			StringBuffer strBuff=new StringBuffer();
			char[] strArray=new char[str.length()];
			strArray=str.toCharArray();
			int i=0;
			
			while(strArray[i]==' ')
			{
				i++;
			}
			for(int j=i;j<strArray.length-1;j++)
			{
					if(strArray[j]==' ' && strArray[j+1]!=' ') {
						
						strBuff.append(strArray[j]);
					}
					 else if(strArray[j]!=' ')
					 {
						 strBuff.append(strArray[j]);
					 }
			}
			return strBuff;
		}
			public static void main(String[] args) {
				
				TrailSpaceRemove ob=new TrailSpaceRemove();
				String str="    Hello     world       kito       ";
				StringBuffer cleanString=ob.spaceRemove(str);
				System.out.println(cleanString);
				System.out.println("length--"+cleanString.length());
				
			}
	}

