package game2peer.manager;

import java.io.IOException;
import java.io.OutputStream;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

@Service
public class QRManager {

	@Cacheable("QRImage")
	public BitMatrix getQR(String url, int width, int height) {
		QRCodeWriter writer = new QRCodeWriter();
		BitMatrix m;
		try {
			m = writer.encode(url, BarcodeFormat.QR_CODE, height, width);
			return m;
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void writeToStream(String url, OutputStream stream) {
		try {
			MatrixToImageWriter.writeToStream(getQR(url, 200, 200), "png", stream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
