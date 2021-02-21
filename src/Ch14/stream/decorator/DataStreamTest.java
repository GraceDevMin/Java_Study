package Ch14.stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos);
				FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)){
			
			dos.writeByte(100);	//1����Ʈ�� ����
			dos.write(100); //4����Ʈ�� ����
			dos.writeChar('A');
			dos.writeUTF("�ȳ��ϼ���");
			
			//write�� ���εǴ� API�� �о����
			System.out.println(dis.readByte());
			System.out.println(dis.read());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		}catch(IOException e){
			
		}

	}

}