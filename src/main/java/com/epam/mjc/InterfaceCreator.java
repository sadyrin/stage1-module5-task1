package com.epam.mjc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        Predicate<List<String>> isValuesStartWithUpperCase = new Predicate<List<String>>() {
            @Override
            public boolean test(List<String> list){

                for(String s : list){
                    char c = s.charAt(0);
                    if(c < 65 || c > 90) return false;
                }

                return true;
            }
        };

        return isValuesStartWithUpperCase;
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        Consumer<List<Integer>> addEvenValuesAtTheEnd = new Consumer<List<Integer>>() {
            @Override
            public void accept(List<Integer> list){

                // for(int i = 0; i < list.size(); i++){
                //     if(list.get(i) % 2 == 0) {
                //         list.add(list.get(i));
                //     }
                // }
            }
        };

        return addEvenValuesAtTheEnd;
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        
        Supplier<List<String>> filterCollection = new Supplier<List<String>>() {
            @Override
            public List<String> get(){
                List<String> out = new ArrayList<>();
                for(String s : values){
                    if(
                        (s.charAt(0) > 64 && s.charAt(0) < 91)
                        && (s.charAt(s.length() - 1) == 46 )
                        && (s.split(" ").length > 3 )
                    ) out.add(s);
                }

                return out;
            }
        };

        return filterCollection;
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        Function<List<String>, Map<String, Integer>> stringSize = new Function<List<String>, Map<String, Integer>>() {
            @Override
            public Map<String, Integer> apply(List<String> list){
                Map<String, Integer> map = new HashMap<>();

                for(String s : list){
                    map.put(s, s.length());
                }

                return map;
            }
        };

        return stringSize;
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> first, List<Integer> second){
                List<Integer> out = new ArrayList<>();
                out.addAll(first);
                out.addAll(second);

                return out;
            }
        };

        return concatList;
    }
}
