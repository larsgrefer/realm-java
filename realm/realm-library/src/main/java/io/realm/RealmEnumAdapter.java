/*
 * Copyright 2016 Realm Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.realm;

/**
 * Created by larsgrefer on 28.11.16.
 */

public class RealmEnumAdapter<E extends Enum<E>> extends AbstractStringAdapter<E> {

    private final Class<E> enumClass;

    public RealmEnumAdapter(Class<E> enumClass) {
        this.enumClass = enumClass;
    }

    @Override
    public E get(String value) {
        return Enum.valueOf(enumClass, value);
    }

    @Override
    public String set(E value) {
        return value.name();
    }
}
