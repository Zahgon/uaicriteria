/*
 * Copyright 2012 uaiHebert Solucoes em Informatica
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
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
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@NamedQuery(name = Address.FIND_ALL, query = "select a from Address a")
public class Address {

    public static final String FIND_ALL = "Address.FindAll";

    @Id
    private int id;

    private String streetName;

    private long houseNumber;

    private boolean isOld;

    private boolean isYellow;

    @Temporal(TemporalType.DATE)
    private Date buildingDate;

    public Address() {
    }

    public Address(final int id, final String streetName, final int houseNumber, final boolean isOld, final boolean isYellow, final Date buildingDate) {
        this.id = id;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.isOld = isOld;
        this.isYellow = isYellow;
        this.buildingDate = buildingDate;
    }

    public int getId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setId(final int id) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getStreetName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setStreetName(final String streetName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public long getHouseNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setHouseNumber(final long houseNumber) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isOld() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setOld(final boolean isOld) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isYellow() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setYellow(final boolean isYellow) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Date getBuildingDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setBuildingDate(final Date buildingDate) {
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
}
