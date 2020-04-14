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
package org.apache.isis.viewer.common.model.action;

import org.apache.isis.core.metamodel.spec.ManagedObject;
import org.apache.isis.core.metamodel.spec.feature.ObjectAction;
import org.apache.isis.core.webapp.context.IsisWebAppCommonContext;

/**
 * Creates an {@link ActionUiModel}, a holder of the <em>Action's</em> meta-model 
 * and a click-able UI action component; eg. link, button, menu-items.
 * 
 * @see ActionUiModel
 * 
 * @since 2.0.0
 * @param <T> - link component type, native to the viewer
 */
public interface ActionUiModelFactory<T> {
    
    /**
     * 
     * @param commonContext
     * @param named - used when explicitly named (eg. menu bar layout file), otherwise {@code null}
     * @param actionHolder
     * @param objectAction
     * @return
     */
    ActionUiModel<T> newAction(
            IsisWebAppCommonContext commonContext, 
            String named,
            ManagedObject actionHolder,
            ObjectAction objectAction);
    
}
