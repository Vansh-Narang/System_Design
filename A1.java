interface animal {
    boolean canClimb();

    boolean canSpeak();

    void print();
    // In an interface by default function is public,abstract,default
}

abstract class results implements animal {
    public boolean canSpeak() {
        return true;
    }
}

class B1 extends results {
    public boolean canClimb() {
        return false;
    }

    public void print() {
        String animalis = "dog";
        System.out.println("Animal is=" + animalis);
    }
}

class A1 {
    public static void main(String[] args) {
        animal obj = new B1();
        System.out.println(obj.canClimb());
        System.out.println(obj.canSpeak());
        obj.print();
    }
}
