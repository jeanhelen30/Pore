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
package net.amigocraft.pore.impl.entity;

import net.amigocraft.pore.util.converter.TypeConverter;
import org.apache.commons.lang.NotImplementedException;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.EnderDragonPart;
import org.bukkit.entity.Entity;

public class PoreEnderDragonPart extends PoreComplexEntityPart implements EnderDragonPart {

    private static TypeConverter<org.spongepowered.api.entity.living.complex.EnderDragonPart,
            PoreEnderDragonPart>
            converter;

    @SuppressWarnings("unchecked")
    static TypeConverter<org.spongepowered.api.entity.living.complex.EnderDragonPart, PoreEnderDragonPart>
    getEnderDragonPartConverter() {
        if (converter == null) {
            converter =
                    new TypeConverter<org.spongepowered.api.entity.living.complex.EnderDragonPart,
                            PoreEnderDragonPart>() {
                        @Override
                        protected PoreEnderDragonPart convert(
                                org.spongepowered.api.entity.living.complex.EnderDragonPart handle) {
                            return new PoreEnderDragonPart(handle);
                        }
                    };
        }
        return converter;
    }

    protected PoreEnderDragonPart(org.spongepowered.api.entity.living.complex.EnderDragonPart handle) {
        super(handle);
    }

    @Override
    public org.spongepowered.api.entity.living.complex.EnderDragonPart getHandle() {
        return (org.spongepowered.api.entity.living.complex.EnderDragonPart) super.getHandle();
    }

    /**
     * Returns a Pore wrapper for the given handle.
     * If one exists, it will be retrieved; otherwise, a new wrapper instance will be created.
     *
     * @param handle The Sponge object to wrap.
     * @return A Pore wrapper for the given Sponge object.
     */
    public static PoreEnderDragonPart of(org.spongepowered.api.entity.living.complex.EnderDragonPart handle) {
        return converter.apply(handle);
    }

    public EnderDragon getParent() {
        return PoreEnderDragon.of(getHandle().getParent());
    }

    @Override
    public void damage(double amount) {
        getParent().damage(amount);
    }

    @Override
    public void _INVALID_damage(int amount) {
        this.damage((double) amount);
    }

    @Override
    public void damage(double amount, Entity source) {
        getParent().damage(amount, source);
    }

    @Override
    public void _INVALID_damage(int amount, Entity source) {
        this.damage((double) amount, source);
    }

    @Override
    public double getHealth() {
        return getParent().getHealth();
    }

    @Override
    public int _INVALID_getHealth() {
        return (int) getHealth();
    }

    @Override
    public void setHealth(double health) {
        getParent().setHealth(health);
    }

    @Override
    public void _INVALID_setHealth(int health) {
        this.setHealth((double) health);
    }

    @Override
    public double getMaxHealth() {
        throw new NotImplementedException();
    }

    @Override
    public int _INVALID_getMaxHealth() {
        return (int) this.getMaxHealth();
    }

    @Override
    public void setMaxHealth(double health) {
        getParent().setMaxHealth(health);
    }

    @Override
    public void _INVALID_setMaxHealth(int health) {
        this.setMaxHealth((double) health);
    }

    @Override
    public void resetMaxHealth() {
        getParent().resetMaxHealth();
    }
}
