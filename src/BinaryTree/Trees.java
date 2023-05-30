package BinaryTree;


import java.util.*;

class Node{
    String val;
    Node left;
    Node right;
    public Node(String val){
        this.val = val;
        right=null;
        left=null;
    }
}

public class Trees {
    Node root;
    private static void dfs(Node root){
        if(root==null) System.out.println("[]");
        Stack<Node> temp = new Stack<>();
        temp.push(root);
//        ArrayList<Integer> res = new ArrayList<>();
        while(!temp.isEmpty()){
            Node cur = temp.pop();
            System.out.println(cur.val);
            if(cur.right!=null) temp.push(cur.right);
            if(cur.left!=null) temp.push(cur.left);

        }
    }

    private static void bfs(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            System.out.println(cur.val);
            if(cur.left!=null) queue.add(cur.left);
            if(cur.right!=null) queue.add(cur.right);
        }

    }

    public static void main(String[] args){
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        bfs(a);

    }
}
