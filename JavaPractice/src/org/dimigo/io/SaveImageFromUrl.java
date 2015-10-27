/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ org.dimigo.io

 * 1: 개요 : 
 * 2: 작성일 : 2015. 10. 27.
 * </pre>
 *
 * @author : 
 * @version : 
 */
public class SaveImageFromUrl {
	public static void main(String[] args){
		String imageUrl = "http://assets.razerzone.com/images/common/razer-homepage-logo.png";
		try {
			URL url = new URL(imageUrl);
			
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("files/logo.png");
			
			//파일에 write하기
			int result;
			byte[] buf = new byte[100];
			
			while((result = is.read(buf)) != -1){
				os.write(buf, 0, result);
			}
			
			System.out.println("파일 생성 완료");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
