package org.tain.test.t02.test09;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryTestMain {

	public static void main(String[] args) throws Exception {
		Path path = Paths.get("/Users/kang-air");
		
		Stream<Path> stream = Files.list(path);
		stream.forEach(p -> System.out.println(">>> " + p.getFileName()));
		stream.close();
	}
}
