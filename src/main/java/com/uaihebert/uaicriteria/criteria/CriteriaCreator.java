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
package com.uaihebert.uaicriteria.criteria;

import com.uaihebert.uaicriteria.base.element.BaseCriteria;
import com.uaihebert.uaicriteria.base.element.BasicCriteriaElements;
import com.uaihebert.uaicriteria.path.MultiSelectQueryPathCreator;
import com.uaihebert.uaicriteria.path.RegularQueryPathCreator;
import com.uaihebert.uaicriteria.subquery.SubQueryImp;
import java.util.List;

public class CriteriaCreator {

    private static final boolean DO_NOT_USE_LOWER_CASE = false;

    private final BasicCriteriaElements basicCriteriaElements;

    public CriteriaCreator(final BasicCriteriaElements basicCriteriaElements) {
        this.basicCriteriaElements = basicCriteriaElements;
    }

    public void andEquals(final boolean toLowerCase, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andNotEquals(final boolean toLowerCase, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void innerJoin(final String joinName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void innerJoinFetch(final String joinName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void leftJoinFetch(final String joinName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void leftJoin(final String joinName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void orderByDesc(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void orderByAsc(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFirstResult(final int firstResult) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMaxResults(final int maxResults) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addHint(final String key, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void orEquals(final boolean toLowerCase, final String attributeName, final Object... valueArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void orLike(final boolean toLowerCase, final String attributeName, final Object... valueArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void orNotLike(final boolean toLowerCase, final String attributeName, final Object... valueArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void orEquals(final boolean toLowerCase, final int index, final String attributeName, final Object[] valueArray, final CriteriaOrType orType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addAndSeparatedByOr(final boolean toLowerCase, final int index, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andIsMemberOf(final Object value, final String collectionName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andIsNotMemberOf(final Object value, final String collectionName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andBetween(final boolean toLowerCase, final String attributeName, final Object valueA, final Object valueB) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andGreaterOrEqualTo(final boolean toLowerCase, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andLessThan(final boolean toLowerCase, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andLessOrEqualTo(final boolean toLowerCase, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andGreaterThan(final boolean toLowerCase, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void orNotEquals(final boolean toLowerCase, final String attributeName, final Object[] valueArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andIsNull(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void orIsNull(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andIsNotNull(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void orIsNotNull(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andCollectionIsEmpty(final String collectionName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andCollectionIsNotEmpty(final String collectionName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDistinctTrue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andStringIn(final boolean toLowerCase, final String attributeName, final List<String> valueList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andStringNotIn(final boolean toLowerCase, final String attributeName, final List<String> valueList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andStringLike(final boolean toLowerCase, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andStringNotLike(final boolean toLowerCase, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <E> void andAttributeIn(final String attributeName, final List<E> attributeList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andAttributeIn(final String attributeName, final SubQueryImp uaiSubQuery) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void andAttributeNotIn(final String attributeName, final SubQueryImp uaiSubQuery) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <E> void andAttributeNotIn(final String attributeName, final List<E> attributeList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void sum(final String... attributeNameArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addMultiSelectSelectAttribute(final String... attributeNameArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void avg(final String... attributeNameArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void square(final String... attributeNameArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <N extends Number> void sum(final String attributeName, final N number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <N extends Number> void sum(final N number, final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void groupBy(final String[] attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void diff(final String firstAttribute, final String secondAttribute) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <N extends Number> void diff(final String attributeName, final N number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <N extends Number> void diff(final N number, final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void multiply(final String firstAttribute, final String secondAttribute) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <N extends Number> void multiply(final String attributeName, final N number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <N extends Number> void multiply(final N number, final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void divide(final String firstAttribute, final String secondAttribute) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <N extends Number> void divide(final String attributeName, final N number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <N extends Number> void divide(final N number, final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void module(final String firstAttribute, final String secondAttribute) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void module(final String attributeName, final Integer number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void module(final Integer number, final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void countAttribute(final String[] attributeArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
