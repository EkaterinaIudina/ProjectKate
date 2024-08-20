public class Sotrudnik {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Sotrudnik(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary + " рублей");
        System.out.println("Возраст: " + age + " лет");
        System.out.println("------------------------------");
    }

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
    }
}

