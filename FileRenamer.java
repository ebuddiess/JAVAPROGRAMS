import java.io.File;
import java.util.Random;


public class FileRenamer {
    public static void main(String[] args) {
        int i =0 ;
        File f = new File("E:\\Walpaper");
        File walpapers[]=f.listFiles();
        for(File walpaper : walpapers){
            i++;
            walpaper.renameTo(new File("E:\\Walpaper\\"+Integer.toString(i)+".jpg"));
        }
    }
}
