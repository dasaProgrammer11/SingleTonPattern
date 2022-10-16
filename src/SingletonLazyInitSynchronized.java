public class SingletonLazyInitSynchronized {

    private static SingletonLazyInitSynchronized singletonLazyInitSynchronized;
    private String data;

    private SingletonLazyInitSynchronized(String data){
        this.data=data;
    }

    public static SingletonLazyInitSynchronized getInstance(String data){

        /*
        Here the code bock is synchronized but irrespective of the time object is initialized all the thread will wait
         */
        synchronized(SingletonLazyInitSynchronized.class)
        {
            if (singletonLazyInitSynchronized == null)
                singletonLazyInitSynchronized= new SingletonLazyInitSynchronized(data+Math.random());
        }
        return singletonLazyInitSynchronized;
    }

    public void show(){
        System.out.println("here"+data);
    }
}
