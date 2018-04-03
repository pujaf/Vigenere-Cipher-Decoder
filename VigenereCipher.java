import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class VigenereCipher {
	
    public static void main(String[] args) {
    	String array1[]=new String[2000];
        String array2[]=new String[3999];  
        String key = null;
        
        String cipherText="C R R S S E B W C V H U Z Y I F O A C P L X B S X Q W J R X W K R N H E D E G W D V G P C Y M A I S F E P R L W K Z A Q N L E C B E W A O A P M L R Q W F W M A K Q S I Z M A S V Y S Y J R B V S N R K P W V C D G O G P W C U K E W J S I Z Q Y S T A P A P O D L C Q N E V B Y G P A D I Z W Y H G X F X Q O W Z C O E W M F S B I O L L B V O E S E D W W A O G V E Y K B V O E S P S E B W N B B K E Y V R O E G P L R L A I V B O E M V Q D J O O C M O V D J V W E M V G D V B Y E X P S S A G P T R K H D U O P W I L A O G C E Y W Q G D B B A I E U W X V B C E L W G O P C B Q I M Q E C G Y S Y B B Y Z C N P R W K G R T K W P W K O Q X K S R Q B D B V E D W B I N L O J O L M Q V B G A O X P S N B C N M I P W X Q I O X V E S V Y G S L W I D V R O O L R B A K A C B X M L R V R O C P A Q H R X S A Y I G S C N B Z E L M H I C W Y L P T O G L S N D Q W I D U X K S R Q B D E C Z F G M R E F P K E L I B N R L L W E Q B O Q H D P V M O C B B K Q S C F Z E S O P R K S I B I S T P T I X Q S N D X I B N J S H W W P S K Q R A O X P O D G V E D M A O V Y G P C M K H V L D N T Z I H O J S W C I A H S Y Z D Z T Q B Q G V W E X P S B R K E W P B I B A C Q E X W P O A C J P I L T Y E W J G I A H S T O P T S V C P N B U V M V R A H W P P W W E E V H A D S A O S Q A N H I T Z C F C K E L Q B Q Y M E H M A V G R Q K F P L V K I S O A E Z S N L C Q E L M D K V B W Y H X I L Y W Y T X G C P N B E Y U C S C G P Q E S N Q Y H F O P M B G A H W P P Y V O F B W Z L F T S S A H D P E J G O A Q A Z J I R Y P H K C W K S B G W B T G I H O L S O T W C D Z B G A D S K Z O I S N X E V P K H S N D X M W X T F A L X I I D U C N T X G C X G C T T G W Z Y T M E M I T W O I S E Y H M S N F O E O N W V X J W P S E K S B G O E Y W B W P S B A D W Q B R V G I L R V S B G V A Y L M O N Q S Z C E B V O E V A D M B O D V B C W C A V K Y Z S P L I J O G C W A T M O B N G S T X V S C F S O L P T C P H G E X I I B I B I K Q G W I B F S W Y H I V O E A N P V Q B Q Y S P S S Z D K F Z E R L B D K H G A P R A I O Q P A Q S Z S D U S H L A G S B J S J E S V W X U W O D S W H R V B C X E V B O E O J J S B V O E S R T H M B M R K E W P J S C V A L W C K C X S W N X E B C B L O I P V M A K G H A C S N T Y E A E D I M O P N W J E I F D B R G O T S V C P E S H T I N G G R D P Z Z M F T B V J D J I Q O V H L F D H Z O Q A A Q S Z W C N K J Z S K Q K F W K Y J W F S G W B J S C Y X B K K Q R W H R V B C E S B V O P C J E V I F I C I N D Y M R W E K A W P A W R N R P S S C U R G C B Q V Q R K L H D L X E W V Y U E G I C G Z Y S J E C W T D V A A Q S Z H R R R K N X W F C E S L Z V B H R R D K D X U C B G S I T W B C D N Y A A P I Q O G C J T K P H S O S H T I D S I R G P S I V H R N H W C V I B Q R A A Y X E W V Y G Q T X G C E C S N Q I K H V L W J P I L B Y G H A W P G C E Z M Z P E Z Q K I S J O M A V R B K Z T W B F O F G A O M I A K G H D T W U C C G H N L K Q Q K S T W T V K O X L C Q R M D S E F B K S I T D S A G K W Z Q B Q V H I Z R A W O H F E Y X M F Z B G A O T W W B B H O A I I Y S A U B Z V B V O S W N D X B W W R G E Y G M K O U O Z P R B S B R R P S I Z C Y Z W U P W E S R R O N O X P O D Z F O T R O Z O G V K C T E F Y G S P Z C W I V N G P Y M O V D L C Q D L W I V Q V W G I Z S M R W R P H B V O Y S P E I Z H R V G I Z V V W X T W Z T H J I D V H Y Z R B O S A G J Z M V T Y E A W E M W B S G W O X I Z S V L O J Z X M O C X W J R Q M H Y P O H W Y X C X U S N E L Q G W B F J T R O O C F V A H E V H O Q A U L H D W M R C J L Q I H D R F K Q K Z S K G W I A S Z H K A Q A D L M U K I S U Z Y V C R V B P L W B C G U O P E L I H W N H P P V U W Q U H X P Y V T Y E H Q Y E B S V L B K E L I H S F O L T X G G K V R F Z L V O Q E S W E T Q H I N U N P I L D Y V F K E K Z O F R Z U E L M F O J O O D M T S X P S L Z M Z C D E S I L M V S N Y C O E M V H R B I C S X N C B N T A H Q Q B E G S O Q M V O V Y M D P X C F X R R P Z X P S V N K U P V I U K V B I C A M Z V F H D P V M W C B B A E L Q B Q V G D Z Y T R V V Y A E S I G U L C Q E L I H S F W B T X Q G X B H W R E Q B C G D N Z J M G"; 
        String[] CipherString = cipherText.split(" ");
    for(int i=0;i<CipherString.length;i++)
  {
  	array1[i]=CipherString[i];
  } 
    String cipherTextCopy=" C R R S S E B W C V H U Z Y I F O A C P L X B S X Q W J R X W K R N H E D E G W D V G P C Y M A I S F E P R L W K Z A Q N L E C B E W A O A P M L R Q W F W M A K Q S I Z M A S V Y S Y J R B V S N R K P W V C D G O G P W C U K E W J S I Z Q Y S T A P A P O D L C Q N E V B Y G P A D I Z W Y H G X F X Q O W Z C O E W M F S B I O L L B V O E S E D W W A O G V E Y K B V O E S P S E B W N B B K E Y V R O E G P L R L A I V B O E M V Q D J O O C M O V D J V W E M V G D V B Y E X P S S A G P T R K H D U O P W I L A O G C E Y W Q G D B B A I E U W X V B C E L W G O P C B Q I M Q E C G Y S Y B B Y Z C N P R W K G R T K W P W K O Q X K S R Q B D B V E D W B I N L O J O L M Q V B G A O X P S N B C N M I P W X Q I O X V E S V Y G S L W I D V R O O L R B A K A C B X M L R V R O C P A Q H R X S A Y I G S C N B Z E L M H I C W Y L P T O G L S N D Q W I D U X K S R Q B D E C Z F G M R E F P K E L I B N R L L W E Q B O Q H D P V M O C B B K Q S C F Z E S O P R K S I B I S T P T I X Q S N D X I B N J S H W W P S K Q R A O X P O D G V E D M A O V Y G P C M K H V L D N T Z I H O J S W C I A H S Y Z D Z T Q B Q G V W E X P S B R K E W P B I B A C Q E X W P O A C J P I L T Y E W J G I A H S T O P T S V C P N B U V M V R A H W P P W W E E V H A D S A O S Q A N H I T Z C F C K E L Q B Q Y M E H M A V G R Q K F P L V K I S O A E Z S N L C Q E L M D K V B W Y H X I L Y W Y T X G C P N B E Y U C S C G P Q E S N Q Y H F O P M B G A H W P P Y V O F B W Z L F T S S A H D P E J G O A Q A Z J I R Y P H K C W K S B G W B T G I H O L S O T W C D Z B G A D S K Z O I S N X E V P K H S N D X M W X T F A L X I I D U C N T X G C X G C T T G W Z Y T M E M I T W O I S E Y H M S N F O E O N W V X J W P S E K S B G O E Y W B W P S B A D W Q B R V G I L R V S B G V A Y L M O N Q S Z C E B V O E V A D M B O D V B C W C A V K Y Z S P L I J O G C W A T M O B N G S T X V S C F S O L P T C P H G E X I I B I B I K Q G W I B F S W Y H I V O E A N P V Q B Q Y S P S S Z D K F Z E R L B D K H G A P R A I O Q P A Q S Z S D U S H L A G S B J S J E S V W X U W O D S W H R V B C X E V B O E O J J S B V O E S R T H M B M R K E W P J S C V A L W C K C X S W N X E B C B L O I P V M A K G H A C S N T Y E A E D I M O P N W J E I F D B R G O T S V C P E S H T I N G G R D P Z Z M F T B V J D J I Q O V H L F D H Z O Q A A Q S Z W C N K J Z S K Q K F W K Y J W F S G W B J S C Y X B K K Q R W H R V B C E S B V O P C J E V I F I C I N D Y M R W E K A W P A W R N R P S S C U R G C B Q V Q R K L H D L X E W V Y U E G I C G Z Y S J E C W T D V A A Q S Z H R R R K N X W F C E S L Z V B H R R D K D X U C B G S I T W B C D N Y A A P I Q O G C J T K P H S O S H T I D S I R G P S I V H R N H W C V I B Q R A A Y X E W V Y G Q T X G C E C S N Q I K H V L W J P I L B Y G H A W P G C E Z M Z P E Z Q K I S J O M A V R B K Z T W B F O F G A O M I A K G H D T W U C C G H N L K Q Q K S T W T V K O X L C Q R M D S E F B K S I T D S A G K W Z Q B Q V H I Z R A W O H F E Y X M F Z B G A O T W W B B H O A I I Y S A U B Z V B V O S W N D X B W W R G E Y G M K O U O Z P R B S B R R P S I Z C Y Z W U P W E S R R O N O X P O D Z F O T R O Z O G V K C T E F Y G S P Z C W I V N G P Y M O V D L C Q D L W I V Q V W G I Z S M R W R P H B V O Y S P E I Z H R V G I Z V V W X T W Z T H J I D V H Y Z R B O S A G J Z M V T Y E A W E M W B S G W O X I Z S V L O J Z X M O C X W J R Q M H Y P O H W Y X C X U S N E L Q G W B F J T R O O C F V A H E V H O Q A U L H D W M R C J L Q I H D R F K Q K Z S K G W I A S Z H K A Q A D L M U K I S U Z Y V C R V B P L W B C G U O P E L I H W N H P P V U W Q U H X P Y V T Y E H Q Y E B S V L B K E L I H S F O L T X G G K V R F Z L V O Q E S W E T Q H I N U N P I L D Y V F K E K Z O F R Z U E L M F O J O O D M T S X P S L Z M Z C D E S I L M V S N Y C O E M V H R B I C S X N C B N T A H Q Q B E G S O Q M V O V Y M D P X C F X R R P Z X P S V N K U P V I U K V B I C A M Z V F H D P V M W C B B A E L Q B Q V G D Z Y T R V V Y A E S I G U L C Q E L I H S F W B T X Q G X B H W R E Q B C G D N Z J M G"; 
    String[] CipherStringCopy = cipherTextCopy.split(" ");

    for(int i=0;i<CipherStringCopy.length;i++)
   {
   	  array2[i]=CipherStringCopy[i];
   }
         String enc =cipherText.replaceAll("\\s+","");
        Integer lengthofKey= determineKeyLength(array1,array2);
        String[] keyValue=findKey(CipherString,lengthofKey);
        StringBuilder builder = new StringBuilder();
	       for(String s : keyValue) {
	           builder.append(s);
	       }
	       key=builder.toString();
           System.out.println(decrypt(enc, key));
    }

  //determine the length of the Key using Kerchoff's method
   public static Integer determineKeyLength(String[] array1,String[] array2)
   {
	
       int aonetwo[]=new int[1998];
       int bonetwo[]=new int[1998];
       int array[]=new int[18];
       int bb[]=new int[18];
       int cc[]=new int[18];
       
          int n,leng,count1 = 0; 
	       int j=0,k=0,aaa=1,diference=1,vcx=1,dsa=0,lkj=0,mnb=0;
	       int counter=0,count=0,c=0;
	       int y=0,y1=0;
       
      
       for(int i=1;i<array1.length-1;)
       {
          for(j=i;j<array2.length-1;j++)
         
         {	              
           if(array1[i].equals(array2[j]))
            {
              counter++; 
            }
                      
           i++;
         
           if(i>array1.length-1)
            {
               aaa++;
               i=aaa;
               break;
            }        
             
         }
         
           aonetwo[y]=count;
           y++;
           
           bonetwo[y1]=counter;
           y1++;
           System.out.println("Number of coincidences  "+counter);
            
           if(c<18)
           {
             array[c]=counter;
             c++;
           }   
           
           count++;
           counter=0;
         for(k=j+vcx;k>=diference;k--)
         {
       	  array2[k+1]=array2[k]; 
         }
         vcx++;
         dsa=diference;
         diference++;
         
         for(lkj=dsa;lkj>=0;lkj--)
         {
       	  array2[lkj]=" "; 
         }   
       }
     
 for(int i=0;i<array.length;i++)
   {
     if(array[i]==0)
     {
      bb[i]=0;   
     }   
     else
     {    
     n=array[i]; 
     leng = (int)(Math.log10(n)+1);    
     bb[i]=leng;
     }
   }   
	    
   int larg=bb[0];
   for(int i=1;i<bb.length;i++)
   {
         if(bb[i] > larg)
         {  
           larg = bb[i];
          }
   }      
   
  for(int i=0;i<bb.length;i++)
  {
  
     if(larg==bb[i])
     {
      cc[count1]=i;
         count1++;
     }   
  } 
  
   int klength=0;   
   klength=cc[1]-cc[0];    
   System.out.println("");
   System.out.println("keylength = "+" "+klength);
   System.out.println("");
   return klength;
  }
   
   //to decrypte the ciphertext using the Key
   public static String decrypt(String text, final String key) {
       String res = "";
       text = text.toUpperCase();
       for (int i = 0, j = 0; i < text.length(); i++) {
           char c = text.charAt(i);
           if (c < 'A' || c > 'Z') continue;
           res += (char)((c - key.charAt(j) + 26) % 26 + 'A');
           j = ++j % key.length();
       }
       return res;
   }
   //to perform cyclic shift
   public static Double[] shift(Double[] arr, int k)
	{
	    k = k % arr.length;
	    while (k-- > 0)
	    {

	        Double tmp = arr[arr.length-1];
	        for (int i = arr.length-1; i >0; i--){
           arr[i] = arr[i-1];}
	        arr[0] = tmp;

	    }
		return arr;
	}
   //check and add if an entry with all the alphabets are not entered to the hashmap
   public static Map<Character, Double> check(Map<Character, Double> freqlist){
		 if(!freqlist.containsKey('A')){
			 freqlist.put('A', (double) 0);
       } if(!freqlist.containsKey('B')){
			 freqlist.put('B', (double) 0);
       } if(!freqlist.containsKey('C')){
			 freqlist.put('C', (double) 0);
       } if(!freqlist.containsKey('D')){
			 freqlist.put('D', (double) 0);
       } if(!freqlist.containsKey('E')){
			 freqlist.put('E', (double) 0);
       } if(!freqlist.containsKey('F')){
			 freqlist.put('F', (double) 0);
       } if(!freqlist.containsKey('G')){
			 freqlist.put('G', (double) 0);
       } if(!freqlist.containsKey('H')){
			 freqlist.put('H', (double) 0);
       } if(!freqlist.containsKey('I')){
			 freqlist.put('I', (double) 0);
       } if(!freqlist.containsKey('J')){
			 freqlist.put('J', (double) 0);
       } if(!freqlist.containsKey('K')){
			 freqlist.put('K', (double) 0);
       } if(!freqlist.containsKey('L')){
			 freqlist.put('L', (double) 0);
       } if(!freqlist.containsKey('M')){
			 freqlist.put('M', (double) 0);
       }  if(!freqlist.containsKey('N')){
			 freqlist.put('N', (double) 0);
       } if(!freqlist.containsKey('O')){
			 freqlist.put('O', (double) 0);
       } if(!freqlist.containsKey('P')){
			 freqlist.put('P', (double) 0);
       } if(!freqlist.containsKey('Q')){
			 freqlist.put('Q', (double) 0);
       } if(!freqlist.containsKey('R')){
			 freqlist.put('R', (double) 0);
       } if(!freqlist.containsKey('S')){
			 freqlist.put('S', (double) 0);
       } if(!freqlist.containsKey('T')){
			 freqlist.put('T', (double) 0);
       } if(!freqlist.containsKey('U')){
			 freqlist.put('U', (double) 0);
       } if(!freqlist.containsKey('V')){
			 freqlist.put('V', (double) 0);
       } if(!freqlist.containsKey('W')){
			 freqlist.put('W', (double) 0);
       } if(!freqlist.containsKey('X')){
			 freqlist.put('X', (double) 0);
       } if(!freqlist.containsKey('Y')){
			 freqlist.put('Y', (double) 0);
       } if(!freqlist.containsKey('Z')){
			 freqlist.put('Z',(double) 0);
       }
		 return freqlist;
	}
	//Convert the integer values to equivalent alphabet value
	static String checkValue(Integer array){
		String keyvalue = null;
		
		if(array.equals(0)){
			keyvalue="A";
      } if(array.equals(1)){
			keyvalue="B";
      }if(array.equals(2)){
			keyvalue="C";
      }if(array.equals(3)){
			keyvalue="D";
      }if(array.equals(4)){
			keyvalue="E";
      }if(array.equals(5)){
			keyvalue="F";
      }if(array.equals(6)){
			keyvalue="G";
      }if(array.equals(7)){
			keyvalue="H";
      }if(array.equals(8)){
			keyvalue="I";
      }if(array.equals(9)){
			keyvalue="J";
      }if(array.equals(10)){
			keyvalue="K";
      }if(array.equals(11)){
			keyvalue="L";
      }if(array.equals(12)){
			keyvalue="M";
      }if(array.equals(13)){
			keyvalue="N";
      }if(array.equals(14)){
			keyvalue="O";
      }if(array.equals(15)){
			keyvalue="P";
      }if(array.equals(16)){
			keyvalue="Q";
      }if(array.equals(17)){
			keyvalue="R";
      }if(array.equals(18)){
			keyvalue="S";
      }if(array.equals(19)){
			keyvalue="T";
      }if(array.equals(20)){
			keyvalue="U";
      }if(array.equals(21)){
			keyvalue="V";
      }if(array.equals(22)){
			keyvalue="W";
      }if(array.equals(23)){
			keyvalue="X";
      }if(array.equals(24)){
			keyvalue="Y";
      }if(array.equals(25)){
			keyvalue="Z";
      }

	return keyvalue;
		
	}
	static String[] findKey(String [] cipherString,int lengthofKey){

		Integer[] keyarray=new Integer[lengthofKey];
		String[] keyvalue=new String[lengthofKey];
		Double [] freqofalphabetarray={0.08167,0.01492,0.02782,0.04253,0.12702,0.02228,0.02015,0.06094,0.06996,0.00153,0.00772,0.04025,0.02406,0.06749,0.07507,0.01929,0.00095,0.05987,0.06327,0.09056,0.02758,0.00978,0.02360,0.00150,0.01974,0.00074};
	      for(int keysize=0;keysize<keyarray.length;keysize++){
	       String[] ciphershift=new String[250];
	     //Split the Ciphertext into keysize Ciphershift
	       for(int i=0;i<ciphershift.length;i++){
	    	   ciphershift[i]=cipherString[(lengthofKey*i)+keysize];

	       }  
 //convert from string array to string 
	       StringBuilder builder = new StringBuilder();
	       for(String s : ciphershift) {
	           builder.append(s);
	       }
	       String ciphershifttext=builder.toString();
	       int length= ciphershifttext.length();
	       //put all the frequencies to a hashmap
	       char[] charArray = ciphershifttext.toCharArray();
           HashMap<Character, Double> freqList = new HashMap<Character, Double>();

	               for(char key : charArray) {
	                   if(freqList.containsKey(key)) {
	                      freqList.put(key, freqList.get(key) + 1);
	                      
	                   } else
	                       freqList.put(key, (double) 1);
	               }

	               //check and add if any of the alphabet is missing in the hashmap 
	               if(freqList.size()<26){
	              freqList=(HashMap<Character, Double>) check(freqList);}
	               //put the values of hashmap to a double array
            Object[] array=new Object[freqList.size()];
            array=freqList.values().toArray();
            Double[] doublearray= new Double[array.length];
            for(int i=0;i<array.length;i++){

            	doublearray[i]=Double.parseDouble(array[i].toString())/length;
            }
            Double[] resultant=new Double[26];
            Double[] resultantsum=new Double[26];
            //initialize the double array with double value
            for(int i=0;i<resultantsum.length;i++){
            	resultantsum[i]=0.0;
            }
            //perform cyclic shift of the freqofalphabetarray and multiply with the current frequencies
for(int loop1=0;loop1<26;loop1++){
	
	 Double [] rightShiftedArray = shift( freqofalphabetarray, loop1 );

            double sum=0;
            double value=0;
            for (int i = 0 ; i < resultant.length ; i++)
            {

            	resultant[i]= doublearray[i] * rightShiftedArray[i];

                           }
   //calculate the weighted sum
            for(int loop2=0;loop2<resultant.length;loop2++){

            	resultantsum[loop1]=resultant[loop2]+resultantsum[loop1];
            	
            }
}
double max = resultantsum[0];
//determine the maximum value
for (int in = 0; in < resultantsum.length; in++) {
    if (resultantsum[in] > max) {
      max = resultantsum[in];
          
    }
  
} //determine the index of maximum value
int value1 =Arrays.asList(resultantsum).indexOf(max);
keyarray[keysize]=value1+1;
}for(int i=0;i<keyarray.length;i++){
		keyvalue[i]=checkValue(keyarray[i]);
		System.out.println("keyarray"+keyarray[i]);
		System.out.println("keyvalue"+keyvalue[i]);
	}return keyvalue;
}
	
}