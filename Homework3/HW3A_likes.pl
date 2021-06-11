% Some simple test Prolog programs
% --------------------------------

% Knowledge bases

loves(vincent, mia).
loves(marcellus, mia).
loves(pumpkin, honey_bunny).
loves(honey_bunny, pumpkin).
likes(dan,sally).
likes(sally,dan).
likes(josh,brittney).

jealous(X, Y) :-
    loves(X, Z),
    loves(Y, Z).

dating(X,Y) :-
    likes(X, Y),
    likes(Y, X).

friendship(X,Y) :-
    likes(X, Y).
    
friendship(X,Y) :-    
    likes(Y, X).
    
/** <examples>

?- loves(X, mia).
?- jealous(X, Y).
?-dating(sally,dan).
?-friendship(josh,brittney).
*/

