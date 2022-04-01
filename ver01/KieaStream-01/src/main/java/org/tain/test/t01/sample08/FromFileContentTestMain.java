package org.tain.test.t01.sample08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentTestMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Path path = Paths.get(FromFileContentTestMain.class.getResource("linedata.txt").getPath());
		Stream<String> stream;
		
		// Files.lines
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(System.out::println);
		stream.close();
		System.out.println();
		
		// BufferedReader.lines
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(System.out::println);
		br.close();
	}

}
