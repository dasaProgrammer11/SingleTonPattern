public class SingleTonLazyInit {

    private static SingleTonLazyInit singleTonLazyInit;
    private String data;

    private  SingleTonLazyInit(String data){
        this.data=data;
    }

    public static SingleTonLazyInit getInstance(String data){
        /*
        Here the code still can be impacted by multiple threads
         */

        if(singleTonLazyInit==null)
            singleTonLazyInit=new SingleTonLazyInit(data+Math.random());
        return  singleTonLazyInit;
    }

    public void show(){
        System.out.println("here value"+data);
    }


}
