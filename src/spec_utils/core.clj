(ns spec-utils.core)

(defmacro fdef
  "More succint version spec/fdef when you have a single argument list"
  [fn-name argspec-vec _ ret-spec]
  `(spec/fdef ~fn-name
     :args (spec/cat ~@(interleave (map #(keyword (str "arg" %)) (range)) argspec-vec))
     :ret ~ret-spec))
