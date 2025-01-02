public class ThreadPause {
        // method to pause the string
        // here we will pass the time in seconds
        @SuppressWarnings("CallToPrintStackTrace")
        public void wait(int sec) {
            try {
                Thread.currentThread();
                Thread.sleep(sec * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
