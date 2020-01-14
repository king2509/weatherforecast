package com.test.weatherforcast.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    //有部分json对象没有写进去
    //如果json对象里还包含着另一个json对象，那就再创建一个类作为这个类的属性
    //@SerializedName只是为了建立一个映射，直接用city作为属性名也可以，但是可能不符合java编码规范
    @SerializedName("cid")
    public String weatherId;

    @SerializedName("location")
    public String cityName;

    @SerializedName("parent_city")
    public String parentCity;

    @SerializedName("admin_city")
    public String adminCity;
}
