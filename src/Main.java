class Main {
    public static void main(String[] args) throws InterruptedException {
        CustomThread T1 = new CustomThread("Первый поток");
        CustomThread T2 = new CustomThread("Второй поток");
        CustomThread T3 = new CustomThread("Третий поток");
        T3.start();
        T3.join();
        T2.start();
        T2.join();
        T1.start();
        T1.join();

}}