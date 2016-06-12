;Write a function which returns the sum of a sequence of numbers.
;(= (__ [1 2 3]) 6)
;(= (__ (list 0 -2 5 5)) 8)
;(= (__ #{4 2 1}) 7)
;(= (__ '(0 0 -1)) -1)
;(= (__ '(1 10 3)) 14)


(def answer (partial apply +))
(println (= (answer [1 2 3]) 6))
(println (= (answer (list 0 -2 5 5)) 8))
(println (= (answer #{4 2 1}) 7))
(println (= (answer '(0 0 -1)) -1))
(println (= (answer '(1 10 3)) 14))
