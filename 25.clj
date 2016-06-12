;Write a function which returns only the odd numbers from a sequence.
;(= (__ #{1 2 3 4 5}) '(1 3 5))
;(= (__ #{1 2 3 4 5}) '(1 3 5))
;(= (__ [2 2 4 6]) '())
;(= (__ [1 1 1 3]) '(1 1 1 3))


(def answer
  #(filter odd? %))

(println (= (answer #{1 2 3 4 5}) '(1 3 5)))
(println (= (answer #{1 2 3 4 5}) '(1 3 5)))
(println (= (answer [2 2 4 6]) '()))
(println (= (answer [1 1 1 3]) '(1 1 1 3)))
