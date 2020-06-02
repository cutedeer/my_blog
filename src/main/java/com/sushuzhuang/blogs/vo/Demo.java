package com.sushuzhuang.blogs.vo;

import com.sushuzhuang.blogs.common.aop.NotEmptyFields;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * test
 *
 * @author shuzhuang.su
 * @date 2020-05-21 14:35
 */
public class Demo {

    @NotBlank(message = "add不可为空")
    private String add;

    @NotEmptyFields(message = "list不可为空")
    private List<String> list;

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
