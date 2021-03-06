/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/

package org.apache.cayenne.java8.access.types;

import java.sql.Date;
import java.time.LocalDate;

import org.apache.cayenne.access.types.ValueObjectType;

/**
 * @since 4.0
 */
public class LocalDateValueType implements ValueObjectType<LocalDate, Date> {

    @Override
    public Class<Date> getTargetType() {
        return Date.class;
    }

    @Override
    public Class<LocalDate> getValueType() {
        return LocalDate.class;
    }

    @Override
    public LocalDate toJavaObject(Date value) {
        return value.toLocalDate();
    }

    @Override
    public Date fromJavaObject(LocalDate object) {
        return Date.valueOf(object);
    }

    @Override
    public String toCacheKey(LocalDate object) {
        return object.toString();
    }
}
