import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CryptoManagerTestStudent {
	CryptoManager cryptoManager;
	

	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("KZT"));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("X'!", CryptoManager.caesarEncryption("KZT", 13));
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals("KZT", CryptoManager.caesarDecryption("X'!", 13));
		
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("<LG", CryptoManager.bellasoEncryption("KZT", "123"));
		

	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("KZT", CryptoManager.bellasoDecryption("<LG", "123"));
	}
}
