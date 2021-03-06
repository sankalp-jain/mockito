/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.internal.verification;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import org.mockito.invocation.Invocation;

public class SingleRegisteredInvocation implements RegisteredInvocations, Serializable {

    private Invocation invocation;

    public void add(Invocation invocation) {
        this.invocation = invocation;
    }

    public void removeLast() {
        invocation = null;
    }

    public List<Invocation> getAll() {
        return Collections.emptyList();
    }

    public void clear() {
        invocation = null;
    }

    public boolean isEmpty() {
        return invocation == null;
    }
}
