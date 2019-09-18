package com.github.theretrofit;

/***
 *   created by android on 2019/9/18
 */
public class TheRetrofit {
    private static TheRetrofit singleObj;
        private TheRetrofit() {
    }
    public static TheRetrofit get(){
        if(singleObj==null){
            synchronized (TheRetrofit.class){
                if(singleObj==null){
                    singleObj=new TheRetrofit();
                }
            }
        }
        return singleObj;
    }

}
