public class TreeBasic {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
static class Binarytree{
    static int idx = -1;
    public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
Node newNode = new Node(nodes[idx]);
newNode.left = buildTree(nodes);
newNode.left = buildTree(nodes);
return newNode;

    }
}







    public static void main(String[] args){
        int nodes[] ={1, 2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

    }
}
