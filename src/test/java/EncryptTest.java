import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public  void  encrypt_moveByOne_ArrayList(){}
    Encrypt testEncrypt= new Encrypt();
    List<Object> cipherText=new ArrayList<Object>();
    cipherText.replace('abc','wxz');
    assertEquals(cipherText,testEncrypt.encrypt);

}
