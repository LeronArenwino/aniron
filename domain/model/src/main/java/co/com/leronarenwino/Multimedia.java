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

import lombok.Getter;

import java.io.File;

@Getter
public class Multimedia {

    public static final String FORMAT_MULTIMEDIA = "%s%s%s";

    private final int number;
    private final String path;

    public Multimedia(int number, String path) {
        this.number = number;
        this.path = path;
    }

    public String pathToFileMultimedia(String parentDirectoryPath) {

        return String.format(FORMAT_MULTIMEDIA, parentDirectoryPath, File.separator, this.path);

    }

    @Override
    public String toString() {
        return String.format(" %05d %s ", this.number, this.path);
    }

}
