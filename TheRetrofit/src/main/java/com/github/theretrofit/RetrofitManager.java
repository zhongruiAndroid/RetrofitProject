package com.github.theretrofit;

import retrofit2.Retrofit;

/***
 *   created by android on 2019/9/19
 */
public class RetrofitManager {
    private static RetrofitManager singleObj;
        private RetrofitManager() {
    }
    public static RetrofitManager get(){
        if(singleObj==null){
            synchronized (RetrofitManager.class){
                if(singleObj==null){
                    singleObj=new RetrofitManager();
                }
            }
        }
        return singleObj;
    }







    public Retrofit getRetrofit(){
            
            return null;
    }
}
