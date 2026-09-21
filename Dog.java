class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void breathe() {
        System.out.println("Animal breathes");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog d = new Dog();

        d.sound();
        d.breathe();
    }
}
