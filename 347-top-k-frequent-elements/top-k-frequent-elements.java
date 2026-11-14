class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(Integer i : map.keySet()){
                list.add(i);
        }
        list.sort((a, b) -> map.get(b) - map.get(a));
        return list.stream().limit(k).mapToInt(Integer::valueOf).toArray();

    }
}