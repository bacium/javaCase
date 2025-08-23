package test.file;

import java.io.File;
import java.io.IOException;

public class FileCase {
    public static void main(String[] args) throws IOException {
        String path1="Documents";
        File file=new File(path1);
        boolean documentFlag = file.mkdirs();
        if (documentFlag) {
            String[] dirs = {"word", "ppt", "other"};
            for (int i = 0; i < dirs.length; i++) {
               String path = path1 + "/" + dirs[i];
                File fsList = new File(path);
                boolean mkdir = fsList.mkdir();
                if (mkdir) {
                    System.out.println(dirs[i] + "创建成功");
                    if ("word".equals(dirs[i])){
                        File wordFile1=new File(path,"1.docx");
                        boolean word1 = wordFile1.createNewFile();
                        File wordFile2=new File(path,"2.docx");
                        boolean word2 = wordFile2.createNewFile();
                        if(word1 && word2){
                            System.out.println("1.docx 和  2.docx创建成功");
                        }
                        path=path+"/"+"work";
                        File workDir=new File(path);
                        boolean workDirFlag = workDir.mkdirs();
                        if (workDirFlag){
                           File abcFile=new File(path,"abc.doc");
                            boolean abcFlag = abcFile.createNewFile();
                            if (abcFlag){
                                System.out.println("abc.doc创建成功");
                            }

                        }

                    }

                }
            }
        }
        File[] files = file.listFiles();
        outputFile(files);

    }

    private static void outputFile(File[] files) {
        for (File file1 : files) {
            System.out.println(file1);
            if (file1.exists()){

            }
        }
    }
}
