public class ThreadPause {
        // method to pause the string
        // here we will pass the time in seconds
        public void wait(int sec) {
            try {
                Thread.currentThread().sleep(sec * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
