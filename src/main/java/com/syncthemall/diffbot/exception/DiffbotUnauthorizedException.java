/**
 * Copyright (c) 2013 Pierre-Denis Vanduynslager, https://github.com/vanduynslagerp
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.syncthemall.diffbot.exception;

/**
 * Thrown when the authorization to use the Diffbot API is refused. This will happen either because your developer token
 * is not recognized by Diffbot or because it is revoked.
 */
public class DiffbotUnauthorizedException extends DiffbotException {

	/** Serial code version <code>serialVersionUID</code>. **/
	private static final long serialVersionUID = -605360000000284057L;

	/**
	 * Constructs a new exception with the specified detail message and cause.
	 * <p>
	 * Note that the detail message associated with {@code cause} is <i>not</i> automatically incorporated in this
	 * exception's detail message.
	 * 
	 * @param message the detail message (which is saved for later retrieval by the {@link #getMessage()} method).
	 * @param cause the cause (which is saved for later retrieval by the {@link #getCause()} method). (A <tt>null</tt>
	 *            value is permitted, and indicates that the cause is nonexistent or unknown.)
	 */
	public DiffbotUnauthorizedException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructs a new exception with the specified detail message. The cause is not initialized, and may subsequently
	 * be initialized by a call to {@link #initCause}.
	 * 
	 * @param message the detail message. The detail message is saved for later retrieval by the {@link #getMessage()}
	 *            method.
	 */
	public DiffbotUnauthorizedException(final String message) {
		super(message);
	}

}