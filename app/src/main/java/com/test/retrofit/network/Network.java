package com.test.retrofit.network;

import com.test.retrofit.bean.BaseBean;
import com.test.retrofit.bean.GongZhongHaoRes;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/***
 *   created by android on 2019/9/18
 */
public class Network {
    public void get(){
        Retrofit.Builder builder = new Retrofit.Builder();

        Retrofit build = builder.build();
        build.create(IRequest.class).tabList().enqueue(new Callback<BaseBean<GongZhongHaoRes>>() {
            @Override
            public void onResponse(Call<BaseBean<GongZhongHaoRes>> call, Response<BaseBean<GongZhongHaoRes>> response) {

            }
            @Override
            public void onFailure(Call<BaseBean<GongZhongHaoRes>> call, Throwable t) {
                
            }
        });
    }
}
