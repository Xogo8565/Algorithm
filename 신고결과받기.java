import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        List<User> users = new ArrayList<>();
        Map<String,Integer> temp = new HashMap<>();
        List<String> list = Arrays.asList(id_list);

        for(String name : id_list) users.add(new User(name));
        
        for(String s : report){
            users.get(list.indexOf(s.split(" ")[0])).reporter.add(s.split(" ")[1]);
            users.get(list.indexOf(s.split(" ")[1])).reported.add(s.split(" ")[0]);
        }

        for(User user : users) if(user.reported.size() >= k) temp.put(user.name,1);
        
        for(User user : users)
            for(String reporter : user.reporter) 
                if(temp.get(reporter) != null) answer[list.indexOf(user.name)]++;
        
        return answer;
    }
}

class User{
    String name;
    HashSet<String> reporter;
    HashSet<String> reported;
    
    public User(String name){
        this.name = name;
        reporter = new HashSet<>();
        reported = new HashSet<>();
    }
}
