public class dragon06 {
    int x, y, width, height;

    // Constructor
    public dragon06(int initialX, int initialY, int areaWidth, int areaHeight) {
        x = initialX;
        y = initialY;
        width = areaWidth;
        height = areaHeight;
    }

    // Method to move the dragon to the left
    void moveLeft() {
        if (x > 0) {
            x--;
        } else {
            detectCollision();
        }
    }

    // Method to move the dragon to the right
    void moveRight() {
        if (x < width - 1) {
            x++;
        } else {
            detectCollision();
        }
    }

    // Method to move the dragon up
    void moveUp() {
        if (y > 0) {
            y--;
        } else {
            detectCollision();
        }
    }

    // Method to move the dragon down
    void moveDown() {
        if (y < height - 1) {
            y++;
        } else {
            detectCollision();
        }
    }

    // Method to print the current position of the dragon
    void printPosition() {
        System.out.println("Dragon position: (" + x + ", " + y + ")");
    }

    // Method to detect collision and print "Game Over" message
    void detectCollision() {
            System.out.println("Game Over");
    }

    public static void main(String[] args) {
        // Example Usage
        dragon06 dragon = new dragon06(5, -1, 10, 10);
        
        // Move the dragon around
        dragon.moveLeft();
        dragon.printPosition();

        dragon.moveUp();
        dragon.printPosition();

        dragon.moveRight();
        dragon.printPosition();

        dragon.moveDown();
        dragon.printPosition();

    }
}
