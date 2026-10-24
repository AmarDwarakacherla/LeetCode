class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
       int aliceArrive = toDate(arriveAlice);
        int aliceLeave = toDate(leaveAlice);
        int bobArrive = toDate(arriveBob);
        int bobLeave = toDate(leaveBob);
        HashSet<Integer> alice = new HashSet<>(), bob = new HashSet<>();
        for(int i = aliceArrive; i<= aliceLeave;i++){
            alice.add(i);
        }
        for(int i = bobArrive; i<= bobLeave;i++){
            bob.add(i);
        }
       int count = 0;
        for(int i : alice){
            if(bob.contains(i)){
                count++;
            }
        }

        return count;
    }
    public  int toDate(String date){
        int[] days = {31,28,31,30,31,30,
                31,31,30,31,30,31};
        int month = Integer.parseInt(date.substring(0,2));
        int day = Integer.parseInt(date.substring(3));
        int total = day;
        for(int i=0;i<month-1;i++){
            total += days[i];
        }
        return total;

    }
}