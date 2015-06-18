/*
 * Copyright 2015 Matthew Aguirre
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.tros.torgo.swing;

import java.util.ResourceBundle;

public class Localization {

    private static ResourceBundle resources;

    static {
        try {
            resources = ResourceBundle.getBundle("LocalizedStrings");
        } catch (Exception e) {
            org.tros.utils.logging.Logging.getLogFactory().getLogger(Localization.class).fatal(null, e);
        }
    }

    public static String getLocalizedString(String key) {
        return resources != null ? resources.getString(key) : null;
    }
}
