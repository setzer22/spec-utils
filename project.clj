(defproject spec-utils "0.1.0-SNAPSHOT"
  :description "A very simple project containing some useful spec macros for my projects
FIXME: write description"
  :url "https://github.com/setzer22/spec-utils"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot spec-utils.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

