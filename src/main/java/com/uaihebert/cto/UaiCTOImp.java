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
package com.uaihebert.cto;

import com.uaihebert.uaicriteria.UaiCriteria;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class UaiCTOImp<T> implements UaiCriteria<T> {

    private static final boolean DO_NOT_APPLY_LOWER_CASE = false;

    private static final boolean ORDER_BY_ASC = false;

    private static final boolean ORDER_BY_DESC = true;

    boolean distinct;

    private Integer firstResult;

    private Integer maxResults;

    final List<JoinHolder> joinList;

    final List<OrderByHolder> orderByList;

    final List<CriteriaConditionHolder> criteriaConditionTypeList;

    final List<String> groupByList = new ArrayList<String>();

    final List<String> multiselectAttributeList = new ArrayList<String>();

    public UaiCTOImp() {
        orderByList = new ArrayList<OrderByHolder>();
        criteriaConditionTypeList = new ArrayList<CriteriaConditionHolder>();
        joinList = new ArrayList<JoinHolder>();
    }

    public UaiCTOImp(final boolean distinct, final List<OrderByHolder> orderByList, final List<CriteriaConditionHolder> criteriaConditionTypeList, final List<JoinHolder> joinList) {
        this.distinct = distinct;
        this.orderByList = orderByList;
        this.criteriaConditionTypeList = criteriaConditionTypeList;
        this.joinList = joinList;
    }

    public List<T> getResultList() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private IllegalStateException resultQueryNotAllowedOnCTO() {
        return new IllegalStateException("Hello, I am a Criteria Transfer Object (CTO) Only. I do not have an entity manager do run the query. \n" + " To use a CTO correctly there is an other method in the UaiCriteriaFactory: \n" + " UaiCriteriaFactory.createQueryCriteria(EntityManager , Class<T>, UaiCriteria)" + " The last parameter is where you should pass the CTO");
    }

    public T getSingleResult() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List getMultiSelectResult() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long count() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long countRegularCriteria() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <E> UaiCriteria<E> subQuery(final String subQueryResult, final Class<E> entityClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private IllegalStateException subQueryNotAllowed() {
        return new IllegalStateException("Hello, sub query is not allowed in CTO [YET]. If you need you this function, please talk with us in the site uaicriteria.com");
    }

    public UaiCriteria<T> countAttribute(final String... attributeNameArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andEquals(final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andEquals(final boolean toLowerCase, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> orEquals(final String attributeName, final Object... valueArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> orStringLike(final String attributeName, final String... stringArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> orStringLike(final boolean toLowerCase, final String attributeName, final String... stringArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> orStringNotLike(final String attributeName, final String... stringArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> orStringNotLike(final boolean toLowerCase, final String attributeName, final String... stringArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> andIsMemberOf(final Object value, final String collectionName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> andIsNotMemberOf(final Object value, final String collectionName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> orEquals(final boolean toLowerCase, final String attributeName, final String... valueArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> orEquals(final int index, final String attributeName, final Object... valueArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> orEquals(final boolean toLowerCase, final int index, final String attributeName, final String... valueArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andNotEquals(final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andNotEquals(final boolean toLowerCase, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> orNotEquals(final String attributeName, final Object... valueArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> orNotEquals(final boolean toLowerCase, final String attributeName, final String... valueArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andGreaterThan(final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andGreaterThan(final boolean toLowerCase, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andGreaterOrEqualTo(final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andGreaterOrEqualTo(final boolean toLowerCase, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andLessThan(final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andLessThan(final boolean toLowerCase, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andLessOrEqualTo(final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andLessOrEqualTo(final boolean toLowerCase, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> innerJoin(final String joinName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> leftJoin(final String joinName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> innerJoinFetch(final String joinName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> leftJoinFetch(final String joinName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> setDistinctTrue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andBetween(final String attributeName, final Object valueA, final Object valueB) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andBetween(final boolean toLowerCase, final String attributeName, final String valueA, final String valueB) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andIsNull(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> orIsNull(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> orIsNotNull(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andIsNotNull(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andCollectionIsEmpty(final String collectionName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andCollectionIsNotEmpty(final String collectionName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andStringLike(final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andStringLike(final boolean toLowerCase, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andStringNotLike(final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <E> UaiCriteria<T> andAttributeIn(final String attributeName, final List<E> attributeList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <E> UaiCriteria<T> andAttributeIn(final String attributeName, final UaiCriteria<E> uaiSubQuery) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <E> UaiCriteria<T> andAttributeNotIn(final String attributeName, final List<E> attributeList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <E> UaiCriteria<T> andAttributeNotIn(final String attributeName, final UaiCriteria<E> uaiSubQuery) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andStringNotLike(final boolean toLowerCase, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andStringIn(final String attributeName, final List<String> valueList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andStringIn(final boolean toLowerCase, final String attributeName, final List<String> valueList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andStringNotIn(final String attributeName, final List<String> valueList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> andStringNotIn(final boolean toLowerCase, final String attributeName, final List<String> valueList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> orderByAsc(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> orderByDesc(final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> setFirstResult(final Integer firstResult) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> setMaxResults(final Integer maxResults) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> addAndSeparatedByOr(final int index, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> addAndSeparatedByOr(final boolean toLowerCase, final int index, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UaiCriteria<T> addHint(final String key, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public UaiCriteria<T> sum(final String... attributeNameArray) {
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

    Integer getFirstResult() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Integer getMaxResults() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
