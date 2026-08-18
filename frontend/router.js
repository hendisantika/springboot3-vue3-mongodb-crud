import {createRouter, createWebHistory} from "vue-router";

const routes = [
    {
        path: "/",
        name: "Users",
        component: () => import("./components/Users.vue"),
    },
    {
        path: "/user/:id",
        name: "User",
        component: () => import("./components/User.vue"),
    },
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;
