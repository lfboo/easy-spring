package com.lfboo.demo.util;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 * Created by on 2018/9/18.
 *
 * @author lfb
 */
public class SerializeUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(SerializeUtil.class);

    public static byte[] serialize(Object obj) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Hessian2Output output = new Hessian2Output(bos);
        try {
            output.writeObject(obj);
            output.close();
        } catch (IOException e) {
            LOGGER.error("serialize exception", e);
        }
        return bos.toByteArray();
    }

    @SuppressWarnings("unchecked")
    public static <T> T deserialize(byte[] bytes) {
        if (null == bytes) {
            return null;
        }
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Hessian2Input hi = new Hessian2Input(bis);
        try {
            return (T) hi.readObject();
        } catch (IOException e) {
            LOGGER.error("deserialize exception", e);
        }

        return null;
    }

    public static void main(String[] args) {
        Map<String,Object> data = Maps.newHashMap();
        data.put("name", "lvfeibiao");

        byte[] sData = serialize(data);
        Map<String,Object> oData = deserialize(sData);

        System.out.println(oData);
    }

}
