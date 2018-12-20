package DataStructure;

import java.io.File;
import java.io.FileFilter;


class JavaFilter implements FileFilter{

    @Override
    public boolean accept(File file) {
        return file.getName().endsWith(".java");
    }

}

public class BitOperation {

    public static void main(String[] args) {
//        int a = 5<<1;
//        int b = -6<<1;
//        System.out.println(a);
//        System.out.println(b);

        File file = new File("C:\\Dev\\property-web-ui\\src\\main\\java\\com\\veda\\vedacheck\\property\\model\\ui");
        //FileFilter fileFilter = new JavaFilter();
//
//        FileFilter fileFilter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".java");
//            }
//        };

        FileFilter fileFilter = pathname-> pathname.getName().endsWith(".java");

        File[] javafiles = file.listFiles(fileFilter);

        for (int i = 0; i < javafiles.length; i++) {
            System.out.println(javafiles[i].getName());
        }


//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("running");
//            }
//        };

        Runnable runnableLam = ()-> System.out.println("running");
        Thread t  = new Thread(runnableLam);
        t.start();
        t.stop();
    }

    public int divide(int dividend, int divisor){
        long result = divideLong(dividend, divisor);

        return result > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)result;

    }

    private long divideLong(int dividend, int divisor) {

        int sign;

        if (dividend>0 && divisor<0 || dividend<0 && divisor>0){
            sign = -1;
        }
        return 0;
    }


}
