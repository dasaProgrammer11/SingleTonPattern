public class SingletonLazySyncDoubleVolatile {

    private static SingletonLazySyncDoubleVolatile singleTonLazySyncDoubleCheckVolatile;
    private String data;

    private SingletonLazySyncDoubleVolatile(String data){
        this.data=data;
    }

    public static SingletonLazySyncDoubleVolatile getInstance(String data){

        /*
        double code check - if object is intialized thread will not wait -but it may happen with some partial data other thread may start working
         */
        if (singleTonLazySyncDoubleCheckVolatile == null) {
            synchronized (SingletonLazyInitSynchronized.class) {
                if (singleTonLazySyncDoubleCheckVolatile == null)
                    singleTonLazySyncDoubleCheckVolatile = new SingletonLazySyncDoubleVolatile(data + Math.random());
            }
        }
        return singleTonLazySyncDoubleCheckVolatile;
    }

    public void show(){
        System.out.println("here double check volatile"+data);
    }
}
