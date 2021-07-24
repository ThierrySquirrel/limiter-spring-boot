/**
 * Copyright 2019 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.thierrysquirrel.limiter.core.error;


/**
 * ClassName: LimitException
 * Description:
 * date: 2019/7/18 10:35
 *
 * @author ThierrySquirrel
 * @since JDK 1.8
 */
public class LimitException extends Exception {
	public LimitException(String message) {
		super(message);
	}

	public LimitException(Throwable cause) {
		super(cause);
	}

	public LimitException(String message, Throwable cause) {
		super(message, cause);
	}
}
