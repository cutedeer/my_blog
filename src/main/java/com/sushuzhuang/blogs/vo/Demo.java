package com.sushuzhuang.blogs.vo;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * test
 *
 * @author shuzhuang.su
 * @date 2020-05-21 14:35
 */
public class Demo {

    @NotBlank(message = "不可为空")
    private String add;

    @NotBlank.List(@NotBlank)
    private List<String> list;

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
