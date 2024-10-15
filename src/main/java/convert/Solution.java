package convert;

import java.io.BufferedReader;
import java.io.File;


public class Solution {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        File file=new File("G:\\project\\widm-team-parent");
        getFileList(file,0);
    }

    public static void getFileList(File file,int ceng)
    {
        //计算当前是进到第几层目录了
        String str="";
        if (ceng ==0){
            str = "|";
        }
        for(int i=1;i<=ceng;i++)
            str+="  |";

        //返回指定目录下的所有的文件对象
        File[] arr= file.listFiles();

        str +="--";
        //遍历每个对象
        for(File subfile :arr)
        {
            String prex = str;
            if (subfile.isDirectory()){
                prex +="/";
            }
            //打印名称
            System.out.println(prex+subfile.getName());
            //判断当前对象是不是一个目录
            if(subfile.isDirectory())
            {
                //返回当前这个目录中所有的文件对象
                getFileList(subfile,ceng+1);
            }

        }

    }

}
