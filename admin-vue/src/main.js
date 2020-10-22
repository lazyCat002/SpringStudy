import Vue from 'vue'
import App from './App.vue'
import router from  './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import './mock'

Vue.config.productionTip = false

Vue.use(ElementUI)

router.beforeEach((to, from, next) => {
  if(to.meta.title)
    document.timeline = to.meta.title;
  next();
})

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')