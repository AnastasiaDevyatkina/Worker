public class Main {
    public static void main(String[] args) {
       OnTaskDoneList listener = System.out::println;
       OnTaskErrorListener errorCallback = System.out::println;

        Worker worker = new Worker(listener, errorCallback);
        worker.start();
    }
}