package com.test.process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ProcessBuilderTest {

	public static void main(String[] args) {

        ProcessBuilder build = new ProcessBuilder("cmd.exe" ,"/c",  "dir C:\\logs");
        
        try {
			Process process = build.start();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			
			String sb = null;
			while((sb = reader.readLine())!=null) {
				System.out.println(sb);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
	}

}
