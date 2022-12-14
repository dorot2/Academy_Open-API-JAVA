package sec02.exam01_system_in_out;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample1 {

	public static void main(String[] args) throws Exception {
		
		InputStream is = System.in;
		
		byte[] datas = new byte[100];
		
		System.out.print("이름 : ");
		int nameBytes = is.read(datas); // 콘솔환경에서 입력한 데이타를 datas 배열에 저장
		String name = new String(datas, 0, nameBytes-2); // Enter Key : 10, 13 버퍼저장
		
		System.out.print("하고 싶은말 : ");
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0, commentBytes-2);
		
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 하고 싶은 말 : " + comment);
	}
}
