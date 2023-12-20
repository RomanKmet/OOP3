public class Child extends AbstractClass {
    private String name;
    private int money;
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    Child(String name) {
        this.name = name;
    }
    int count(int a, int b){
        int ChildCounting = a + b;
        System.out.println(this.name + " добавив два числа і получилось: " + ChildCounting);
        return ChildCounting;
    }
    int write(int time){
        int words = time * 2;
        System.out.println(this.name + " за виділений час написав стільки слів: " + words);
        return words;
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}