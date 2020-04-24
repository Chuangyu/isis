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
package org.apache.isis.incubator.viewer.vaadin.ui.components.clob;

import com.vaadin.flow.component.Component;

import org.springframework.core.annotation.Order;

import org.apache.isis.applib.annotation.OrderPrecedence;
import org.apache.isis.applib.value.Clob;
import org.apache.isis.core.metamodel.facets.value.clobs.ClobValueFacet;
import org.apache.isis.incubator.viewer.vaadin.ui.components.UiComponentHandlerVaa;
import org.apache.isis.viewer.common.model.binding.UiComponentFactory.Request;

import lombok.val;

@org.springframework.stereotype.Component
@Order(OrderPrecedence.MIDPOINT)
public class ClobFieldFactory implements UiComponentHandlerVaa {

    @Override
    public boolean isHandling(Request request) {
        return request.hasFeatureFacet(ClobValueFacet.class);
    }

    @Override
    public Component handle(Request request) {
        val uiField = new ClobField(request.getFeatureLabel());
        uiField.setValue(request.getPojo(Clob.class).orElse(null));
        return uiField;
    }
    
}
