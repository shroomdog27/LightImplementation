/*
 * Modified MIT License (MIT)
 *
 * Copyright (c) 2015 shroomdog27
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, and sublicense
 * the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.sweetiebelle.lightimplementation.command;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.sweetiebelle.lightimplementation.API;

public class DebugCommand {

    public boolean execute(CommandSender sender) {
        if (!API.API.checkPermissions(sender)) {
            sender.sendMessage(API.NO_PERMISSION);
            return true;
        }
        if (API.API.hasDebugger(sender)) {
            API.API.removeDebugger(sender);
            sender.sendMessage(ChatColor.GREEN + "Removed from debug.");
            return true;
        }
        API.API.addDebugger(sender);
        sender.sendMessage(ChatColor.GREEN + "Added to debug.");
        return true;
    }
}
