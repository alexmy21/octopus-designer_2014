/* 
 * Copyright (c) 2013 Lisa Park, Inc. (www.lisa-park.net).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Lisa Park, Inc. (www.lisa-park.net) - initial API and implementation and/or initial documentation
 */
package org.lisapark.octopus;

/**
 * This is the top level checked {@link Exception} in the Octopus application. All other exception types should
 * be a subclass of this exception.
 *
 * @author dave sinclair(david.sinclair@lisa-park.com)
 */
public class OctopusException extends Exception {

    public OctopusException(Throwable cause) {
        super(cause);
    }

    public OctopusException(String message) {
        super(message);
    }

    public OctopusException(String message, Throwable cause) {
        super(message, cause);
    }
}
