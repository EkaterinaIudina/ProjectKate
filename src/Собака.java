class Собака extends Животное {
    private static int собакаCount = 0;

    public Собака() {
        собакаCount++;
    }

    public static int getСобакаCount() {
        return собакаCount;
    }

    @Override
    public void бег(int дистанция) {
        if (дистанция <= 500) {
            System.out.println("Собака бежит на " + дистанция + " метров.");
        } else {
            System.out.println("Собака не может бежать дальше 500 метров.");
        }
    }

    @Override
    public void плавание(int дистанция) {
        if (дистанция <= 10) {
            System.out.println("Собака плывет на " + дистанция + " метров.");
        } else {
            System.out.println("Собака не может плавать дальше 10 метров.");
        }
    }
}