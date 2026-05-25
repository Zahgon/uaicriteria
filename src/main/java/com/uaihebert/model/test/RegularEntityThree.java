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
package com.uaihebert.model.test;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class RegularEntityThree {

    @Id
    private long id;

    private String stringAttribute;

    private Boolean booleanAttributeOne;

    private Boolean booleanAttributeTwo;

    @OneToOne(mappedBy = "regularEntityThree")
    private RegularEntityOne regularEntityOne;

    @OneToOne(mappedBy = "regularEntityThree")
    private RegularEntityTwo regularEntityTwo;

    @OneToOne
    private RegularEntityFour regularEntityFour;

    public long getId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setId(final long id) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getStringAttribute() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setStringAttribute(final String stringAttribute) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Boolean getBooleanAttributeOne() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setBooleanAttributeOne(final Boolean booleanAttributeOne) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Boolean getBooleanAttributeTwo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setBooleanAttributeTwo(final Boolean booleanAttributeTwo) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public RegularEntityOne getRegularEntityOne() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRegularEntityOne(final RegularEntityOne regularEntityOne) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public RegularEntityTwo getRegularEntityTwo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRegularEntityTwo(final RegularEntityTwo regularEntityTwo) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public RegularEntityFour getRegularEntityFour() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRegularEntityFour(final RegularEntityFour regularEntityFour) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
