/*
 * Copyright (c) 2024. Kore Team. This project is licensed under the GPL-3.0 license.
 * You may find a copy here https://www.gnu.org/licenses/gpl-3.0.en.html
 */

package net.kore.meep.api.task;

public interface TaskSchedular {
    void registerTask(MeepTask task);
    void destroyTask(MeepTask task);
}
