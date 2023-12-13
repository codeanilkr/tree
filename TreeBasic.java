import java.util.*;
public class TreeBasic {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
static class BinaryTree{
    static int idx = -1;
    public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }
}
// PreOrder Travers
public static void Preorder(Node root){
    if(root == null){
        return;
    }
    System.out.print(root.data + " ");
    Preorder(root.left);
    Preorder(root.right);
}

// Inorder Traversal
public static void Inorder(Node root){
    if(root == null){
        return;
    }
    Inorder(root.left);
System.out.println(root.data);
Inorder(root.right);
}

// PostOrder Traversal
public static void PostOrder(Node root){
     if(root == null){
        return;
    }
    PostOrder(root.left);
    PostOrder(root.right);
    System.out.print(root.data + " ");

}
// Level Order Traversal
public static void LevelOrder(Node root){
    if(root == null){
        return;
    }
    Queue<Node>q = new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty()){
        Node currNode = q.remove();
        if(currNode == null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }else{
            System.out.print(currNode.data+ " ");
            if(currNode.left != null){
                q.add(currNode.left);
            }
            if(currNode.right != null){
                q.add(currNode.right);
            }
        }
    }
}

// Cont Of Nodes
public static int countOfNode(Node root){
    if(root == null){
        return 0;
    }
    int leftNodes = countOfNode(root.left);
    int rightNodes = countOfNode(root.right);
    return leftNodes + rightNodes + 1;
}

// Sum Of Nodes
public static int sumOfNode(Node root){
    if(root == null){
        return 0;
    }
    int leftSum = sumOfNode(root.left);
    int rightSum = sumOfNode(root.right);
    return leftSum + rightSum + root.data;
}

// Height Of Tree
public static int height(Node root){
    if(root == null){
        return 0;
    }
    int leftHeight = height(root.left);
    int righthight = height(root.right);
    int myHeight = Math.max(leftHeight, righthight) +1;
    return myHeight;
}

// Diameter Of Tree(1st Approach)
public static int Diameter1(Node root){
    if(root == null){
        return 0;
    }
    int dia1 = Diameter1(root.left);
    int dia2 = Diameter1(root.right);
    int dia3 = height(root.left) + height(root.right) +1;
    return Math.max(dia1, Math.max(dia2,dia3));

}

// Diameter Of Tree(2nd Approach)
static class TreeInfo{
    int ht;
    int diam;
    TreeInfo(int ht, int diam){
        this.ht = ht;
        this.diam = diam;
    }
}
public static TreeInfo Diameter2(Node root){
    if(root == null){
        return new TreeInfo(0, 0);
    }
    TreeInfo left = Diameter2(root.left);
    TreeInfo right = Diameter2(root.right);
    int myHeight = Math.max(left.ht, right.ht) +1;
    int diam1 = left.diam;
    int diam2 = right.diam;
    int diam3 = left.ht + right.ht +1;
    int mydiam = Math.max(diam1, Math.max(diam2,diam3));
    TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
    return myInfo;
}
// Subtree Of Another Tree
 
}
    public static void main(String[] args){
       int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
       BinaryTree tree = new BinaryTree();
       Node root = tree.buildTree(nodes);
    //    System.out.println(root.data);
    //    Preorder(root);
    //    Inorder(root);
    // PostOrder(root);
    // LevelOrder(root);
    // System.out.println(countOfNode(root));
    //  System.out.println(sumOfNode(root));
    // System.out.println(height(root));
    // System.out.println(Diameter1(root));
     System.out.println(Diameter2(root).diam);
    }
   
}
}