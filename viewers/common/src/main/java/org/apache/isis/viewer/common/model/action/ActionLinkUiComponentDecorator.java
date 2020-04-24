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

import org.apache.isis.viewer.common.model.decorator.confirm.ConfirmDecorator;
import org.apache.isis.viewer.common.model.decorator.disable.DisableDecorator;
import org.apache.isis.viewer.common.model.decorator.fa.FontAwesomeDecorator;
import org.apache.isis.viewer.common.model.decorator.prototyping.PrototypingDecorator;
import org.apache.isis.viewer.common.model.decorator.tooltip.TooltipDecorator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Decorates a click-able UI component of type {@code <T>} based on an {@link ActionUiModel}.
 * 
 * @see ActionUiModel
 * 
 * @since 2.0.0
 * @param <T> - link component type, native to the viewer
 */
@Getter
@RequiredArgsConstructor
public class ActionLinkUiComponentDecorator<T> {
    
    private final TooltipDecorator<T> tooltipDecorator;
    private final DisableDecorator<T> disableDecorator;
    private final ConfirmDecorator<T> confirmDecorator;
    private final PrototypingDecorator<T> prototypingDecorator;
    private final FontAwesomeDecorator<T> iconDecorator;



}
