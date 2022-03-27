package org.tain.test.t00.scanner;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class ScannerTestMain {

	private static boolean flag = true;
	
	public static void main(String[] args) throws Exception {
		if (flag) {
			File file = new File("/Users/kang-air/KANG/h2/h2.sh");
			Scanner scan = new Scanner(file, "utf-8");
			String line = null;
			while (scan.hasNext()) {
				line = scan.nextLine();
				System.out.println(">> " + line);
			}
			scan.close();
		}
		
		if (flag) {
			Path path = Paths.get("/Users/kang-air/KANG/h2/h2.sh");
			@SuppressWarnings("resource")
			Stream<String> stream = Files.lines(path, Charset.forName("utf-8"));
			stream.sorted().forEach(p -> {
				System.out.println(">>> lines: " + p);
			});
		}
		
		if (flag) {
			Path path = Paths.get("/Users/kang-air");
			@SuppressWarnings("resource")
			Stream<Path> stream = Files.list(path);
			stream.sorted().forEach(p -> {
				System.out.println(">> path: " + p.getFileName());
			});
		}
	}
}
