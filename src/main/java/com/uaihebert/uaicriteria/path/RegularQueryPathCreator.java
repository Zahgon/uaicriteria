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
import com.uaihebert.uaicriteria.criteria.CriteriaOrType;
import com.uaihebert.uaicriteria.criteria.CriteriaResultOrderBy;
import com.uaihebert.uaicriteria.predicate.RegularQueryPredicateCreator;
import com.uaihebert.uaicriteria.subquery.SubQueryImp;
import com.uaihebert.util.ReflectionUtil;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import java.util.List;

public final class RegularQueryPathCreator extends AbstractPathCreator {

    private static final boolean FETCH_ENABLED = true;

    private static final boolean FETCH_DISABLED = false;

    private RegularQueryPathCreator() {
    }

    public static void andEquals(final boolean toLowerCase, final BaseCriteria baseCriteria, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andNotEquals(final boolean toLowerCase, final BaseCriteria baseCriteria, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void innerJoin(final String joinName, final BaseCriteria baseCriteria) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void innerJoinFetch(final String joinName, final BaseCriteria baseCriteria) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void leftJoinFetch(final String joinName, final BaseCriteria baseCriteria) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void leftJoin(final String joinName, final BaseCriteria baseCriteria) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void orderBy(final String attributeName, final BaseCriteria baseCriteria, final CriteriaResultOrderBy criteriaResultOrderBy) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andHint(final BaseCriteria baseCriteria, final String key, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void addOr(final boolean toLowerCase, final int index, final BaseCriteria baseCriteria, final String attributeName, final Object[] valueArray, final CriteriaOrType orType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static Predicate createEqualForOr(final boolean toLowerCase, final BaseCriteria baseCriteria, final Path path, final Object value, final CriteriaOrType orType) {
        if (CriteriaOrType.LIKE.equals(orType)) {
            return RegularQueryPredicateCreator.createLikePredicate(toLowerCase, baseCriteria.getCriteriaBuilder(), path, value.toString());
        }
        if (CriteriaOrType.NOT_LIKE.equals(orType)) {
            final Predicate predicate = RegularQueryPredicateCreator.createLikePredicate(toLowerCase, baseCriteria.getCriteriaBuilder(), path, value.toString());
            return predicate.not();
        }
        if (CriteriaOrType.IS_NULL.equals(orType)) {
            return RegularQueryPredicateCreator.createIsNullPredicate(baseCriteria.getCriteriaBuilder(), path);
        }
        if (CriteriaOrType.IS_NOT_NULL.equals(orType)) {
            final Predicate isNullPredicate = RegularQueryPredicateCreator.createIsNullPredicate(baseCriteria.getCriteriaBuilder(), path);
            return isNullPredicate.not();
        }
        return RegularQueryPredicateCreator.createEqualPredicate(toLowerCase, baseCriteria.getCriteriaBuilder(), path, value);
    }

    public static void addAndSeparatedByOr(final boolean toLowerCase, final int index, final BaseCriteria baseCriteria, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andIsMemberOf(final BaseCriteria baseCriteria, final String collectionName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andIsNotMemberOf(final BaseCriteria baseCriteria, final String collectionName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andBetween(final boolean toLowerCase, final BaseCriteria baseCriteria, final String attributeName, final Object valueA, final Object valueB) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andGreaterOrEqualTo(final boolean toLowerCase, final BaseCriteria baseCriteria, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andLessThan(final boolean toLowerCase, final BaseCriteria baseCriteria, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andLessOrEqualTo(final boolean toLowerCase, final BaseCriteria baseCriteria, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andGreaterThan(final boolean toLowerCase, final BaseCriteria baseCriteria, final String attributeName, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void orNotEquals(final boolean toLowerCase, final BaseCriteria baseCriteria, final String attributeName, final Object[] valueArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andIsNull(final BaseCriteria baseCriteria, final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andIsNotNull(final BaseCriteria baseCriteria, final String attributeName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andCollectionIsEmpty(final BaseCriteria baseCriteria, final String collectionName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andCollectionIsNotEmpty(final BaseCriteria baseCriteria, final String collectionName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void setDistinctTrue(final BaseCriteria baseCriteria) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andStringIn(final boolean toLowerCase, final BaseCriteria baseCriteria, final String attributeName, final List<String> valueList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andStringNotIn(final boolean toLowerCase, final BaseCriteria baseCriteria, final String attributeName, final List<String> valueList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andStringLike(final boolean toLowerCase, final BaseCriteria baseCriteria, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andStringNotLike(final boolean toLowerCase, final BaseCriteria baseCriteria, final String attributeName, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <E> void andAttributeIn(final BaseCriteria baseCriteria, final String attributeName, final List<E> attributeList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andAttributeIn(final BaseCriteria baseCriteria, final String attributeName, final SubQueryImp uaiSubQuery) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void andAttributeNotIn(final BaseCriteria baseCriteria, final String attributeName, final SubQueryImp uaiSubQuery) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <E> void andAttributeNotIn(final BaseCriteria baseCriteria, final String attributeName, final List<E> attributeList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
