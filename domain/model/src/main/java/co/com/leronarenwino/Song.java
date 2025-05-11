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

public class Song extends Multimedia {

    private static final String FORMAT_SONG_LIST = "%s%s%s%s%s%s%s";

    @Getter
    private final String genre;
    private final String name;
    private final String singer;

    public Song(int number, String path, String genre, String name, String singer) {
        super(number, path);
        this.genre = genre;
        this.name = name;
        this.singer = singer;
    }

    public String pathToFileSong(String parentDirectoryPath, boolean hasMetadata) {

        return hasMetadata ? getPath() : String.format(FORMAT_SONG_LIST, parentDirectoryPath, File.separator, this.genre, File.separator, this.singer, File.separator, getPath());

    }

    @Override
    public String toString() {
        return String.format(" %05d %s %s ", getNumber(), this.singer, this.name);
    }
}