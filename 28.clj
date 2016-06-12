;Write a function which flattens a sequence.
;(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
;(= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
;(= (__ '((((:a))))) '(:a))

(def answer
  (fn flat [s]
    (reverse
      (loop [res  '()
             s    s]
        (let [e (first s)]
          (if (empty? s)
            res
            (if (or (seq? e) (list? e) (vector? e))
              (recur (concat (reverse (flat e)) res) (rest s))
              (recur (cons e res) (rest s)))))))))

(println (= (answer '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
(println (= (answer ["a" ["b"] "c"]) '("a" "b" "c")))
(println (= (answer '((((:a))))) '(:a)))
