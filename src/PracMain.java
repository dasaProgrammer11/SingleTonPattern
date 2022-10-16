public class PracMain {

    public static void main(String args[]){
        SingleTonLazyInit singleTonLazyInit=SingleTonLazyInit.getInstance("value");
        singleTonLazyInit.show();

        SingleTonLazyInit singleTonLazyInit1=SingleTonLazyInit.getInstance("value");
        singleTonLazyInit1.show();

        SingletonLazyInitSynchronized singletonLazyInitSynchronized=SingletonLazyInitSynchronized.getInstance("Synchronized value");
        singletonLazyInitSynchronized.show();

        SingletonLazyInitSynchronized singletonLazyInitSynchronized1=SingletonLazyInitSynchronized.getInstance("Synchronized value");
        singletonLazyInitSynchronized1.show();

        SingleTonLazySyncDoubleCheck singleTonLazySyncDoubleCheck=SingleTonLazySyncDoubleCheck.getInstance("Double Check");
        singleTonLazySyncDoubleCheck.show();

        SingleTonLazySyncDoubleCheck singleTonLazySyncDoubleCheck1=SingleTonLazySyncDoubleCheck.getInstance("Double Check");
        singleTonLazySyncDoubleCheck1.show();

        SingletonLazySyncDoubleVolatile singletonLazySyncDoubleVolatile=SingletonLazySyncDoubleVolatile.getInstance("Volatile");
        singletonLazySyncDoubleVolatile.show();

        SingletonLazySyncDoubleVolatile singletonLazySyncDoubleVolatile1=SingletonLazySyncDoubleVolatile.getInstance("Volatile");
        singletonLazySyncDoubleVolatile1.show();
    }
}
