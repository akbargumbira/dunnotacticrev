/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Support;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author user
 */
public class FileSupport {
    public static String[] GetListFile(String directory) {
        File dir = new File (".");
        String CurDir;
        String[] listFile = null;
        try
        {
            CurDir = dir.getCanonicalPath();
            File folder = new File(CurDir);
            File [] listOfFiles = folder.listFiles();
            int length = listOfFiles.length;
            listFile = new String[length];
            for (int i = 0; i < length; i++)
             {
                 if (listOfFiles[i].isFile())
                 {
                     listFile[i] = listOfFiles[i].getName();
                 }
             }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

        return listFile;
    }
}
