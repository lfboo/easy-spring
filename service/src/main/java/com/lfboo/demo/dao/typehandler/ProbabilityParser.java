package com.lfboo.demo.dao.typehandler;

import com.alibaba.fastjson.JSONArray;
import com.google.common.collect.Lists;
import com.lfboo.demo.common.dto.Probability;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Created by on 2018/10/7.
 *
 * @author lfb
 */
public class ProbabilityParser {

    public static List<Probability> parse(String probability) {
        if (StringUtils.isBlank(probability)) {
            return Lists.newArrayList();
        }

        return JSONArray.parseArray(probability, Probability.class);
    }

    public static void main(String[] args) {
        String probability = "[{\"min\":0.1, \"max\":0.9, \"probability\":50},{\"min\":1,\"max\":2, \"probability\":40},{\"min\":2.1,\"max\":5,\"probability\":10}]";
        List<Probability> probabilities = parse(probability);
        System.out.println(probabilities);
    }

}
