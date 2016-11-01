package Algo.DFS.NoBackT;

import java.io.File;

/**
 * Created by wangziming on 10/31/16.
 */
public class DeleteFile {


    public void deleteFolder(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                //使用递归
                deleteFolder(f);
            } else {
                f.delete();
            }
        }
        file.delete();
    }
}