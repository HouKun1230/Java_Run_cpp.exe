package JRCmd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JavaRunCmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String cmd="C:/cygwin/bin/sh -c '/usr/bin/gcc HelloWorld.c -o HelloWorld.exe'";
		String cmd = "helloworld.exe";
		try {
			Process process = Runtime.getRuntime().exec(cmd);
			 InputStream is = process.getInputStream();
			    InputStreamReader isr = new InputStreamReader(is);
			    BufferedReader br = new BufferedReader(isr);
			    String line = "";
			    String log = "";
			    while ((line = br.readLine()) != null) {
			      log+=line;
			      log+="\n";
			    }
			    System.out.println(log);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
