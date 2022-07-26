/*******************************************************************************
 * Copyright (c) 2004, 2008 Tasktop Technologies and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *     Tasktop Technologies - initial API and implementation
 *******************************************************************************/

package org.eclipse.mylyn.commons.net;

/**
 * Indicates that the request is not supported.
 * 
 * @author Steffen Pingel
 * @since 3.0
 */
public class UnsupportedRequestException extends Exception {

	private static final long serialVersionUID = 1L;

	public UnsupportedRequestException() {
	}

	public UnsupportedRequestException(String message) {
		super(message);
	}

	public UnsupportedRequestException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnsupportedRequestException(Throwable cause) {
		super(cause);
	}

}
/**
 * Copyright (c) 2002-2013 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.server.plugins;

import org.neo4j.kernel.GraphDatabaseAPI;
import org.neo4j.server.rest.repr.BadInputException;

class CharacterTypeCaster extends TypeCaster
{
    @Override
    Object get( GraphDatabaseAPI graphDb, ParameterList parameters, String name ) throws BadInputException
    {
        return parameters.getCharacter( name );
    }

    @Override
    Object[] getList( GraphDatabaseAPI graphDb, ParameterList parameters, String name ) throws BadInputException
    {
        return parameters.getCharacterList( name );
    }

    @Override
    @SuppressWarnings( "boxing" )
    char[] convert( Object[] data ) throws BadInputException
    {
        Character[] incoming = (Character[]) data;
        char[] result = new char[incoming.length];
        for ( int i = 0; i < result.length; i++ )
        {
            result[i] = incoming[i];
        }
        return result;
    }
}
