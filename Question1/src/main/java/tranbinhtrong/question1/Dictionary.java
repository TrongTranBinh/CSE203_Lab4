package tranbinhtrong.question1;

import java.util.*;

public class Dictionary {
    
    private TreeMap<String, String> dic = new TreeMap<>();
    
    public Dictionary() {
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.nextLine();
        Dictionary dic = new Dictionary();
        dic.input();
        System.out.println(dic.checkingExist(word));
        System.out.print("The meaning of the word is: " + dic.findMeaning(word));
    }
    
    public void input() {
        dic.put("Game", "Tro choi");
        dic.put("Compulsory", "Bat buoc");
        dic.put("Artificial", "Nhan tao");
        dic.put("Fun", "Vui ve");
        dic.put("Comic", "Truyen tranh");
        dic.put("Character", "Nhan vat");
        dic.put("Playable character", "Nhan vat co the duoc choi");
        dic.put("BGM", "BACK GROUND MUSIC - Nhac nen");
        dic.put("UFO", "UNIDENTIFIED FLYING OBJECT - Vat the bay khong xac dinh");
        dic.put("Football", "Bong da - mon the thao vua");
    }
    
    public String checkingExist(String word) {
        if (dic.containsKey(word)) {
            return "Existed!";
        }
        return "Not existed.";
    }
    
    public String findMeaning(String word) {
        if (dic.containsKey(word)) {
            return dic.get(word);
        }
        return "Not found!";
    }
    
}
