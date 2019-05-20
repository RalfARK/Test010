public enum Computation {
    Multiply {
        public double perform(double x, double y) {
            return x*y;
        }
    },
    Divide {
        @Override
        public double perform(double x, double y) {
            return x/y;
        }
    },
    Add {
        @Override
        public double perform(double x, double y) {
            return x+y;
        }
    },
    Subtract {
        @Override
        public double perform(double x, double y) {
            return x-y;
        }
    };



    public abstract double perform(double x, double y);


    public static void main(String[] args) {
        System.out.println("ADD "+ Computation.Add.perform(2,3));
        System.out.println("SUBTRACT "+ Computation.Subtract.perform(2,3));
        System.out.println("MULTIPLY "+ Computation.Multiply.perform(2,3));
        System.out.println("DIVIDE "+ Computation.Divide.perform(2,3));
    }
}
