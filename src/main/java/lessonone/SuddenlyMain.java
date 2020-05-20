package lessonone;

public class SuddenlyMain {
    public static void main(String[] args) {
        UniversalSoldierGeneric<Integer> integerSwapGeneric = new UniversalSoldierGeneric<>(0, 1, 2, 3, 4, 5, 42);
        integerSwapGeneric.showType();
        integerSwapGeneric.arrayPrinter();
        integerSwapGeneric.swapper(3, 6);
        System.out.println("Позиции 3 и 6 в массиве были изменены местами.");
        integerSwapGeneric.arrayPrinter();

        System.out.println();

        UniversalSoldierGeneric<String> stringSwapGeneric = new UniversalSoldierGeneric<>("Camillo Agrippa", "Hans Talhoffer", "Joachim Meyer", "Jerónimo Sánchez de Carranza", "Gérard Thibault d'Anvers", "Luis Pacheco de Narváez", "Fiore Furlano de'i Liberi", "Achille Marozzo", "Giacomo di Grassi", "Nicoletto Giganti");
        stringSwapGeneric.showType();
        stringSwapGeneric.arrayPrinter();
        stringSwapGeneric.swapper(3, 7);
        System.out.println("Карранза и Мароццо меняются местами.");
        stringSwapGeneric.arrayPrinter();

        System.out.println();

        stringSwapGeneric.asArrayLister();
        stringSwapGeneric.listPrinter();

        System.out.println();

        Box<Apple> appleBox = new Box<>(new Apple("elongated", "red", "unripe", 1.0f, "Royal Gala", 2.5f), new Apple("rounded", "yellow", "ripe", 1.0f, "Golden Delicious", 1.0f));

        Box<Orange> orangeBox = new Box<>(new Orange("rounded", "bright orange", "ripe", 1.5f, "Salustiano", 60.0f), new Orange("rounded", "red", "overripe", 1.5f, "Sanguinello", 85.0f), new Orange("rounded", "yellow", "ripe", 1.5f, "Hamlin", 75.0f));

        float totalAppleWeight = getAppleBoxWeight(appleBox);
        System.out.printf("Вес коробки с яблоками: %f%n%n", totalAppleWeight);

        float totalOrangeWeight = getOrangeBoxWeight(orangeBox);
        System.out.printf("Вес коробки с апельсинами: %f%n%n", totalOrangeWeight);
    }


    private static float getAppleBoxWeight(Box<Apple> fruitBox) {
        float totalWeight = 0.0f;
        for (int i = 0; i < fruitBox.listOfFruits.size(); i++) {
            totalWeight += fruitBox.listOfFruits.get(i).getWeight();
        }
        return totalWeight;
    }

    private static float getOrangeBoxWeight(Box<Orange> fruitBox) {
        float totalWeight = 0.0f;
        for (int i = 0; i < fruitBox.listOfFruits.size(); i++) {
            totalWeight += fruitBox.listOfFruits.get(i).getWeight();
        }
        return totalWeight;
    }
}
