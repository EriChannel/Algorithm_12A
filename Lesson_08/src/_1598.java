public class _1598 {
    public int minOperations(String[] logs) {
        int count = 0;
        for(String s : logs){
            if(s.equals("./"))
                continue;
            else if( s.equals("../")){
                count = Math.max(0, count- 1);
            }
            else{
                count++;
            }
        }
        return count;
    }
}
