public class Main {
    public static void main(String[] args) {
//        BaseLogger[] baseLogger = new BaseLogger[]{new DataBaseLogger(),
//                new FileLogger(), new EmailLogger(), new ConsoleLogger()};
//
//        for (BaseLogger logger : baseLogger) {
//            logger.log("Log message");
//        }

        CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
        customerManager.add();
    }
}