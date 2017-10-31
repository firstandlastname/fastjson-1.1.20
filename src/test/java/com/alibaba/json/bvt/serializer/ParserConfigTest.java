package com.alibaba.json.bvt.serializer;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.ParserConfig;

public class ParserConfigTest extends TestCase {

    public void test_0() throws Exception {
        ParserConfig config = new ParserConfig();
        config.getDerializers();
        config.getDefaultSerializer();
    }

    public void test_error_0() throws Exception {
        ParserConfig config = new ParserConfig();
        
        Exception error = null;
        try {
            config.createJavaBeanDeserializer(int.class);
        } catch (JSONException ex) {
            error = ex;
        }
        Assert.assertNotNull(error);
    }
}
