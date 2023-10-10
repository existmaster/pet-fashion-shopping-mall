
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PetProfileManager from "./components/ui/PetProfileGrid"

import ProductManager from "./components/ui/ProductGrid"

import MemberManager from "./components/ui/MemberGrid"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/petProfiles',
                name: 'PetProfileManager',
                component: PetProfileManager
            },

            {
                path: '/products',
                name: 'ProductManager',
                component: ProductManager
            },

            {
                path: '/members',
                name: 'MemberManager',
                component: MemberManager
            },



    ]
})
