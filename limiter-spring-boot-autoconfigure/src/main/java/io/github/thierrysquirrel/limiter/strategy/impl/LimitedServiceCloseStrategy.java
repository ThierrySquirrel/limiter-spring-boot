/**
 * Copyright 2020 the original author or authors.
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
package io.github.thierrysquirrel.limiter.strategy.impl;

import io.github.thierrysquirrel.limiter.annotation.LimitedService;
import io.github.thierrysquirrel.limiter.core.error.LimitException;
import io.github.thierrysquirrel.limiter.core.factory.LimitedServiceFactory;
import io.github.thierrysquirrel.limiter.core.factory.ServiceDomainFactory;
import io.github.thierrysquirrel.limiter.strategy.LimitedServiceStrategy;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.context.ApplicationContext;

/**
 * ClassName: LimitedServiceCloseStrategy 
 * Description: 
 * date: 2020/6/18 17:12
 *
 * @author ThierrySquirrel
 * @since JDK 1.8
 */
public class LimitedServiceCloseStrategy implements LimitedServiceStrategy {
    @Override
    public Object limitedService(ApplicationContext applicationContext, ProceedingJoinPoint point, LimitedService limitedService, String methodString, Class<?>[] parameterTypes, Object[] parameter) throws LimitException {
        ServiceDomainFactory.resetCount (methodString);
        return LimitedServiceFactory.fallback (applicationContext, limitedService, parameterTypes, parameter);
    }
}
