class Time {
    int hours, minutes, seconds;

    // Constructor with seconds
    Time(int seconds) {
        this.seconds = seconds;
        this.hours = seconds / 3600;
        this.minutes = (seconds % 3600) / 60;
        this.seconds = seconds % 60;
    }

    // Constructor with minutes and seconds
    Time(int minutes, int seconds) {
        this.hours = 0;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Constructor with hours, minutes and seconds
    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void display() {
        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }

    public static void main(String[] args) {
        Time t1 = new Time(30);
        Time t2 = new Time(5, 30);
        Time t3 = new Time(2, 15, 30);

        t1.display();
        t2.display();
        t3.display();
    }
}
