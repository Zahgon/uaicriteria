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

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Entity
public class Car {

    @Id
    private int id;

    @OneToOne(mappedBy = "car")
    private Person person;

    @OneToOne(cascade = CascadeType.ALL)
    private Color color;

    private String name;

    private BigDecimal weight;

    public Car() {
    }

    public Car(final int id, final String name, final Color color, final BigDecimal weight) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setName(final String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Color getColor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setColor(final Color color) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(final Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setId(final int id) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Person getPerson() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setPerson(final Person person) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BigDecimal getWeight() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setWeight(final BigDecimal weight) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
