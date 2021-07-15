package others;

import java.io.File;
import java.util.List;

public class getFilesPaths {
    private List<String> ergodic(File file, List<String> resultFileName){
        File[] files = file.listFiles();
        if(files==null)return resultFileName;// 判断目录下是不是空的
        for (File f : files) {
            if(f.isDirectory()){// 判断是否文件夹
                resultFileName.add(f.getPath());
                ergodic(f,resultFileName);// 调用自身,查找子目录
            }else
                resultFileName.add(f.getPath());
        }
        return resultFileName;
    }
}
