public class SingleTonLazySyncDoubleCheck {

    private static SingleTonLazySyncDoubleCheck singleTonLazySyncDoubleCheck;
    private String data;

    private SingleTonLazySyncDoubleCheck(String data){
        this.data=data;
    }

    public static SingleTonLazySyncDoubleCheck getInstance(String data){

        /*
        double code check - if object is intialized thread will not wait -but it may happen with some partial data other thread may start working
         */
        if (singleTonLazySyncDoubleCheck == null) {
            synchronized (SingletonLazyInitSynchronized.class) {
                if (singleTonLazySyncDoubleCheck == null)
                    singleTonLazySyncDoubleCheck = new SingleTonLazySyncDoubleCheck(data + Math.random());
            }
        }
        return singleTonLazySyncDoubleCheck;
    }

    public void show(){
        System.out.println("here double check"+data);
    }
}
