;Write a function which calculates factorials.
;(= (__ 1) 1)
;(= (__ 1) 1)
;(= (__ 5) 120)
;(= (__ 8) 40320)

(def answer
  (fn [n]
    (loop [acc  1
           n    n]
      (if (= n 0)
        acc
        (recur (* acc n) (dec n))))))

(println (= (answer 1) 1))
(println (= (answer 1) 1))
(println (= (answer 5) 120))
(println (= (answer 8) 40320))
