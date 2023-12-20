public class Teen extends Child {

    Teen(String name) {
        super(name);
    }

    int count(int... numbers) {
        int sum = 0;
        for (int i : numbers)
            sum += i;
        System.out.println(this.getName() + " добавив числа і получилось: " + sum);
        return sum;
    }
    int write(int time) {
        int words = time * 4;
        System.out.println(this.getName() + " за виділений час написав стільки слів: " + words);
        return words;
    }
}