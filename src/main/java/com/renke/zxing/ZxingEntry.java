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
		String contents = "ZXing ��ά������1234!"; // ��ά������
		int width = 430; // ��ά��ͼƬ��� 300
		int height = 430; // ��ά��ͼƬ�߶�300
		String format = "gif";// ��ά���ͼƬ��ʽ gif
		Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
		// ָ������ȼ�,������L 7%��M 15%��Q 25%��H 30%��
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
		// ������ʹ���ַ�������[���û�����ģ����鲻Ҫ���ô���]
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		// hints.put(EncodeHintType.MAX_SIZE, 350);//����ͼƬ�����ֵ
		// hints.put(EncodeHintType.MIN_SIZE, 100);//����ͼƬ����Сֵ
		hints.put(EncodeHintType.MARGIN, 1);// ���ö�ά��ߵĿնȣ��Ǹ���
		BitMatrix bitMatrix = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, width, height, hints);
		// ���ɶ�ά��
		File outputFile = new File("d:" + File.separator + "new-1.gif");// ָ�����·��
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
