
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PetFashionMemberManagementPetProfileManager from "./components/listers/PetFashionMemberManagementPetProfileCards"
import PetFashionMemberManagementPetProfileDetail from "./components/listers/PetFashionMemberManagementPetProfileDetail"
import PetFashionMemberManagementAllergySizeInfoManager from "./components/listers/PetFashionMemberManagementAllergySizeInfoCards"
import PetFashionMemberManagementAllergySizeInfoDetail from "./components/listers/PetFashionMemberManagementAllergySizeInfoDetail"

import ProductManagementProductManager from "./components/listers/ProductManagementProductCards"
import ProductManagementProductDetail from "./components/listers/ProductManagementProductDetail"

import MembershipManagementMemberManager from "./components/listers/MembershipManagementMemberCards"
import MembershipManagementMemberDetail from "./components/listers/MembershipManagementMemberDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/petFashionMemberManagements/petProfiles',
                name: 'PetFashionMemberManagementPetProfileManager',
                component: PetFashionMemberManagementPetProfileManager
            },
            {
                path: '/petFashionMemberManagements/petProfiles/:id',
                name: 'PetFashionMemberManagementPetProfileDetail',
                component: PetFashionMemberManagementPetProfileDetail
            },
            {
                path: '/petFashionMemberManagements/allergySizeInfos',
                name: 'PetFashionMemberManagementAllergySizeInfoManager',
                component: PetFashionMemberManagementAllergySizeInfoManager
            },
            {
                path: '/petFashionMemberManagements/allergySizeInfos/:id',
                name: 'PetFashionMemberManagementAllergySizeInfoDetail',
                component: PetFashionMemberManagementAllergySizeInfoDetail
            },

            {
                path: '/productManagements/products',
                name: 'ProductManagementProductManager',
                component: ProductManagementProductManager
            },
            {
                path: '/productManagements/products/:id',
                name: 'ProductManagementProductDetail',
                component: ProductManagementProductDetail
            },

            {
                path: '/membershipManagements/members',
                name: 'MembershipManagementMemberManager',
                component: MembershipManagementMemberManager
            },
            {
                path: '/membershipManagements/members/:id',
                name: 'MembershipManagementMemberDetail',
                component: MembershipManagementMemberDetail
            },



    ]
})
