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
package com.uaihebert.uaicriteria.wrapper;

import javax.persistence.criteria.Fetch;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

public class JoinWrapper<T> {

    private Root<T> root;

    private Join join;

    private Fetch joinFetch;

    private JoinWrapper(final Join join) {
        this.join = join;
    }

    private JoinWrapper(final Fetch joinFetch) {
        this.joinFetch = joinFetch;
    }

    public JoinWrapper(final Root<T> root) {
        this.root = root;
    }

    public void createJoinInRoot(final String joinName, final JoinType joinType, final boolean isFetch) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public JoinWrapper createJoinFromJoin(final String joinName, final JoinType joinType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Path getPath(final String requiredPath) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
