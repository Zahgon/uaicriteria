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

import com.uaihebert.uaicriteria.UaiCriteriaImp;

public enum CriteriaConditionType {

    EQUAL {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    NOT_EQUAL {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    OR_EQUAL {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    OR_LIKE {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    OR_NOT_LIKE {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    OR_NOT_EQUAL {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    GREATER_THAN {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    LESS_THAN {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    GREATER_OR_EQUAL_TO {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    LESS_OR_EQUAL_TO {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    BETWEEN {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    AND_ATTRIBUTE_IN {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    AND_ATTRIBUTE_NOT_IN {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    AND_IS_NULL {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    AND_IS_NOT_NULL {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    OR_IS_NULL {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    OR_IS_NOT_NULL {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    STRING_IN {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    STRING_NOT_IN {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    STRING_LIKE {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    STRING_NOT_LIKE {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    COLLECTION_IS_EMPTY {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    COLLECTION_IS_NOT_EMPTY {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    AND_SEPARATED_BY_OR {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    IS_MEMBER_OF {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    IS_NOT_MEMBER_OF {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    HINT {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    AVG {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    DIFF_ATTRIBUTE_ONLY {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    DIFF_ATTRIBUTE_WITH_NUMBER {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    DIFF_NUMBER_WITH_ATTRIBUTE {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    DIV_ATTRIBUTE_ONLY {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    DIV_ATTRIBUTE_WITH_NUMBER {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    DIV_NUMBER_WITH_ATTRIBUTE {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    MODULE_ATTRIBUTE_ONLY {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    MODULE_ATTRIBUTE_WITH_NUMBER {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    MODULE_NUMBER_WITH_ATTRIBUTE {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    MULTIPLY_ATTRIBUTE_ONLY {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    MULTIPLY_ATTRIBUTE_WITH_NUMBER {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    MULTIPLY_NUMBER_WITH_ATTRIBUTE {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    SUM_ATTRIBUTE_WITH_NUMBER {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    SUM_ATTRIBUTE_ONLY {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    SUM_NUMBER_WITH_ATTRIBUTE {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    COUNT_ATTRIBUTE {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    SQUARE {

        @Override
        public <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ;

    public abstract <T> void createCondition(final CriteriaConditionHolder holder, final UaiCriteriaImp<T> uaiCriteria);
}
