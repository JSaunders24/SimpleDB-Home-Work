package com.company;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
	    String dirString = "C:\\Users\\robhu\\OneDrive\\Documents\\Classes\\FLC\\CISP401\\Projects\\BasicFiles\\files";
        String fileString = "test.txt";
	    Path dirPath = Paths.get(dirString);
	    Path filePath = Paths.get(dirString, fileString);
        if(Files.notExists(dirPath)){
            try {
                Files.createDirectories(dirPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(Files.notExists(filePath)){
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File testFile = filePath.toFile();

        /*
        System.out.println("File name: " + filePath.getFileName());
        System.out.println("Absolute path: " + filePath.toAbsolutePath());
        System.out.println("Is writable: " + Files.isWritable(filePath));

        String dirString2 = "C:\\Users\\robhu\\OneDrive\\Documents\\Classes\\FLC\\CISP401";
        Path dirPath2 = Paths.get(dirString2);
        if(Files.exists(dirPath2) && Files.isDirectory(dirPath2)){
            System.out.println("Directory: " + dirPath2.toAbsolutePath());
            System.out.println("Files :");
            try {
                DirectoryStream<Path> dirStream2 = Files.newDirectoryStream(dirPath2);
                for(Path p : dirStream2){
                    if(Files.isRegularFile(p)){
                        System.out.println(p.getFileName());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        /*
        FileWriter theFile = new FileWriter(testFile);
        BufferedWriter theBuffer = new BufferedWriter(theFile);
        PrintWriter out = new PrintWriter(theBuffer);
        */

        try {
            PrintWriter out = new PrintWriter((
                                    new BufferedWriter(
                                            new FileWriter((testFile))
                                    )
                                ));
            out.println("Hello, world");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader in = new BufferedReader(new FileReader(testFile));
            try {
                String line = in.readLine();
                System.out.println(line);
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
