class Кот extends Животное {
    private static int котCount = 0;
    private boolean сытость;

    public Кот() {
        котCount++;
        this.сытость = false;
    }

    public static int getКотCount() {
        return котCount;
    }

    public boolean покушать(Миска миска) {
        if (миска.покормитьКота(1)) {
            сытость = true;
            System.out.println("Кот покушал.");
            return true;
        } else {
            System.out.println("Коту не хватило еды в миске.");
            return false;
        }
    }

    public boolean isСытость() {
        return сытость;
    }

    @Override
    public void бег(int дистанция) {
        if (дистанция <= 200) {
            System.out.println("Кот бежит на " + дистанция + " метров.");
        } else {
            System.out.println("Кот не может бежать дальше 200 метров.");
        }
    }

    @Override
    public void плавание(int дистанция) {
        // Коты не могут плавать
        System.out.println("Кот не умеет плавать.");
    }
}