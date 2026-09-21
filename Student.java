class Student {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Rahul");
        s.setAge(20);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
