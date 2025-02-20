//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/?envType=study-plan-v2&envId=top-100-liked

class Solution {
    public List<String> letterCombinations(String d) {
        Map<Character,String> map =getMap();
        List<String> ans= new ArrayList<>();
        if(d.length()==0) return ans;
        solve(0,d,"",ans,map);
return ans;
    }
    private void solve(int i, String d,String s,List<String> ans,Map<Character,String> map){
        if(i==d.length()){
            ans.add(s);
            return;
        }
        for(char c: map.get(d.charAt(i)).toCharArray()){
            String temp=new String(s);
            temp+=c;
            solve(i+1,d,temp,ans,map);
        }


    }
    private Map<Character,String> getMap(){
        Map<Character,String> map= new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        return map;
    }
}