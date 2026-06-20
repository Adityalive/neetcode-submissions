class Solution {
    public int[][] merge(int[][] intervals) {
     Arrays.sort(intervals,(a,b)->a[0]-b[0]);
     List<int[]> list =new ArrayList<>();
     list.add(intervals[0]);
     for(int i=1;i<intervals.length;i++){
        int prev[]=list.get(list.size()-1);
        int curr[]=intervals[i];
        if(curr[0]<=prev[1]){
            prev[0]=Math.min(prev[0],curr[0]);
            prev[1]=Math.max(prev[1],curr[1]);
        }else{
            list.add(curr);
        }
     }
     return list.toArray(new int[list.size()][])   ;
    }
}
