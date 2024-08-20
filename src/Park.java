public class Park {
    private String name;
    private Attraction[] attractions;
    private int count;

    public Park(String name, int capacity) {
        this.name = name;
        this.attractions = new Attraction[capacity];
        this.count = 0;
    }

    public void addAttraction(String name, String workingHours, double price) {
        if (count < attractions.length) {
            attractions[count++] = new Attraction(name, workingHours, price);
        } else {
            System.out.println("Парк достиг максимального количества аттракционов.");
        }
    }

    public void displayAttractions() {
        System.out.println("Аттракционы в парке " + name + ":");
        for (int i = 0; i < count; i++) {
            attractions[i].displayInfo();
        }
    }

    private class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void displayInfo() {
            System.out.println("Название: " + name + ", Время работы: " + workingHours + ", Стоимость: " + price + " рублей");
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Джаваленд", 5);

        // Добавляем аттракционы
        park.addAttraction("Водопадный", "10:00 - 22:00", 550);
        park.addAttraction("V-образный", "09:00 - 23:00", 500);
        park.addAttraction("Итерационный", "12:00 - 20:00", 350);
        park.addAttraction("Инкрементальный", "10:00 - 18:00", 350);
        park.addAttraction("Спиральный", "11:00 - 21:00", 400);

        park.displayAttractions();
    }
}
