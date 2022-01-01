class Solution {
    public int minSetSize(int[] arr) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i:map.keySet()){
            l.add(map.get(i));
        }
        Collections.sort(l);
        System.out.println(l);
         System.out.println(map);
        int rem=arr.length;
        int c=0;
        while(true){
            int lr=l.get(l.size()-1);
            rem=rem-lr;
           
             c++;
            if(rem <=arr.length/2) break;
           
            l.remove(l.size()-1);
        }
        return c;
    }
}