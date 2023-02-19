interface animal {
    boolean canClimb();

}

class Dog implements animal {
    public boolean canClimb() {
        return false;
    }
}

class Vansh {
    public static void main(String args[]) {
        Dog obj = new Dog();
        System.out.println(obj.canClimb());
    }
}
