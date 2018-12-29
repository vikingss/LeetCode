package round1;

import round1.firstLevel27.TreeNode;

/**

 */
public class firstLevel96 {
    public int[][] transpose(int[][] A) {
        int m = A.length;
        int n = A[0].length;

        int[][] matrix = new int[n][m];

        for(int j = 0; j < n; ++j){
            for(int i = 0; i < m; ++i){
                matrix[j][i] = A[i][j];
            }
        }
        return matrix;
    }

    public static void main(String[] args) {

    }


    public int depth(TreeNode root){
        if(root == null ) return 0;
        return Math.max(depth(root.left),depth(root.right))+1;
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if( root == null ) return null;
        int left =  depth(root.left);
        int right = depth(root.right);
        if( left  == right ) return root;
        if( left > right ) return subtreeWithAllDeepest(root.left);
        return subtreeWithAllDeepest(root.right);
    }
}
