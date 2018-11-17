//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decommercepiler)
//

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileManager {


    public static void main(String[] args) {
        File path = new File("C:\\Users\\eBuddiess\\IdeaProjects\\ContentRenamer\\src");
        File[] files = path.listFiles();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Word To Find");
        String findby = input.nextLine();
        System.out.println("Enter Word To Replace");
        String replace = input.nextLine();
        File[] var6 = files;
        int var7 = files.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            File file = var6[var8];
            if (!file.getName().startsWith("Renamer.java")) {
                try {
                    openFile(file, findby, replace);
                } catch (Exception var11) {
                    System.out.println("Unable To Open File");
                }
            }
        }

    }

    private static void openFile(File file, String find, String replace) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String data = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
        data = data.toString().replace(find, replace);
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(data);
        bw.close();
        br.close();
    }
}
