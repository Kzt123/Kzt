
/*
 * Class: CMSC203 CRN:22377 
 * Instructor:Gary Thai
 * Description: This is a utility class that encrypts and decrypts a phrase using two different approaches.
 * Due: 10/15/2022
 * Platform/compiler:Microsoft Windows11
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Zhiteng Ke
*/
public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) {
		char[] Cha=new char[plainText.length()];
		for(int i=0; i<plainText.length();i++)
		{
			Cha[i]=plainText.charAt(i);
		}
		for(int val:Cha)
		{
			if(val<LOWER_RANGE||val>UPPER_RANGE)
				return false;
		}
		return true;		
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		while(key>RANGE)
		{
			key-=RANGE;
		}
		String CsText="";
		if(isStringInBounds(plainText))
		{
			for(int i=0;i<plainText.length();i++)
			{
				char NewC=plainText.charAt(i);
				NewC+=key;
				while(NewC>UPPER_RANGE)
				{
					NewC=(char)(NewC-RANGE);
				}
				CsText+=NewC;
			}
		}
		else
			CsText="The selected string is not in bounds, Try again.";
		return CsText;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		String BsText="";
		char[] Bell=new char[plainText.length()];
		for(int i=0;i<plainText.length();i++)
		{
			Bell[i]=bellasoStr.charAt(i%bellasoStr.length());
		}
		if(isStringInBounds(plainText))
		{
			for(int k=0;k<plainText.length();k++)
			{
				char NewC=plainText.charAt(k);
				NewC+=Bell[k];
				while(NewC>UPPER_RANGE)
				{
					NewC=(char)(NewC-RANGE);
				}
				BsText+=NewC;
			}
		}
		return BsText;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		while(key>RANGE)
		{
			key-=RANGE;
		}
		String CsDeText="";
		if(isStringInBounds(encryptedText))
		{
			for(int i=0;i<encryptedText.length();i++)
			{
				char NewC=encryptedText.charAt(i);
				NewC-=key;
				while(NewC<LOWER_RANGE)
				{
					NewC=(char)(NewC+RANGE);
				}
				CsDeText+=NewC;
			}
		}
		return CsDeText;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		String BsDeText="";
		char[] Bell=new char[encryptedText.length()];
		for(int i=0;i<encryptedText.length();i++)
		{
			Bell[i]=bellasoStr.charAt(i%bellasoStr.length());
		}
		if(isStringInBounds(encryptedText))
		{
			for(int k=0;k<encryptedText.length();k++)
			{
				char NewC=encryptedText.charAt(k);
				NewC-=Bell[k];
				while(NewC<LOWER_RANGE)
				{
					NewC=(char)(NewC+RANGE);
				}
				BsDeText+=NewC;
			}
		}
		return BsDeText;
	}
}
