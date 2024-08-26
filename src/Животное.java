class Животное {
    private static int count = 0;

    public Животное() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void бег(int дистанция) {
        System.out.println("Животное бежит на " + дистанция + " метров.");
    }

    public void плавание(int дистанция) {
        System.out.println("Животное плывет на " + дистанция + " метров.");
    }
}