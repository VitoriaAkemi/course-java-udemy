package aplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// criando uma lista de palavras
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		// definindo o caminho do arquivo que sera criado
		String path = "./out.txt";
		
		//criando o arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path1 = new File(strPath);
		// criando lista apenas com as pastas que tem no caminho indicado
		File[] folders = path1.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// criando lista apenas com as arquivos soltos que tem no caminho indicado
		File[] files = path1.listFiles(File::isFile);
		System.out.println("FILES:");
		
		for (File file : files) {
			System.out.println(file);
		}
		
		//criando nova pasta("subdir") no caminho indicado
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
	}
}