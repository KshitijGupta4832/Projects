
def Traversal(grid):  # Prints the Sudoko Grid
    for i in range(N):
        for j in range(N):
            print(grid[i][j], end=" ")
        print()


def Checker(grid, row, col, num):
    for i in range(N):  # Checks that the num is present in row
        if grid[row][i] == num:
            return False
    for i in range(N):  # Checks that the num is present in col
        if grid[i][col] == num:
            return False

    SR = row - row % 3
    SC = col - col % 3
    for i in range(3):  # Checks that the num is present in the 3X3 Matrix of the grid
        for j in range(3):
            if grid[i + SR][j + SC] == num:
                return False
    return True


def MAINFUNCTION(grid, row, col):  # Inserts the num in the grid wherever needed

    if (row == N - 1 and col == N):  # For the 8th row and 9 col
        return True

    if col == N:
        row += 1  # Increments the row
        col = 0
    if grid[row][col] > 0:  # Checks that the any box in the grid is empty of not
        # Retruns the MAIN FUNCTION if the grid is empty
        return MAINFUNCTION(grid, row, col + 1)

    for num in range(1, N + 1):
        if Checker(grid, row, col, num):
            grid[row][col] = num

            if MAINFUNCTION(grid, row, col + 1):
                return True

        grid[row][col] = 0
    return False  # If no solution exists this will be returned


if __name__ == "__main__":

    grid = [[3, 0, 6, 5, 0, 8, 4, 0, 0],
            [5, 2, 0, 0, 0, 0, 0, 0, 0],
            [0, 8, 7, 0, 0, 0, 0, 3, 1],
            [0, 0, 3, 0, 1, 0, 0, 8, 0],
            [9, 0, 0, 8, 6, 3, 0, 0, 5],
            [0, 5, 0, 0, 9, 0, 6, 0, 0],
            [1, 3, 0, 0, 0, 0, 2, 5, 0],
            [0, 0, 0, 0, 0, 0, 0, 7, 4],
            [0, 0, 5, 2, 0, 6, 3, 0, 0]]
    N = len(grid)
    if (MAINFUNCTION(grid, 0, 0)):
        Traversal(grid)
    else:
        print("NO SOLUTION EXISTS")
