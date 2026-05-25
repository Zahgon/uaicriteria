/*
 * Copyright 2012 uaiHebert Solucoes em Informatica
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
package com.uaihebert.model;

import com.uaihebert.uaicriteria.UaiCriteria;
import java.util.List;

public class EasyCriteriaImp<T> implements EasyCriteria<T> {

    private final UaiCriteria<T> uaiCriteria;

    public EasyCriteriaImp(final UaiCriteria<T> uaiCriteria) {
        this.uaiCriteria = uaiCriteria;
    }

    public List<T> getResultList() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public T getSingleResult() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteriaImp<T> andEquals(final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andEquals(final boolean toLowerCase, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andNotEquals(final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andNotEquals(final boolean toLowerCase, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> orNotEquals(final String attributeName, final Object... values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> orNotEquals(final boolean toLowerCase, final String attributeName, final Object... valueArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String[] convertToStringArray(final Object[] valueArray) {
        final String[] stringArray = new String[valueArray.length];
        for (int i = 0; i < valueArray.length; i++) {
            stringArray[i] = valueArray[i].toString();
        }
        return stringArray;
    }

    public EasyCriteria<T> andGreaterThan(final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andGreaterThan(final boolean toLowerCase, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andGreaterOrEqualTo(final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andGreaterOrEqualTo(final boolean toLowerCase, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andLessThan(final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andLessThan(final boolean toLowerCase, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andLessOrEqualTo(final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andLessOrEqualTo(final boolean toLowerCase, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> innerJoin(final String joinName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> setDistinctTrue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> leftJoin(final String joinName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> innerJoinFetch(final String joinName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> leftJoinFetch(final String joinName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andBetween(final String attributeName, final Object valueA, final Object valueB) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andBetween(final boolean toLowerCase, final String attributeName, final Object valueA, final Object valueB) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andIsNull(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andIsNotNull(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andCollectionIsEmpty(final String collectionName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andCollectionIsNotEmpty(final String collectionName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andStringLike(final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andStringLike(final boolean toLowerCase, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andStringNotLike(final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andStringNotLike(final boolean toLowerCase, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andStringIn(final String attributeName, final List<String> values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andStringIn(final boolean toLowerCase, final String attributeName, final List<String> values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andStringNotIn(final String attributeName, final List<String> values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andStringNotIn(final boolean toLowerCase, final String attributeName, final List<String> values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> orderByAsc(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> orderByDesc(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> setFirstResult(final Integer firstResult) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> setMaxResults(final Integer maxResults) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinEquals(final String joinName, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinEquals(final boolean toLowerCase, final String joinName, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinNotEquals(final String joinName, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinNotEquals(final boolean toLowerCase, final String joinName, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinGreaterThan(final String joinName, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinGreaterThan(final boolean toLowerCase, final String joinName, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinGreaterOrEqualTo(final String joinName, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinGreaterOrEqualTo(final boolean toLowerCase, final String joinName, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinLessThan(final String joinName, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinLessThan(final boolean toLowerCase, final String joinName, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinLessOrEqualTo(final String joinName, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinLessOrEqualTo(final boolean toLowerCase, final String joinName, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinBetween(final String joinName, final String attributeName, final Object valueA, final Object valueB) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinBetween(final boolean toLowerCase, final String joinName, final String attributeName, final Object valueA, final Object valueB) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinAttributeIsNull(final String joinName, final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinAttributeIsNotNull(final String joinName, final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinListIsEmpty(final String joinName, final String listName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinCollectionIsEmpty(final String joinName, final String collectionName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinCollectionIsNotEmpty(final String joinName, final String collectionName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinStringLike(final String joinName, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinStringLike(final boolean toLowerCase, final String joinName, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinSetIsEmpty(final String joinName, final String setName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinListIsNotEmpty(final String joinName, final String listName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinSetIsNotEmpty(final String joinName, final String setName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinStringNotLike(final String joinName, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinStringNotLike(final boolean toLowerCase, final String joinName, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinStringIn(final String joinName, final String attributeName, final List<String> values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinStringIn(final boolean toLowerCase, final String joinName, final String attributeName, final List<String> values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinStringNotIn(final String joinName, final String attributeName, final List<String> values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> andJoinStringNotIn(final boolean toLowerCase, final String joinName, final String attributeName, final List<String> values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> orEquals(final String attributeName, final Object... values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> orEquals(final boolean toLowerCase, final String attributeName, final Object... values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> orEquals(final int index, final String attributeName, final Object... values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> orEquals(final boolean toLowerCase, final int index, final String attributeName, final Object... values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> addAndSeparatedByOr(final int index, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> addAndSeparatedByOr(final boolean toLowerCase, final int index, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long count() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EasyCriteria<T> addHint(final String key, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
