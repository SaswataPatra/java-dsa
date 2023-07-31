

package DynamicProgramming;
import java.util.*;
public class LongestStringChain {
    
    public int longestStrChain(String[] words) {
        HashMap<String,Integer> memo = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set,words);
        int max_path = 1;
        for(String word: words){
            max_path = Integer.max(max_path, dfs(memo,set,word));
        }
        return max_path;
    }
    public int dfs(HashMap<String,Integer>memo,HashSet<String>set, String word){
        if(memo.containsKey(word)) return memo.get(word);
        
        StringBuilder sb = new StringBuilder(word);
        int max_path = 0;
        for(int i=0;i<word.length(); i++){
            sb.deleteCharAt(i);
            String prevWord = sb.toString();
            if(set.contains(prevWord)){
                max_path = Integer.max(max_path,dfs(memo,set,prevWord));    
            }
            sb.insert(i,word.charAt(i));
        }
        memo.put(word,max_path+1);
        return memo.get(word);
    }
}
