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
package com.uaihebert.uaicriteria.subquery;

import com.uaihebert.uaicriteria.UaiCriteria;
import com.uaihebert.uaicriteria.UaiCriteriaImp;
import com.uaihebert.uaicriteria.base.element.BasicCriteriaElements;
import javax.persistence.criteria.Subquery;
import java.util.List;

public class SubQueryImp<T> extends UaiCriteriaImp<T> implements UaiCriteria<T> {

    public SubQueryImp(final String selectedAttribute, final Class<T> subQueryClass, final BasicCriteriaElements basicCriteriaElements) {
        super(selectedAttribute, subQueryClass, basicCriteriaElements);
    }

    @Override
    public List<T> getResultList() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private IllegalStateException getResultNoAllowed() {
        return new IllegalStateException("Hello, I am a SubQuery. I do not have an entity manager do run the query. \n" + " To get the result of your query you should use the method of the root UaiCriteria, the one you used to create the SubQuery.");
    }

    @Override
    public T getSingleResult() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List getMultiSelectResult() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <E> UaiCriteria<E> subQuery(final String subQueryResult, final Class<E> entityClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private IllegalStateException nestedSubQueryNotAllowed() {
        return new IllegalStateException("Hello, I am a SubQuery. Right now is not possible to do sub-sub-query. \n" + getGetInTouchMessage());
    }

    private String getGetInTouchMessage() {
        return " Get in touch with the development team (uaicriteria.com) asking for this feature. ";
    }

    @Override
    public Long count() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Long countRegularCriteria() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> countAttribute(final String... attributeNameArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> innerJoinFetch(final String joinName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> leftJoinFetch(final String joinName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> orderByAsc(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> orderByDesc(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> setFirstResult(final Integer firstResult) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> setMaxResults(final Integer maxResults) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> addHint(final String key, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> sum(final String... attributeNameArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private UaiCriteria<T> multiselectNotAvailable() {
        throw new IllegalStateException("Hello, I am a SubQuery. Right now is not possible to do multiselect actions in a SubQuery. \n" + getGetInTouchMessage());
    }

    @Override
    public <E> UaiCriteria<T> andAttributeIn(final String attributeName, final UaiCriteria<E> uaiSubQuery) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <E> UaiCriteria<T> andAttributeNotIn(final String attributeName, final UaiCriteria<E> uaiSubQuery) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <N extends Number> UaiCriteria<T> sum(final String attributeName, final N number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <N extends Number> UaiCriteria<T> sum(final N number, final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> diff(final String firstAttribute, final String secondAttribute) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <N extends Number> UaiCriteria<T> diff(final String attributeName, final N number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <N extends Number> UaiCriteria<T> diff(final N number, final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> multiply(final String firstAttribute, final String secondAttribute) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <N extends Number> UaiCriteria<T> multiply(final String attributeName, final N number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <N extends Number> UaiCriteria<T> multiply(final N number, final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> divide(final String firstAttribute, final String secondAttribute) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <N extends Number> UaiCriteria<T> divide(final String attributeName, final N number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <N extends Number> UaiCriteria<T> divide(final N number, final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> module(final String firstAttribute, final String secondAttribute) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> module(final String attributeName, final Integer number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> module(final Integer number, final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> average(final String... attributeNameArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> square(final String... attributeNameArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> addMultiSelectAttribute(final String... attributeNameArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> groupBy(final String... attributeNameArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Subquery getSubQuery() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void prepareSubQuery() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
