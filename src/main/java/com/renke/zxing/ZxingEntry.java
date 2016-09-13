package com.renke.zxing;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class ZxingEntry {
	public static void Encode_QR_CODE() throws IOException, WriterException {
		String contents = "ZXing 二维码内容1234!"; // 二维码内容
		int width = 430; // 二维码图片宽度 300
		int height = 430; // 二维码图片高度300
		String format = "gif";// 二维码的图片格式 gif
		Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
		// 指定纠错等级,纠错级别（L 7%、M 15%、Q 25%、H 30%）
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
		// 内容所使用字符集编码[如果没有中文，建议不要设置此项]
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		// hints.put(EncodeHintType.MAX_SIZE, 350);//设置图片的最大值
		// hints.put(EncodeHintType.MIN_SIZE, 100);//设置图片的最小值
		hints.put(EncodeHintType.MARGIN, 1);// 设置二维码边的空度，非负数
		BitMatrix bitMatrix = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, width, height, hints);
		// 生成二维码
		File outputFile = new File("d:" + File.separator + "new-1.gif");// 指定输出路径
		MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);
	}

	public static void main(String[] args) throws Exception {
		try {
			Encode_QR_CODE();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
