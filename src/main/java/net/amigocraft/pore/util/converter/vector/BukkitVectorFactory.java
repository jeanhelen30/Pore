/*
 * Pore
 * Copyright (c) 2014, Maxim Roncacé <http://bitbucket.org/mproncace>
 * Copyright (c) 2014, Lapis <https://github.com/LapisBlue>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.amigocraft.pore.util.converter.vector;

import org.bukkit.util.Vector;
import org.spongepowered.api.math.Vector3d;
import org.spongepowered.api.math.Vector3f;
import org.spongepowered.api.math.Vector3i;

public class BukkitVectorFactory {

    public static Vector fromVector3i(Vector3i vector) {
        return new Vector(vector.getX(), vector.getY(), vector.getZ());
    }

    public static Vector fromVector3d(Vector3d vector) {
        return new Vector(vector.getX(), vector.getY(), vector.getZ());
    }

    public static Vector fromVector3f(Vector3f vector) {
        return new Vector(vector.getX(), vector.getY(), vector.getZ());
    }

}
