/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Support;

import com.sun.jmx.remote.internal.ArrayQueue;
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
        String Ext = new String(".map");
        int i=0;
        int j=0;
        try
        {
            CurDir = dir.getCanonicalPath();
            File folder = new File(CurDir);
            File [] listOfFiles = folder.listFiles();
            int length = listOfFiles.length;
            while (j<length)
            {
                if (listOfFiles[j].isFile() && listOfFiles[j].getName().endsWith(Ext))
                {
                     ++i;
                }
                ++j;
            }
            listFile = new String[i];

            i = j = 0;
            while (j<length)
            {
                if (listOfFiles[j].isFile() && listOfFiles[j].getName().endsWith(Ext))
                {
                     listFile[i] = listOfFiles[j].getName();
                     ++i;
                }
                ++j;
            }

        }
        catch (IOException e)
        {
            System.out.println(e);
        }

        return listFile;
    }
}
