;The iterate function can be used to produce an infinite lazy sequence.
;(= __ (take 5 (iterate #(+ 3 %) 1)))

(def answer '(1 4 7 10 13))
(= answer (take 5 (iterate #(+ 3 %) 1)))