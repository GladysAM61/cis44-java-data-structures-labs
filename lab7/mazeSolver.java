/**
 *
 * @author gladysarias
 */
public class mazeSolver {
    private char[][] maze;
    //making an array to track where they visited already
    private int [][] visited;
    public mazeSolver(char[][] maze) {
        this.maze = maze;
        this.visited = new int[maze.length][maze[0].length];
        
        
    }

    /**
     * Prints the current state of the maze.
     */
    public void printMaze() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }

    /**
     * Public wrapper method to start the maze-solving process.
     * It should find the starting 'S' position and initiate the recursive search.
     * @return true if a path is found, false otherwise.
     */
    public boolean solve() {
        // TODO: Find the starting row and column of 'S'
       
        int startRow = -1;
        int startCol = -1;
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                //if its S, then place i in startRow and j in startCol
                //this finds the starting row and column
                if (maze[i][j] == 'S') {
                    startRow = i;
                    startCol = j;
                    break;
                }
            }
        }
        
        if (startRow != -1) {
            return solve(startRow, startCol);
        }
        return false;
    }

    /**
     * The core recursive method to solve the maze.
     * @param row The current row position.
     * @param col The current column position.
     * @return true if this position leads to a solution, false otherwise.
     */
    private boolean solve(int row, int col) {
        
        // 1. Base Case (Stopping Conditions)
        
        //check if it outside the maze boundaries and not a valid path
        //if its less than 0 then its too small
        //if its greater than the maze.length, then its out of the 2d grid
        if(row<0 || row>=maze.length || col < 0 || col >= maze[0].length){
            return false;
        }
        
       //  Check if it's a wall ('#')
        if (maze[row][col] == '#') {
            return false;
        }
         
        //check if its already visited
        //to check we create a int array that increments everytime it is visited
        //this means that if it is bigger than 0, it was already visited 
        if (visited[row][col] > 0) {  
            return false;
        }
        
        //checking if its the finish('f')
        if (maze[row][col] == 'F') {
            return true;
        }
        
        //incrementing the current cell
        visited[row][col]++;
        
      
        
        // 2. Recursive Step
        // 3. Backtracking
       
        //creating a variable where we will store the original char 
        //helps us place a '.' to make a track
        char originalChar = maze[row][col];
        if (originalChar != 'S') {
            maze[row][col] = '.';
        }

        
        //going north,east,south,west
        
        // North : to go up, you go to the previous row so you subtract 1 from it
        if (solve(row - 1, col)) {
            return true;
        }
    
        // East: to go right, you go to the next column so you add one to it
        if (solve(row, col + 1)) {
            return true;
        }

        // South:to go down you go to the next row so you add 1 to it
        if (solve(row + 1, col)) {
            return true;
        }

        // West: to go left, you go to the previous column so you subtract one to it
        if (solve(row, col - 1)) {
            return true;
        }
        
        
        // Backtrack by un-marking the cell on the maze 
        if (originalChar != 'S') {
            maze[row][col] = ' ';
        }
        

        
        return false; // Placeholder
    }

    public static void main(String[] args) {
        char[][] mazeToSolve = {
            {'#', '#', '#', '#', '#', '#', '#'},
            {'#', 'S', ' ', '#', ' ', ' ', '#'},
            {'#', ' ', ' ', '#', ' ', '#', '#'},
            {'#', ' ', '#', ' ', ' ', ' ', '#'},
            {'#', ' ', ' ', ' ', '#', 'F', '#'},
            {'#', '#', '#', '#', '#', '#', '#'}
        };
      
        mazeSolver solver = new mazeSolver(mazeToSolve);

        System.out.println("Original Maze:");
        solver.printMaze();

        if (solver.solve()) {
            System.out.println("Solution Found:");
        } else {
            System.out.println("No Solution Found:");
        }
        solver.printMaze();
    }
}
