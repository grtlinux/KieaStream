package org.tain.test.t01.sample09;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryTestMain {

	public static void main(String[] args) throws Exception {
		Path path = Paths.get("/Users/kang-air");
		@SuppressWarnings("resource")
		Stream<Path> stream = Files.list(path);
		stream.forEach(p -> System.out.println(p.getFileName()));
	}
}
