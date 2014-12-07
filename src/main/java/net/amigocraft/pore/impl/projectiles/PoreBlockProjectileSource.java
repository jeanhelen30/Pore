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
package net.amigocraft.pore.impl.projectiles;

import net.amigocraft.pore.util.PoreWrapper;
import net.amigocraft.pore.util.converter.TypeConverter;
import org.apache.commons.lang.NotImplementedException;
import org.bukkit.block.Block;
import org.bukkit.entity.Projectile;
import org.bukkit.util.Vector;
import org.spongepowered.api.entity.projectile.source.BlockProjectileSource;

// TODO: Bridge

// TODO: Bridge

public class PoreBlockProjectileSource
        extends PoreWrapper<BlockProjectileSource> implements org.bukkit.projectiles.BlockProjectileSource {

    private static TypeConverter<BlockProjectileSource, PoreBlockProjectileSource> converter;

    @SuppressWarnings("unchecked")
    static TypeConverter<BlockProjectileSource, PoreBlockProjectileSource> getBlockProjectileSourceConverter() {
        if (converter == null) {
            converter = new TypeConverter<BlockProjectileSource, PoreBlockProjectileSource>() {
                @Override
                protected PoreBlockProjectileSource convert(BlockProjectileSource handle) {
                    return new PoreBlockProjectileSource(handle);
                }
            };
        }

        return converter;
    }

    //TODO: bridge

    protected PoreBlockProjectileSource(BlockProjectileSource handle) {
        super(handle);
    }

    @Override
    public BlockProjectileSource getHandle() {
        return (BlockProjectileSource) super.getHandle();
    }

    /**
     * Returns a Pore wrapper for the given handle.
     * If one exists, it will be retrieved; otherwise, a new wrapper instance will be created.
     *
     * @param handle The Sponge object to wrap.
     * @return A Pore wrapper for the given Sponge object.
     */
    public static PoreBlockProjectileSource of(BlockProjectileSource handle) {
        return converter.apply(handle);
    }

    @Override
    public <T extends Projectile> T launchProjectile(Class<? extends T> projectile) {
        throw new NotImplementedException();
    }

    @Override
    public <T extends Projectile> T launchProjectile(Class<? extends T> projectile, Vector velocity) {
        throw new NotImplementedException();
    }

    @Override
    public Block getBlock() {
        throw new NotImplementedException();
    }
}
