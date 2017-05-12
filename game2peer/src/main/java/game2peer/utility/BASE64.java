package game2peer.utility;

import java.util.regex.Pattern;

import org.apache.commons.codec.binary.Base64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class BASE64 {
	private static Pattern pattern = Pattern.compile("[0-9]*");
	
	public static String decryptBASE64asJSON(String key) {
		byte v[] = key.getBytes();
		if (!Base64.isBase64(v))
			return null;

		for (int i = 0; i < 4; i++) {
			if (!Base64.isBase64(v)) {
				break;
			}
			v = Base64.decodeBase64(v);
		}
		
		return new String(v).replace("\t", "").replace("\n", "").replace("\r", "");
	}    
	
	public static String decryptBASE64asMOLId(String key) {
		byte v[] = key.getBytes();
		if (!Base64.isBase64(v))
			return null;

		for (int i = 0; i < 4; i++) {
			if (pattern.matcher(new String(v)).matches()) {
				break;
			}
			v = Base64.decodeBase64(v);
		}
		
		return new String(v).replace("\t", "").replace("\n", "").replace("\r", "");
	}
	/**    
     * BASE64解密   
   * @param key          
     * @return          
     * @throws Exception          
     */              
    public static String decryptBASE64(String key) throws Exception {  
    	byte[] byteArray = (new BASE64Decoder()).decodeBuffer(key);     	
        return new String(byteArray);             
    }               
                  
    /**         
     * BASE64加密   
   * @param key          
     * @return          
     * @throws Exception          
     */              
    public static String encryptBASE64(byte[] key) throws Exception {               
        return (new BASE64Encoder()).encodeBuffer(key);               
    }       
         
    public static void main(String[] args) throws Exception     
    {     
        String data = BASE64.encryptBASE64("http://aub.iteye.com/".getBytes());     
        System.out.println("加密前："+data);     
        data = "eyJvcmRlcklkIjoiMTI5OTk3NjMxNjkwNTQ3MDU3NTguMTM2OTEyODQxMTExOTY0MSIsInBhY2thZ2VOYW1lIjoiY29tLmRrZ2FtZS5ncGxheS5zdXBlcmVud2luIiwicHJvZHVjdElkIjoiMTAwNTA5OTMzNjYiLCJwdXJjaGFzZVRpbWUiOjE0MzMzNDExMjU5OTEsInB1cmNoYXNlU3RhdGUiOjAsImRldmVsb3BlclBheWxvYWQiOiIyMDE1MDYwMzMxMzc4NTcwNzE0IiwicHVyY2hhc2VUb2tlbiI6ImFpb2xkam5wb2FvbHBuaWtha2hja2xtYS5BTy1KMU94dkl0NXNLbFV3a2lHNnd3YVZBV05YY0NhR05xa2oweHZBWTBaNGJ6NGFSYVo5OWZtUE5jRDhrTXhzbWFFSS1WcG93Z0JjQUlpM2dMN3BOYWJWTGZUWWE0S2xrLURYdG85SUFHNVFrMVJaamNPVnlwZkVta3QxTDE3TFZxMlNzdC01d1BlaiJ9";
        data = "ZXlKdmNtUmxja2xrSWpvaU5qY3dORFV3TmpZd09Ea3hORFUxTkRnME55SXNJbkJoWTJ0aFoyVk9ZVzFsSWpvaVkyOXRMbVJyWjJGdFpTNW5jR3hoZVM1emRYQmxjbVZ1ZDJsdUlpd2ljSEp2WkhWamRFbGtJam9pYUhOZmVtaHZkV3RoYm1WM0lpd2ljSFZ5WTJoaGMyVlVhVzFsSWpveE5ETTBPRFU0T0RNeU5URTNMQ0p3ZFhKamFHRnpaVk4wWVhSbElqb3dMQ0prWlhabGJHOXdaWEpRWVhsc2IyRmtJam9pTWpBeE5UQTJNamN3T0RRd05EazBOamN6TVNJc0luQjFjbU5vWVhObFZHOXJaVzRpT2lKdGFIcHBZblZyWTNWMmJtZG5aWFJqYTJOb1ltdHhhSGN1WXpKQ04zSXhOWGxXVTFsSFJ6TjRZV2hCUkcxUVoyWlFWVU5DTFVjNU1qSm1kbEprTlU1RGVrVTViblo2Y2pKaE9GOUNjRzkwYTNVM1lqTmlTWGh0T1UxemQxQjRYMkU1ZG5CblNFUmFaWGRhWlVkemJtMUdSbkUzTW14d2IzQXplbTFFWDFGeGNteEJTMHRPYldWeE9IQlVhRjl0Y2xFaWZRPT0=";
        System.out.println("解密后："+decryptBASE64(data));     
    }     

    
  
}
