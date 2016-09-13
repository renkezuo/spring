package com.renke.redis;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

import org.castor.core.util.StringUtil;
import org.junit.Test;

import com.google.zxing.common.StringUtils;


/****
 * ∑µªÿ∏Ò Ω
 * $[length]\r\n
 * [chars]\r\n
 * eg:
 * set hello "world"
 * get hello
 * return 
 * $5\r\n
 * world\r\n
 * 
 * @author renke.zuo@foxmail.com
 * @time 2016-09-13 13:54:30
 */
public class MyClient {
	@Test
	public void runTest() throws IOException{
		ByteBuffer buf = ByteBuffer.allocate(1024);
		SocketChannel sc = SocketChannel.open();
		sc.connect(new InetSocketAddress("10.10.3.218", 6379));
		sc.write(ByteBuffer.wrap("auth renkezuo\r\n".getBytes()));
		sc.read(buf);
		System.out.println(new String(buf.array(),0,buf.position()));
		
		buf.clear();
		sc.write(ByteBuffer.wrap("get hello\r\n".getBytes()));
		sc.read(buf);
		System.out.println(new String(buf.array(),0,buf.position()));
		
		buf.clear();
		sc.write(ByteBuffer.wrap("get wo\r\n".getBytes()));
		sc.read(buf);
		System.out.println("wo is :"+new String(buf.array(),4,buf.position()-6,"UTF-8"));
		printBytes(buf.array());
//		Client client = new Client();
	}
	
	public void printBytes(byte[] bytes){
		for(byte b : bytes){
			if(b==0) break;
			System.out.println(Integer.toHexString(b));
		}
	}
	
}
