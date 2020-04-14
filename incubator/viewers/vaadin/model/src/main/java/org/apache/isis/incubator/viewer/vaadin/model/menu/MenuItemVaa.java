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
package org.apache.isis.incubator.viewer.vaadin.model.menu;

import com.vaadin.flow.component.Component;

import org.apache.isis.viewer.common.model.menuitem.MenuItemUiModel;

import lombok.val;

/**
 * @since 2.0.0
 */
//@Log4j2
public class MenuItemVaa 
extends MenuItemUiModel<Component, MenuItemVaa> {

    public static MenuItemVaa newMenuItem(final String label) {
        return new MenuItemVaa(label);
    }

    private MenuItemVaa(final String label) {
        super(label);
    }
    
    @Override
    protected MenuItemVaa newSubMenuItem(final String label) {
        val subMenuItem = newMenuItem(label);
        subMenuItem.setParent(this);
        return subMenuItem;
    }

}
