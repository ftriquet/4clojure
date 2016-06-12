;Write a function which creates a list of all integers in a given range.
;(= (__ 1 4) '(1 2 3))
;(= (__ -2 2) '(-2 -1 0 1))
;(= (__ 5 8) '(5 6 7))

(def answer
  (fn [s e]
    (if (< e s) '()
      (reverse
        (loop [res  '()
               s    s
               e    e]
          (if (= s e) res
            (recur (cons s res) (inc s) e)))))))

(println (= (answer 1 4) '(1 2 3)))
(println (= (answer -2 2) '(-2 -1 0 1)))
(println (= (answer 5 8) '(5 6 7)))
