/*
 * Copyright © 2015 Mahesh govind and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.example.consumer;

import org.opendaylight.controller.sal.binding.api.BindingAwareBroker;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ConsumerContext;
import org.opendaylight.controller.sal.binding.api.BindingAwareConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleConsumer implements BindingAwareConsumer, AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(ExampleConsumer.class);


    @Override
    public void close() throws Exception {
        LOG.info("ExampleConsumer Closed");
    }

    @Override
    public void onSessionInitialized(ConsumerContext consumerContext) {
        System.out.println("ExampleConsumer Inited");

    }
}
