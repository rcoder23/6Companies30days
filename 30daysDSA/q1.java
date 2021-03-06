class Solution {
    public List<List<String>> Anagrams(String[] li) {
      
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<li.length;i++){
            char ch[]=li[i].toCharArray();
            Arrays.sort(ch);
           String key=String.valueOf(ch);
      
        List<String> strList=new ArrayList<>();
           if(map.containsKey(key)){
              strList=map.get(key);
           }
      
              strList.add(li[i]);
              map.put(key,strList);
               }
        List<List<String>> ans=new ArrayList<>();
            // System.out.println(map);
        for(String s:map.keySet()){
           ans.add(map.get(s));
        }
        
        return ans;
    }
}
           