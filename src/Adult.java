public final class Adult extends Teen {
    private double weight;
    private double height;
    private int age;

    Adult(String name) {
        super(name);
    }

    Adult(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    Adult(String name, double weight, double height) {
        super(name);
        this.weight = weight;
        this.height = height;
    }

    Adult(String name, double weight, double height, int age) {
        super(name);
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    double count(double... numbers) {
        double sum = 0;
        for (double i : numbers)
            sum += i;
        System.out.println(this.getName() + " добавив дробові числа і получилось: " + String.format("%.3f", sum));
        return sum;
    }

    int write(int time) {
        int words = time*6;
        System.out.println(this.getName() + " за виділений час написав стільки слів: " + words);
        return words;
    }
    class countMoney {
        void sumMoney(Teen askedTeen, Child askedChild, Adult askedAdult){
            double allMoney = askedTeen.getMoney() + askedChild.getMoney() + askedAdult.getMoney();
            System.out.println("Разом є грошей: "+allMoney);
        }
    }
    void checkMoney(Teen askedTeen, Child askedChild, Adult askedAdult){
        countMoney checking = new countMoney();
        checking.sumMoney(askedTeen,askedChild,askedAdult);
    }
    void howMuchMoney(Teen askedperson, Child askedperson2) {
        System.out.println("В " + askedperson.getName() + " стільки грошей: " + askedperson.getMoney());
        System.out.println("В " + askedperson2.getName() + " стільки грошей: " + askedperson2.getMoney());
    }
    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

