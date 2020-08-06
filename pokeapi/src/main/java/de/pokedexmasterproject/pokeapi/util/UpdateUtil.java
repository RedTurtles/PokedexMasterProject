package de.pokedexmasterproject.pokeapi.util;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class UpdateUtil {

    public <T> void updateProperty(Supplier<T> update, Supplier<T> current, Consumer<T> updateFunction) {
        T updateValue = update.get();
        if (updateValue == null) {
            return;
        }
        if (Objects.equals(updateValue, current.get())) {
            return;

        }
        updateFunction.accept(updateValue);
    }
}
