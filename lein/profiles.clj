{:user
 {:plugins [[lein-cljfmt "0.4.1" :exclusions [org.clojure/clojure]]
            [lein-ancient "0.6.8" :exclusions [org.clojure/clojure]]]}
 :repl
 {:plugins [[cider/cider-nrepl "0.11.0"]
            [refactor-nrepl "2.0.0"]]
  :dependencies [[org.clojure/tools.nrepl "0.2.12"]]
  :repl-options {:timeout 300000}}}
