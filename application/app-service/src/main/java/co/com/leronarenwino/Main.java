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

import co.com.leronarenwino.mainwindow.MainWindow;

import javax.swing.*;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {

        // Look and feel to mainWindow
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException |
                 IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Create and display the form
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new MainWindow().setVisible(true);
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalArgumentException(e);
            }
        });

    }
}