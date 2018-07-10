package com.whut.springbootjpacementv4_1.bean;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URLEncoder;

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
        fileName= URLEncoder.encode(fileName, "UTF-8");
        File f=new File(filePath,fileName);
        FileOutputStream out = new FileOutputStream(f);
        out.write(file);
        out.flush();
        out.close();
        String downLoadPath="/file?fileName="+fileName;
        return downLoadPath;
    }
}
