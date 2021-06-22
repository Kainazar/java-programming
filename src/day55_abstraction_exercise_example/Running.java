package day55_abstraction_exercise_example;

public class Running extends Exercise {

        @Override
        public void perform() {
                System.out.println("Performing Running exercise");
        }

        @Override
        public int getCaloriesCount(int minutes) {
                return minutes * 13;
        }

        /**
         *
         * @param minutes - how long is exercise is performed
         * @return we are assuming avg num of calories while running is 13
         */

        }







