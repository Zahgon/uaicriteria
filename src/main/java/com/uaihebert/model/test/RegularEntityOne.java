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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

@Entity
public class RegularEntityOne {

    @Id
    private long id;

    private String stringAttribute;

    private Long longAttributeOne;

    private Long longAttributeTwo;

    private Float floatAttributeOne;

    private Float floatAttributeTwo;

    private Integer integerAttributeOne;

    private Integer integerAttributeTwo;

    private Boolean booleanAttributeOne;

    private Boolean booleanAttributeTwo;

    @Temporal(TemporalType.DATE)
    private Calendar calendarAttributeOne;

    @Temporal(TemporalType.DATE)
    private Calendar calendarAttributeTwo;

    @Temporal(TemporalType.DATE)
    private Date dateAttributeOne;

    @Temporal(TemporalType.DATE)
    private Date dateAttributeTwo;

    private BigDecimal bigDecimalAttributeOne;

    private BigDecimal bigDecimalAttributeTwo;

    private Double doubleAttributeOne;

    private Double doubleAttributeTwo;

    @Enumerated(EnumType.STRING)
    private RegularEnum regularEnum;

    @OneToOne
    private RegularEntityTwo regularEntityTwo;

    @OneToOne
    private RegularEntityThree regularEntityThree;

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

    public Long getLongAttributeOne() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setLongAttributeOne(final Long longAttributeOne) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getLongAttributeTwo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setLongAttributeTwo(final Long longAttributeTwo) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Float getFloatAttributeOne() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFloatAttributeOne(final Float floatAttributeOne) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Float getFloatAttributeTwo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFloatAttributeTwo(final Float floatAttributeTwo) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Integer getIntegerAttributeOne() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setIntegerAttributeOne(final Integer integerAttributeOne) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Integer getIntegerAttributeTwo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setIntegerAttributeTwo(final Integer integerAttributeTwo) {
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

    public Calendar getCalendarAttributeOne() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setCalendarAttributeOne(final Calendar calendarAttributeOne) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Calendar getCalendarAttributeTwo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setCalendarAttributeTwo(final Calendar calendarAttributeTwo) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Date getDateAttributeOne() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDateAttributeOne(final Date dateAttributeOne) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Date getDateAttributeTwo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDateAttributeTwo(final Date dateAttributeTwo) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BigDecimal getBigDecimalAttributeOne() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setBigDecimalAttributeOne(final BigDecimal bigDecimalAttributeOne) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BigDecimal getBigDecimalAttributeTwo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setBigDecimalAttributeTwo(final BigDecimal bigDecimalAttributeTwo) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getDoubleAttributeOne() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDoubleAttributeOne(final Double doubleAttributeOne) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getDoubleAttributeTwo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDoubleAttributeTwo(final Double doubleAttributeTwo) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public RegularEntityTwo getRegularEntityTwo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRegularEntityTwo(final RegularEntityTwo regularEntityTwo) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public RegularEntityThree getRegularEntityThree() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRegularEntityThree(final RegularEntityThree regularEntityThree) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public RegularEntityFour getRegularEntityFour() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRegularEntityFour(final RegularEntityFour regularEntityFour) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public RegularEnum getRegularEnum() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRegularEnum(final RegularEnum regularEnum) {
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
