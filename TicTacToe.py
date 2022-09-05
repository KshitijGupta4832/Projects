

from time import sleep
from tqdm import tqdm


def Animate():

    for i in tqdm(range(0, 100), desc="LOADING => "):
        pass
        sleep(0.1)


def total(r1, r2, r3):
    return r1+r2+r3


def board(x, y):
    "0 | 1 | 2"
    "--|---|---"
    "3 | 4 | 5"
    "--|---|---"
    "6 | 7 | 8"

    zero = 'X'if x[0] else ('O' if y[0] else 0)
    one = 'X'if x[1] else ('O' if y[1] else 1)
    two = 'X'if x[2] else ('O' if y[2] else 2)
    three = 'X'if x[3] else ('O' if y[3] else 3)
    four = 'X'if x[4] else ('O' if y[4] else 4)
    five = 'X'if x[5] else ('O' if y[5] else 5)
    six = 'X'if x[6] else ('O' if y[6] else 6)
    seven = 'X'if x[7] else ('O' if y[7] else 7)
    eight = 'X'if x[8] else ('O' if y[8] else 8)

    print(f"\t\t\t\t\t\t{zero} | {one} | {two}")
    print("\t\t\t\t\t\t--|---|---")
    print(f"\t\t\t\t\t\t{three} | {four} | {five}")
    print("\t\t\t\t\t\t--|---|---")
    print(f"\t\t\t\t\t\t{six} | {seven} | {eight}")
    print("\n")


def winner(x, y):
    wins = [[0, 1, 2], [3, 4, 5], [6, 7, 8], [0, 3, 6],
            [1, 4, 7], [2, 5, 8], [0, 4, 8], [2, 4, 6]]
    for win in wins:
        if (total(x[win[0]], x[win[1]], x[win[2]]) == 3):
            print("\t\t\t\t\tX Won")
            return 1
        if (total(y[win[0]], y[win[1]], y[win[2]]) == 3):
            print("\t\t\t\t\tO Won")
            return 0
    return -1


pass


if __name__ == "__main__":
    x = [0, 0, 0, 0, 0, 0, 0, 0, 0]
    y = [0, 0, 0, 0, 0, 0, 0, 0, 0]
    turn = 0
    Animate()
    print("\t\t\t\t\tWelcome to TIC-TAC-TOE 2022")
    # X if 0 else Y when 1
    a = 0
    while (True):
        board(x, y)
        if turn == 0:
            print("\t\t\t\t\tX's turn")
            X = int(input("\t\t\t\t\tEnter a value"))
            b = True
            if X > 8:
                X = 0
                print("\t\t\t\t\tYou Entered 9", end=" Renter the value\n")
                while (b):
                    X = int(input("\t\t\t\t\tEnter a value"))
                    if (X >= 0 or X <= 8):
                        b = False

            x[X] = 1
        else:
            print("\t\t\t\t\tO's turn")
            X = int(input("\t\t\t\t\tEnter a value"))
            b = True
            if X > 8:
                X = 0
                print("\t\t\t\t\tYou Entered 9", end=" Renter the value\n")
                while (b):
                    X = int(input("\t\t\t\t\tEnter a value"))
                    if (X >= 0 or X <= 8):
                        b = False
            y[X] = 1
        cwin = winner(x, y)
        a = a+1
        if (cwin != -1 or a == 9):
            print("\t\t\t\t\tMatch over")
            break

        turn = 1-turn
