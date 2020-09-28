package Domaci;


import java.io.*;
import java.util.*;

public class BasicFileLines {
    public static void main(String args[])throws FileNotFoundException
    {
        int x,count;
        String linija,filename;
        Scanner in;

        if(args.length != 1){
            System.exit(1);
        }

        filename=args[0];
        in=new Scanner(new File(filename));
        count=Integer.parseInt(in.nextLine());
        for(x=0;x<count;x++){
            linija=in.nextLine();
            System.out.println(linija);
        }
    }
}

