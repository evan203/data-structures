/**
    This class implements a binary search tree whose
    nodes hold objects that implement the Comparable
    interface.
*/
public class BinarySearchTree
{   
    private Node root;

    /**
        Constructs an empty tree.
    */
    public BinarySearchTree()
    {   
        
    }
    
    /**
        Inserts a new node into the tree.
        @param obj the object to insert
    */
    public void add(Comparable obj) 
    {   
        Node newNode = new Node();
        newNode.data = obj;
        newNode.left = null;
        newNode.right = null;
        if (this.root ==  null)
            this.root = newNode;
        else
            this.root.addNode(newNode);
    }

    /**
        Tries to find an object in the tree.
        @param obj the object to find
        @return true if the object is contained in the tree
    */
    public boolean find(Comparable obj)
    {
        Node current = this.root;
        while (current != null)
        {
            int d = obj.compareTo(current.data)
            if (d == 0)
                return true;
            else if (d < 0)
                current = current.left;
            else 
                current = current.right;
        }
        return false;
    }
    
    /**
        Tries to remove an object from the tree. Does nothing
        if the object is not contained in the tree.
        @param obj the object to remove
    */
    public void remove(Comparable obj)
    {
        Node toBeRemoved = this.root;
        Node parent = null;
        boolean found = false;

        while (!found && toBeRemoved != null)
        {
            int diff = obj.compareTo(toBeRemoved.data);
            if (diff == 0)
                found = true;
            else 
            {
                parent = toBeRemoved;
                if (diff < 0)
                    toBeRemoved = toBeRemoved.left;
                else   
                    toBeRemoved = toBeRemoved.right;
            }
        }
        if (!found)
            return;

        if (toBeRemoved.left == null || toBeRemoved.right == null)
        {
            Node newChild;
            if (toBeRemoved.left == null)
                newChild = toBeRemoved.right;
            else 
                newChild = toBeRemoved.left;
            if (parent == null)
                this.root = newChild;
            else if (parent.left == toBeRemoved)
                parent.left = newChild;
            else 
                parent.right = newChild;
        }
        
    }
    
    /**
        Prints the contents of the tree in sorted order.
    */
    public void print()
    {   
        
    }   

    /**
        Prints a node and all of its descendants in sorted order.
        @param parent the root of the subtree to print
    */
    private static void print(Node parent)
    {   
        
    }

    /**
        A node of a tree stores a data item and references
        to the left and right child nodes.
    */
    static class Node
    {   
        public Comparable data;
        public Node left;
        public Node right;    

        /**
            Inserts a new node as a descendant of this node.
            @param newNode the node to insert
        */
        public void addNode(Node newNode)
        {   
            if (newNode.data.compareTo(data) > 0)
            {
                if (this.right == null) 
                    this.right = newNode; 
                else
                    this.right.addNode(newNode);
            }
            else 
            {
                if (this.left == null) 
                    this.left = newNode; 
                else
                    this.left.addNode(newNode);
            }
        }
    }
}



