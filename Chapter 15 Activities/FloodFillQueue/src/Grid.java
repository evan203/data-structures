import java.util.*;
public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    Stack<Pair> pairs;

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        pairs = new Stack<>();
        pairs.push(new Pair(row, column));
        for (int i = 0; !pairs.isEmpty(); i++)
        {
            Pair top = pairs.pop();
            if (top.getRow() < SIZE  && top.getRow() >= 0 && top.getColumn() < SIZE && top.getColumn() >= 0
            && pixels[top.getRow()][top.getColumn()] == 0)
            {
                pixels[top.getRow()][top.getColumn()] = i;
                pairs.push(new Pair(top.getRow()-1, top.getColumn()));
                pairs.push(new Pair(top.getRow(), top.getColumn()-1));
                pairs.push(new Pair(top.getRow()+1, top.getColumn()));
                pairs.push(new Pair(top.getRow(), top.getColumn()+1));
            }
        }
        System.out.println(this.toString());
    }

    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%3d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
