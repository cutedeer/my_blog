package com.sushuzhuang.blogs.common.aop;

import com.sushuzhuang.blogs.common.util.JacksonHandler;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collection;

/**
 * 集合所有列不能为空
 *
 * @author shuzhuang.su
 * @date 2020-05-21 14:53
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotEmptyFieldsValidator.class)
public @interface NotEmptyFields {

    String message() default "List cannot contain empty fields";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

class NotEmptyFieldsValidator implements ConstraintValidator<NotEmptyFields, Collection<?>> {

    @Override
    public void initialize(NotEmptyFields notEmptyFields) {
    }

    @Override
    public boolean isValid(Collection<?> objects, ConstraintValidatorContext context) {
        System.out.println(JacksonHandler.toSerialize(objects));
        if (CollectionUtils.isNotEmpty(objects)) {
            for (Object field : objects) {
                if (field == null) {
                    return false;
                }
                if (field instanceof String && StringUtils.isBlank(field.toString())) {
                    return false;
                }
                if (field instanceof Collection && !isValid((Collection<?>) field, context)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}