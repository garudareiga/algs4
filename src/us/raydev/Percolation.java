package us.raydev;

/**
 * Created by raychen on 2/8/15.
 */
public class Percolation {
    private int N;

    /**
     * Create N-by-N grid, with all sites blocked
     * @param N
     */
    public Percolation(int N) {
        if (N <= 0)
            throw new IllegalArgumentException();
        this.N = N;
    }

    /**
     * Open site (row i, column j) if it is not open already
     * @param i
     * @param j
     */
    public void open(int i, int j) {
        if (i <= 0 || i > N || j <= 0 || j > N)
            throw new IndexOutOfBoundsException();
    }

    /**
     * is site (row i, column j) open?
     * @param i
     * @param j
     * @return
     */
    public boolean isOpen(int i, int j) {
        if (i <= 0 || i > N || j <= 0 || j > N)
            throw new IndexOutOfBoundsException();
        return false;
    }

    /**
     * is site (row i, column j) full?
     * @param i
     * @param j
     * @return
     */
    public boolean isFull(int i, int j) {
        if (i <= 0 || i > N || j <= 0 || j > N)
            throw new IndexOutOfBoundsException();
        return false;
    }

    /**
     * does the system percolate?
     * @return
     */
    public boolean percolates() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Percolation");
    }
}
