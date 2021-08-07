public class Worker {

        private OnTaskDoneList callback;
        private OnTaskErrorListener errorCallback;

        public Worker(OnTaskDoneList callback, OnTaskErrorListener errorCallback) {
            this.callback = callback;
            this.errorCallback = errorCallback;
        }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i + 1 == 33) {
                errorCallback.onError("Task " + (i + 1) + " error");
            }
            callback.onDone("Task " + (i + 1) + " is done");
        }
    }
}