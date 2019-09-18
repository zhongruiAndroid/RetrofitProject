package com.test.retrofit.network;

import com.test.retrofit.bean.GongZhongHaoRes;
import com.test.retrofit.bean.BaseBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/***
 *   created by android on 2019/9/18
 */
public interface IRequest {

    @GET("wxarticle/chapters/json")
    Call<BaseBean<GongZhongHaoRes>> tabList();

}
