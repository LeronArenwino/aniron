/*
 * This file is part of Aniron.
 *
 * Aniron is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Aniron is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Aniron. If not, see <https://www.gnu.org/licenses/>.
 */

package co.com.leronarenwino;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import static co.com.leronarenwino.SettingsSingleton.PATH_TO_SETTINGS;
import static co.com.leronarenwino.SettingsSingleton.defaultSettingsProperties;


/** This class
 * @author Francisco Dueñas
 */
public class PropertiesManager {

    // Create a Logger
    private static final Logger logger
            = Logger.getLogger(
            PropertiesManager.class.getName());

    private PropertiesManager(){throw new IllegalStateException("Utility class");
    }

    public static Properties loadProperties() {

        Properties properties = new Properties();

        try {

            if (!new File(PATH_TO_SETTINGS).exists()) {
                saveProperties(defaultSettingsProperties());
            }

            FileReader reader = new FileReader(PATH_TO_SETTINGS);

            properties.load(reader);


        } catch (IOException e) {
            logger.log(Level.WARNING, "Reader error in PropertiesManager class");
        }

        return properties;

    }

    public static void saveProperties(Properties properties) {

        try {
            properties.store(new FileWriter(PATH_TO_SETTINGS), "Namarie - settings");
        } catch (IOException e) {
            logger.log(Level.WARNING, "Properties store error in PropertiesManager class");
        }

    }

}