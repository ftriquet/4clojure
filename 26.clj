;Write a function which returns the first X fibonacci numbers.
;(= (__ 3) '(1 1 2))
;(= (__ 6) '(1 1 2 3 5 8))
;(= (__ 8) '(1 1 2 3 5 8 13 21))

(def answer
  (fn [n]
    (if (= n 1)
      '(1)
      (if (= n 2) '(1 1)
        (reverse (loop [x   n
                        res '(1 1)]
                   (if ( = x 2) res (recur (dec x) (conj res (+ (first res) (first (rest res))))))))))))

(println (= (answer 3) '(1 1 2)))
(println (= (answer 6) '(1 1 2 3 5 8)))
(println (= (answer 8) '(1 1 2 3 5 8 13 21)))
