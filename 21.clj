;(= (__ '(4 5 6 7) 2) 6)
;(= (__ [:a :b :c] 0) :a)
;(= (__ [1 2 3 4] 1) 2)
;(= (__ '([1 2] [3 4] [5 6]) 2) [5 6])

(def answer
  (fn [coll n]
  (loop [i  n
         c  coll]
    (if (= 0 i) (first c) (recur (dec i) (rest c))))))

(println (= (answer '(4 5 6 7) 2) 6))
(println (= (answer [:a :b :c] 0) :a))
(println (= (answer [1 2 3 4] 1) 2))
(println (= (answer '([1 2] [3 4] [5 6]) 2) [5 6]))
