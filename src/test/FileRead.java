package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {

        FileReader fr=null;

        try {
            File f = new File("a.txt");
            fr = new FileReader(f);
            char[] buf = new char[2];
            int len = 0;
            while((len=fr.read(buf))!=-1){
                String content  = new String(buf, 0, len);
                System.out.print(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr!=null){
                try{
                    fr.close();
                }catch (IOException e){
                    e.printStackTrace();
                }

            }
        }

    }

}
