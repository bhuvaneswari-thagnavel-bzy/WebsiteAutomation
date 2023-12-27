package org.generics;

import de.taimos.totp.TOTP;
import java.util.Date;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Hex;


public class Authenticator {
	
public static String code;


	    public static String getTOTPCode(String secretKey) {
	        Base32 base32 = new Base32();
	        byte[] bytes = base32.decode(secretKey);
	        String hexKey = Hex.encodeHexString(bytes);
	        return TOTP.getOTP(hexKey);
	    }

	    public static void main(String... a) {
	    String secretKey = "7kjwpfldc222scmt";
	    //add key above

	   code = getTOTPCode(secretKey);
	    System.out.println("The code is:"+code);

	    }
	}
