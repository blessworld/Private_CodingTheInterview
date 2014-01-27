
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by mac-965 on 14-1-17.
 */
public class chapter1_0 {

    public HashMap<Integer, Student> bulidmap(Student[] students){
        HashMap<Integer, Student> map = new HashMap<Integer, Student>();
        for (Student s : students)
            map.puts(s.getId(), s);
    }

    public  ArrayList<String> merge(String[] words, String[] more){
        ArrayList<String> sentence = new ArrayList<String>();
        for (String w : words) sentence.add(w);
        for (String w : more)  sentence.add(w);
        return sentence;
    }

    public String makeSentence(String[] words){
        StringBuffer sentence = new StringBuffer();
        for (String w : words) sentence.append(w);
        return sentence.toString();
    }

    public String makeSentence(String[] words){
        StringBuffer sentence = new StringBuffer();
        for (String w : words) sentence.append(w);
        return sentence.toString();
    }

    public static boolean isUniqueChar2(String str){
        for (int i=0; i < str.length();i++){
            int val = str.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

    public static boolean isUniqueChars2(String str){
        boolean[] char_set = new boolean[256];
        String s = <isUniqueChar2()>
        for (int i = 0;i < str.length();i++){
            int val = str.charAt(i);
            if (char_set[val]) return  false;
            char_set[val] = true;
        }
        return true;
    }

}