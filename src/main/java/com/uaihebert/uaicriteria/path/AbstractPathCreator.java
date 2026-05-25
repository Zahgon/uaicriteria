/*
 * Copyright 2013 uaiHebert Solucoes em Informatica
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * */
package com.uaihebert.uaicriteria.path;

import com.uaihebert.uaicriteria.base.element.BaseCriteria;
import com.uaihebert.util.ReflectionUtil;
import javax.persistence.criteria.Predicate;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class AbstractPathCreator {

    protected AbstractPathCreator() {
    }

    static Predicate createAndPredicate(final BaseCriteria baseCriteria, final Predicate... equal) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void finishWithAndPredicate(final BaseCriteria baseCriteria, final Predicate... currentPredicate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static Comparable getTypedValue(final Class entityClass, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static Comparable numberType(final Class entityClass, final String attributeName, final Object value) {
        if (ReflectionUtil.isBigDecimal(entityClass, attributeName)) {
            return (BigDecimal) value;
        }
        if (ReflectionUtil.isDouble(entityClass, attributeName)) {
            return (Double) value;
        }
        if (ReflectionUtil.isLong(entityClass, attributeName)) {
            return (Long) value;
        }
        if (ReflectionUtil.isFloat(entityClass, attributeName)) {
            return (Float) value;
        }
        return (Integer) value;
    }
}
