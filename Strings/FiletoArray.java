import java.io.*;
import java.util.Scanner;


public class nlarrray
{
     static int counter = 0;
    static String data = "";
    public static String[] wordTokenize (String fileName){
        try{
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
                data += sc.nextLine();
        }
            sc.close();
        }catch(FileNotFoundException fe){
            fe.printStackTrace();
        }
String word = "";
        int count=0;
        for(int i = 0; i<data.length(); i++){
    String ltr = ""+data.charAt(i);
    if(ltr.contains("@") || ltr.contains(",")){
        continue;
    }
    else{
        word+=ltr;
    }
        }
        for(int i = 0; i < word.length(); i++)
        {
            String letter = ""+(word.charAt(i));
            if(letter.contains(" ")){
                counter++;
            }
            else continue;
        }
    String[] array = word.split(" ");


return array;
    }

    public static void main(String[] args) {

        String array[] = ( wordTokenize("/D:/sample.txt"));
        for(String s : array){
            System.out.print(s+ " ");
        }
        System.out.println();
        System.out.println("words in array : "+array.length);
    }
}
