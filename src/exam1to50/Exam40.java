package exam1to50;

public class Exam40 {

    public class Canvas implements Drawable {
        public void draw() {
        }
    }

    public abstract class Board extends Canvas {
    }

    public class Paper extends Canvas {
        protected void draw(int color) {
        }
    }

    public class Frame extends Canvas implements Drawable {
        public void resize() {
        }
    }

    public interface Drawable {
        public abstract void draw();
    }
}
