package com.whut.springbootjpacementv4_1.bean;

import java.io.File;
import java.io.FileOutputStream;

public class FileUtil {

    /**
     *
     * @param file
     * @param filePath
     * @param fileName
     * @throws Exception
     */

    public static String uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
        String downLoadPath="/file?fileName="+fileName;
        return downLoadPath;
    }
}
