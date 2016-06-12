;(= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))

(def answer [:b 2])
(= {:a 1, :b 2, :c 3} (conj {:a 1} answer [:c 3]))
