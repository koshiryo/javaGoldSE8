package exam101to150;

public class Exam135 {

    /**
     * 选项A
     */

    class Vehicle {

        int id;

        public void start() {
            class Engine {
                int eNo = id;
            }
        }
    }

    /**
     * 选项B
     */
    class Computer {

        private Card sCard = new SoundCard();

        private abstract class Card {

        }

        private class SoundCard extends Card {

        }
    }

    /**
     * 选项c
     */

    class Block {
        int bno;

        class Counter {
            int locator;

            Counter() {
                locator = bno;
            }
        }
    }

    /**
     * 选项D
     */
    interface Moveable {
        void move();

    }

    Moveable mProduct = new Moveable() {
        public void move() {

        }
    };

}
