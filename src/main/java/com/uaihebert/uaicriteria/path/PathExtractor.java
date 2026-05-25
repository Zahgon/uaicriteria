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

import com.uaihebert.model.EntityPathHelper;
import com.uaihebert.uaicriteria.base.element.BaseCriteria;
import com.uaihebert.uaicriteria.wrapper.JoinWrapper;
import javax.persistence.criteria.Path;

public final class PathExtractor {

    private static final int ID_IN_ROOT_CLASS = 2;

    private PathExtractor() {
    }

    public static Path extractPathWithJoin(final BaseCriteria baseCriteria, final String[] pathArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Path extractIdPath(final BaseCriteria baseCriteria, final String[] pathArray) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static Path extractPathFromPath(final Path embeddedId, final String embeddedIdAttributeName) {
        return embeddedId.get(embeddedIdAttributeName);
    }
}
