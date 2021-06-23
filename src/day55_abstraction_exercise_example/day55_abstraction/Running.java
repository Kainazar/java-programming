package day55_abstraction_exercise_example.day55_abstraction;

public abstract class Running extends Exercise {

        @Override
        public void perform() {
            System.out.println("When i run 10 min "+ Running.this.calories(10));
        }

        @Override
        public int calories(int minutes) {
            return 0;
        }

    }



