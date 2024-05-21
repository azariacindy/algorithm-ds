package jobsheet9_LinkedList.tugasLinked;

public class ScavengerHunt06 {
    Point06 start;

    public ScavengerHunt06() {
        start = null;
    }

    public boolean isEmpty() {
        return (start == null);
    }

    public void addPoint(String question, String answer) {
        Point06 newPoint = new Point06(question, answer);

        if (isEmpty()) {
            start = newPoint;
        } else {
            Point06 currentPoint = start;

            while (currentPoint.next != null) {
                currentPoint = currentPoint.next;
            }

            currentPoint.next = newPoint;
        }
    }

    public boolean checkAnswer(String givenAnswer) {
        if (!isEmpty()) {
            return start.answer.equalsIgnoreCase(givenAnswer);
        } else {
            return false;
        }
    }

    public void nextPoint() {
        if (!isEmpty()) {
            start = start.next;
        } else {
            System.out.println("Game is empty!");
        }
    }
}
