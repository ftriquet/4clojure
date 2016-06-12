;Write a function which takes a variable number of parameters and returns the maximum value.
;(= (__ 1 8 3 4) 8)
;(= (__ 30 20) 30)
;(= (__ 45 67 11) 67)

(def answer
  (fn [& args]
    (reduce #(if (> %1 %2) %1 %2) args)))

(println (= (answer 1 8 3 4) 8))
(println (= (answer 30 20) 30))
(println (= (answer 45 67 11) 67))
