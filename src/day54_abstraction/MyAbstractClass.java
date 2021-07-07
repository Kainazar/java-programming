package day54_abstraction;

public abstract class MyAbstractClass {



        public void learn() {
            int num = 55;
            System.out.println("Learning...");
        }
        public abstract  void close();
    }

    class Sub extends MyAbstractClass{
        @Override
        public void close() {
            System.out.println("Close - abstract method implementation ");
        }
    }
    class MyObjects {
       public static void main(String[] args) {
        Sub sub = new Sub();
        sub.learn();
        sub.close();


    }


    }





