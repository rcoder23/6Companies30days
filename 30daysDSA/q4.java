class GfG
 {
	
String encode(String str)
	
{

          //Your code here
          
char[] ch=str.toCharArray();

        //   StringBuilder sb=new StringBuilder();

        String ans="";

        ans+=ch[0];

        int cnt=1;
     
 for(int i=1;i<ch.length;i++){

              if(ch[i-1]==ch[i]) cnt++;
 
             else{
                  
                  
ans+=String.valueOf(cnt);
                  
cnt=1;
                  
ans+=ch[i];

              }
          }

          ans+=String.valueOf(cnt);

          return ans;

	}

	
 }