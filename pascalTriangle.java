public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> prev = null;
        List<Integer> cur = new LinkedList<>();
        
        if(numRows == 0)
            return res;
            
        cur.add(1);
        res.add(cur);
        
        if(numRows == 1)
            return res;
        
        prev = cur;
        for(int i = 1; i < numRows; i++){
            cur = new LinkedList();
            cur.add(1);
            for(int j = 0; j < prev.size()-1;j++){
                cur.add(prev.get(j) + prev.get(j + 1));
            }
            cur.add(1);
            
            res.add(cur);
            prev = cur;
        }
        
        return res;
    }
}
