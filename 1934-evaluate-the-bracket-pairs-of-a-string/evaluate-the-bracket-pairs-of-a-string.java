class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
         HashMap<String,String> map = new HashMap<>();
        for(List<String> pair : knowledge){
            map.put(pair.get(0),pair.get(1));
        }
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i < s.length()){
            if(s.charAt(i)=='('){
                int j = i+1;
                while(s.charAt(j)!=')'){
                    j++;
                }
                String str = s.substring(i+1,j);
                System.out.println(str);
                sb.append(map.getOrDefault(str,"?"));
                i = j+1;

            }else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}