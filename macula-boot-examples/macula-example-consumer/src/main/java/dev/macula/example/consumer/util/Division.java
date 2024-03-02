/*
 * Copyright (c) 2024 Macula
 *   macula.dev, China
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.macula.example.consumer.util;

import lombok.Data;

/**
 * {@code Division} is 行政区划
 *
 * @author rain
 * @since 2024/2/27 15:55
 */
@Data
public class Division {
    private String divisionCode;
    private int divisionLevel;
    private String pinyin;
    private String divisionName;
    private String divisionTname;
    private String divisionId;
    private String divisionAbbName;
    private boolean isdeleted;
    private String parentId;
}
