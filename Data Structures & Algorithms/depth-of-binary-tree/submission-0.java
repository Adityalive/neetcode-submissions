class Solution {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int levelsize=0;
        q.offer(root);
        if(root==null) return 0;
        while(!q.isEmpty()){
            List<Integer>level =new ArrayList<>();
            int size =q.size();
            levelsize++;
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                 level.add(node.val);
                 if(node.left!=null){
                    q.offer(node.left);
                 }
                 if(node.right!=null){
                    q.offer(node.right);
                 }                 
            }
            
        }
        return levelsize;
    }
}
