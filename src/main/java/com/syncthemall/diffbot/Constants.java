/**
 * The MIT License
 * Copyright (c) 2013 Pierre-Denis Vanduynslager
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
/**
 * 
 */
package com.syncthemall.diffbot;

/**
 * Constant class.
 * 
 * @author Pierre-Denis Vanduynslager <pierre.denis.vanduynslager@gmail.com>
 */
public final class Constants {

	/** User agent. Written in the header of the generated HTML. */
	public static final String USER_AGENT = "diffbot-java-sdk/1.2.2";

	/** Batch API URL */
	public static final String BATCH_URL = "http://www.diffbot.com/api/batch";

	/** HTTP return code for OK (200) */
	public static final int HTTP_OK = 200;

	/** HTTP return code for Unauthorized (401) */
	public static final int HTTP_UNAUTHORIZED = 401;

	/** HTTP method GET */
	public static final String GET = "GET";

	/** The attribute {@code batch}. */
	public static final String BATCH = "batch";

	/** The attribute {@code fields}. */
	public static final String FIELDS = "fields";

	/** The attribute {@code timeout}. */
	public static final String TIMEOUT = "timeout";

	/** The attribute {@code url}. */
	public static final String URL = "url";

	/** The attribute {@code format}. */
	public static final String FORMAT = "format";

	/** The attribute {@code token}. */
	public static final String TOKEN = "token";

	/** The attribute {@code mode}. */
	public static final String MODE = "mode";

	/** The attribute {@code stats}. */
	public static final String STATS = "stats";

	/** The attribute {@code error}. */
	public static final String ERROR = "error";

	private Constants() {
		super();
	}

}
