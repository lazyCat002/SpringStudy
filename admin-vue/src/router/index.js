import Vue from 'vue'
import Router from 'vue-router'
import Home from "@/views/Home"
import Login from "@/views/Login";
import error from "@/views/404"

Vue.use(Router)

export default new Router({
    routes:[
        {
            path: '/',
            name: 'Home',
            component: Home,
            meat: {
                title: "Home"
            }
        },
        {
            path: '/login',
            name: 'Login',
            component: Login,
            meat: {
                title: "Login"
            }
        },
        {
            path: '/404',
            name: '404',
            component: error,
            meat: {
                title: "404"
            }
        }
    ]
})
