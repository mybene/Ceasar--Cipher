import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void encrypt_moveByOne() {
        Encrypt testEncrypt = new Encrypt();
        List<Object> cipherText = new ArrayList<Object>();
        cipherText.replace('abc', 'bcd');
        assertEquals(true, testEncrypt.moveByOne());

    }
}
