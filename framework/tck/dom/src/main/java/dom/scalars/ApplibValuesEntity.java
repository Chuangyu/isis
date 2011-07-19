/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package dom.scalars;

import org.apache.isis.applib.AbstractDomainObject;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Optional;
import org.apache.isis.applib.value.*;

public class ApplibValuesEntity extends AbstractDomainObject {


    // {{ ColorProperty
    private Color colorProperty;

    @Optional
    @MemberOrder(sequence = "1")
    public Color getColorProperty() {
        return colorProperty;
    }

    public void setColorProperty(final Color colorProperty) {
        this.colorProperty = colorProperty;
    }
    // }}
    
    // {{ DateProperty
    private Date dateProperty;

    @Optional
    @MemberOrder(sequence = "1")
    public Date getDateProperty() {
        return dateProperty;
    }

    public void setDateProperty(final Date dateProperty) {
        this.dateProperty = dateProperty;
    }
    // }}


    // {{ DateTimeProperty
    private DateTime dateTimeProperty;

    @Optional
    @MemberOrder(sequence = "1")
    public DateTime getDateTimeProperty() {
        return dateTimeProperty;
    }

    public void setDateTimeProperty(final DateTime dateTimeProperty) {
        this.dateTimeProperty = dateTimeProperty;
    }
    // }}


    // {{ ImageProperty
    private Image imageProperty;

    @Optional
    @MemberOrder(sequence = "1")
    public Image getImageProperty() {
        return imageProperty;
    }

    public void setImageProperty(final Image imageProperty) {
        this.imageProperty = imageProperty;
    }
    // }}


    // {{ MoneyProperty
    private Money moneyProperty;

    @Optional
    @MemberOrder(sequence = "1")
    public Money getMoneyProperty() {
        return moneyProperty;
    }

    public void setMoneyProperty(final Money moneyProperty) {
        this.moneyProperty = moneyProperty;
    }
    // }}


    // {{ PasswordProperty
    private Password passwordProperty;

    @Optional
    @MemberOrder(sequence = "1")
    public Password getPasswordProperty() {
        return passwordProperty;
    }

    public void setPasswordProperty(final Password passwordProperty) {
        this.passwordProperty = passwordProperty;
    }
    // }}

    
    // {{ PercentageProperty
    private Percentage percentageProperty;

    @Optional
    @MemberOrder(sequence = "1")
    public Percentage getPercentageProperty() {
        return percentageProperty;
    }

    public void setPercentageProperty(final Percentage percentageProperty) {
        this.percentageProperty = percentageProperty;
    }
    // }}



    // {{ TimeProperty
    private Time timeProperty;

    @Optional
    @MemberOrder(sequence = "1")
    public Time getTimeProperty() {
        return timeProperty;
    }

    public void setTimeProperty(final Time timeProperty) {
        this.timeProperty = timeProperty;
    }
    // }}


    // {{ TimeStampProperty
    private TimeStamp timeStampProperty;

    @Optional
    @MemberOrder(sequence = "1")
    public TimeStamp getTimeStampProperty() {
        return timeStampProperty;
    }

    public void setTimestampProperty(final TimeStamp timestampProperty) {
        this.timeStampProperty = timestampProperty;
    }
    // }}
    
}
