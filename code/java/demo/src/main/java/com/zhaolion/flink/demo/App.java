package com.zhaolion.flink.demo;

import com.google.gson.Gson;
import com.zhaolion.flink.demo.bean.config.AppConfig;
import com.zhaolion.flink.demo.proto.event.UserDurationEventSupplier;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {
        System.out.println( "Hello World!" );

        // config
        Yaml yaml = new Yaml(new Constructor(AppConfig.class));
        InputStream inputStream = App.class
                .getClassLoader()
                .getResourceAsStream("config/app.yaml");
        AppConfig appConfig = yaml.load(inputStream);
        System.out.println(appConfig);

        // kafka Producer

        // build random event
        UserDurationEventSupplier event = new UserDurationEventSupplier();
        System.out.println( new Gson().toJson(event.get()));
    }
}
