public class Dispetchering {
    Child choosenChild = new Child("Віктор");
    Teen choosenTeen = new Teen("Данило");
    Adult choosenAdult = new Adult("Ярослав");
    Child person;

    void menu(int whichPerson) {
        if (whichPerson == 1) {
            person = choosenChild;
            System.out.println(choosenChild.count(5,10));
            System.out.println(choosenChild.write(40));
        } else if (whichPerson == 2) {
            person = choosenTeen;
            System.out.println(choosenTeen.count(53,15,532,76,43));
            System.out.println(choosenTeen.write(40));
        } else if (whichPerson == 3) {
            person = choosenAdult;
            System.out.println(choosenAdult.count(54.3,123,34.8,43.4));
            System.out.println(choosenAdult.write(40));
        }
    }
}
