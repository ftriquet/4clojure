;Write a function which takes a sequence consisting of items with different types and splits them up into a set of homogeneous sub-sequences. The internal order of each sub-sequence should be maintained, but the sub-sequences themselves can be returned in any order (this is why 'set' is used in the test cases).
;(= (set (__ [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]})
;(= (set (__ [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]})
;(= (set (__ [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]})

(def answer
  (fn [coll]
    (loop [res #{}
           c coll]
      (if (empty? c)
        res
        (let [cnt (fn [typ s] (some #(= (type (first %)) typ) s))
              t (type (first c))]
          (if (cnt t res)
            (recur (...) (rest c))
            ()
            )
          )
        )
      )
    ))

(println (= (set (answer [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]}))
(println (= (set (answer [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]}))
(println (= (set (answer [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]}))
