% Some simple test Prolog programs
% --------------------------------

/*weather(City, Season, Temp) */
weather(phoenix,hot,summer).
weather(la,warm,summer).
weather(boston,cold,winter).
weather(dallas,mild,winter).

colder_than(C1,C2) :-
    weather(C1,cold, winter),
    weather(C2,mild, winter),
    write(C1), 
    write(' is colder than '), 
    write(C2), nl.

warmer_than(C1,C2) :-
    weather(C1,hot, summer),
    weather(C2,warm, summer),
    write(C1), 
    write(' is warmer than '), 
    write(C2), nl.

/*Examples
 ?-warmer_than(phoenix,la).
 ?-colder_than(boston,dallas).
 ?-colder_than(boston,atlanta).
 */