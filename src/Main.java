public class Main {
    public static void main(String[] args) {

        Sotrudnik[] sotrudniki = new Sotrudnik[5];
        sotrudniki[0] = new Sotrudnik("Петров Иван Иванович", "Менеджер", "ivanovich@mail.com", "+7 123 456-78-90", 50000, 30);
        sotrudniki[1] = new Sotrudnik("Козлова Ольга Владимировна", "Разработчик", "kozlova@example.com", "+7 098 765-43-21", 70000, 28);
        sotrudniki[2] = new Sotrudnik("Кузнецова Анна Владимировна", "Дизайнер", "kuznetsova@example.com", "+7 456 789-01-23", 60000, 35);
        sotrudniki[3] = new Sotrudnik("Смирнов Алексей Андреевич", "Аналитик", "smirnov@example.com", "+7 321 654-98-76", 55000, 40);
        sotrudniki[4] = new Sotrudnik("Сидорова Анна Петровна", "Тестировщик", "sidorova@example.com", "+7 987 654-32-10", 48000, 27);

        for (Sotrudnik sotrudnik : sotrudniki) {
            sotrudnik.displayInfo();
        }

        Park park = new Park("Джаваленд", 5);

        park.addAttraction("Водопадный", "10:00 - 22:00", 550);
        park.addAttraction("V-образный", "09:00 - 23:00", 500);
        park.addAttraction("Итерационный", "12:00 - 20:00", 350);
        park.addAttraction("Инкрементальный", "10:00 - 18:00", 350);
        park.addAttraction("Спиральный", "11:00 - 21:00", 400);

        park.displayAttractions();
    }
}
