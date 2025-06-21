import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}

public class SameTreeChecker {

    // Builds a binary tree from a level-order string array
    public static TreeNode buildTree(String[] nodes) {
        if (nodes.length == 0 || nodes[0].trim().isEmpty() || nodes[0].equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(nodes[0].trim()));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (!queue.isEmpty() && i < nodes.length) {
            TreeNode current = queue.poll();

            // Left child
            if (i < nodes.length && !nodes[i].trim().isEmpty() && !nodes[i].equals("null")) {
                current.left = new TreeNode(Integer.parseInt(nodes[i].trim()));
                queue.offer(current.left);
            }
            i++;

            // Right child
            if (i < nodes.length && !nodes[i].trim().isEmpty() && !nodes[i].equals("null")) {
                current.right = new TreeNode(Integer.parseInt(nodes[i].trim()));
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    // Recursively checks if two trees are identical
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input for tree p
        String pLine = sc.nextLine().trim();
        if (pLine.isEmpty()) {
            System.out.println("No");
            sc.close();
            return;
        }
        String[] pNodes = pLine.split("\\s+");
        TreeNode p = buildTree(pNodes);

        // Read input for tree q
        String qLine = sc.nextLine().trim();
        if (qLine.isEmpty()) {
            System.out.println("No");
            sc.close();
            return;
        }
        String[] qNodes = qLine.split("\\s+");
        TreeNode q = buildTree(qNodes);

        // Output result
        System.out.println(isSameTree(p, q) ? "Yes" : "No");

        sc.close(); // Avoid resource leak warning
    }
}
