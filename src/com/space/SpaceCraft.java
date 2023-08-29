package com.space;

public class SpaceCraft {
    private int x, y, z;
    private char dir;

    public SpaceCraft(int x, int y, int z, char dir) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.dir = dir;
    }

    public void forwardMove() {
        switch (dir) {
            case 'N':
                y++;
                break;
            case 'S':
                y--;
                break;
            case 'E':
                x++;
                break;
            case 'W':
                x--;
                break;
        }
    }

    public void backwardMove() {
        switch (dir) {
            case 'N':
                y--;
                break;
            case 'S':
                y++;
                break;
            case 'E':
                x--;
                break;
            case 'W':
                x++;
                break;
        }
    }

    public void rightTurn() {
        switch (dir) {
            case 'N':
                dir = 'E';
                break;
            case 'S':
                dir = 'W';
                break;
            case 'E':
                dir = 'S';
                break;
            case 'W':
                dir = 'N';
                break;
        }
    }

    public void leftTurn() {
        switch (dir) {
            case 'N':
                dir = 'W';
                break;
            case 'S':
                dir = 'E';
                break;
            case 'E':
                dir = 'N';
                break;
            case 'W':
                dir = 'S';
                break;
        }
    }

    public void up() {
        if (z < 1) {
            z++;
        }
    }

    public void down() {
        if (z > -1) {
            z--;
        }
    }

    public void executeCommands(char[] cmd) {
        for (char cmds : cmd) {
            switch (cmds) {
                case 'f':
                    forwardMove();
                    break;
                case 'b':
                    backwardMove();
                    break;
                case 'r':
                    rightTurn();
                    break;
                case 'l':
                    leftTurn();
                    break;
                case 'u':
                    up();
                    break;
                case 'd':
                    down();
                    break;
            }
        }
    }

    public String printFinalAnswer() {
        return "Final Position: (" + x + ", " + y + ", " + z + ")\n" +
               "Final Direction: " + dir;
    }

}
