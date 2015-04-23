public class Node {
    private Node Left, Right;
    private int data;

    public Node() {
	this(null,null,null);
    }
    
    public Node( Node l, Node r, int d ) {
	Left = l;
	Right = r;
	data = d;
    }

    public Node getLeft() {
	return Left;
    }

    public void setLeft( Node n ) {
	Left = n;
    }
    
    public Node getRight() {
	return Right;
    }
    
    public void setRight( Node n ) {
	Right = n;
    }

    public int getData() {
	return data;
    }
    
    public void setData( int n ) {
	data = n;
    }

}
