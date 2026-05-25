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

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Entity
public class RegularEntityFive {

    @Id
    private long id;

    private String stringAttribute;

    private Boolean booleanAttributeOne;

    private Boolean booleanAttributeTwo;

    @ElementCollection
    private List<String> stringList;

    @ElementCollection
    private Map<String, String> stringMap;

    @OneToMany
    private List<RegularEntityOne> regularEntityOneList;

    @OneToMany
    private Set<RegularEntityTwo> regularEntityTwoSet;

    @OneToMany
    private Collection<RegularEntityThree> regularEntityThreeCollection;

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

    public List<RegularEntityOne> getRegularEntityOneList() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRegularEntityOneList(final List<RegularEntityOne> regularEntityOneList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Set<RegularEntityTwo> getRegularEntityTwoSet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRegularEntityTwoSet(final Set<RegularEntityTwo> regularEntityTwoSet) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<RegularEntityThree> getRegularEntityThreeCollection() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRegularEntityThreeCollection(final Collection<RegularEntityThree> regularEntityThreeCollection) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getStringList() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setStringList(final List<String> stringList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<String, String> getStringMap() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setStringMap(final Map<String, String> stringMap) {
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
