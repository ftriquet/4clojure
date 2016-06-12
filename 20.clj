;(= (__ (list 1 2 3 4 5)) 4)
;(= (__ ["a" "b" "c"]) "b")
;(= (__ [[1 2] [3 4]]) [1 2])

(def answer
  (fn [coll]
    (last (drop-last 1 coll))))


(println (= (answer (list 1 2 3 4 5)) 4))
(println (= (answer ["a" "b" "c"]) "b"))
(println (= (answer [[1 2] [3 4]]) [1 2]))
