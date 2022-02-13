package reversingprocess;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestDecode {

    private static void testing_decode(String r, String exp) {
        String actual = Decode.decode(r);
        assertEquals(exp, actual);
    }

    @Test
    public void test1() {
        testing_decode("1273409kuqhkoynvvknsdwljantzkpnmfgf", "uogbucwnddunktsjfanzlurnyxmx");
    }
    @Test
    public void test2() {
        testing_decode("1544749cdcizljymhdmvvypyjamowl", "mfmwhbpoudfujjozopaugcb");
    }
    @Test
    public void test3() {
        testing_decode("1877138eieaqgumigywmicwgcgg", "Impossible to decode");
    }
    @Test
    public void test4() {
        testing_decode("1122305vvkhrrcsyfkvejxjfvafzwpsdqgp", "rrsxppowmjsrclfljrajtybwviqb");
    }

}
