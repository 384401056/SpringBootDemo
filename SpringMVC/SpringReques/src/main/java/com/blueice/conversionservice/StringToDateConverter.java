package com.blueice.conversionservice;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/4/20.
 */
@Repository("StringToDataComverter")
public class StringToDateConverter implements Converter<String,Date> {

    private String datePattern;


    public StringToDateConverter(String datePattern) {
        this.datePattern = datePattern;
    }

    @Override
    public Date convert(String s) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(this.datePattern);
            return sdf.parse(s);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("日期转换失败!");
            return null;
        }
    }
}
