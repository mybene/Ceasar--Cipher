
public class Encrypt {

public static  String Encry(String message, int key){
 if (key>26){
 key=key%26;
 }
 else if (key<0){
     key=(key%26)+26;
 }
 String result="";

 for (int i=0; i<message.toCharArray().length;i++){
     char alphabet=message.charAt(i);
     if(Character.isLetter(alphabet)){
         if(Character.isLowerCase(alphabet)){
         char c= (char)(alphabet+key);
         if (c>'z'){
             result +=(char)(alphabet-(26-key));
         }
         else{
             result +=c;
         }
     }
     else if(Character.isUpperCase(alphabet)){
         char c= (char)(alphabet+key);
         if (c>'Z'){
             result +=(char)(alphabet-(26-key));
         }
         else {
             result +=c;

         }
       }
     }
     else{
         result += alphabet;
      }
    }
   return result;
    }
}
