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
package com.uaihebert.uaicriteria.base.element;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.Subquery;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BasicCriteriaElements<T> {

    private Integer maxResults;

    private Integer firstResult;

    EntityManager entityManager;

    private BaseCriteria countCriteria;

    private BaseCriteria multiselectCriteria;

    private BaseCriteria regularCriteria;

    private BaseCriteria subQueryCriteria;

    private final List<BaseCriteria> baseCriteriaList = new ArrayList<BaseCriteria>();

    public TypedQuery<T> getRegularQuery() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BaseCriteria<T> getBaseCriteriaForSubQuery() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public TypedQuery<Long> getCountQuery() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public TypedQuery<Object> getMultiSelectQuery() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void setUpHintMap(final TypedQuery typedQuery, final BaseCriteria baseCriteria) {
        final Map<String, String> createdHintMap = baseCriteria.getCreatedHintMap();
        for (final Map.Entry<String, String> entry : createdHintMap.entrySet()) {
            typedQuery.setHint(entry.getKey(), entry.getValue());
        }
    }

    private void setPagination(final TypedQuery typedQuery) {
        if (firstResult != null) {
            typedQuery.setFirstResult(firstResult);
        }
        if (maxResults != null) {
            typedQuery.setMaxResults(maxResults);
        }
    }

    public List<BaseCriteria> getBaseCriteriaList() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFirstResult(final Integer firstResult) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMaxResults(final Integer maxResults) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isBatooProvider() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Subquery getSubquery() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BaseCriteria getBaseSubCriteria() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setCountCriteria(final BaseCriteria countCriteria) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMultiSelectCriteria(final BaseCriteria multiselectCriteria) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRegularCriteria(final BaseCriteria regularCriteria) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSubQueryCriteria(final BaseCriteria subQueryCriteria) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
