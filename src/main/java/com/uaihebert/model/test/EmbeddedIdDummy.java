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
package com.uaihebert.model.test;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EmbeddedIdDummy implements Serializable {

    private int idInteger;

    private String idString;

    public EmbeddedIdDummy() {
    }

    public EmbeddedIdDummy(final int idInteger, final String idString) {
        this.idInteger = idInteger;
        this.idString = idString;
    }

    public int getIdInteger() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setIdInteger(final int idInteger) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getIdString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setIdString(final String idString) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(final Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
