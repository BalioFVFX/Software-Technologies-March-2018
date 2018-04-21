const Sequelize = require('sequelize');

module.exports = function(sequelize){
    const Products = sequelize.define('Product', {
        priority:{
            type: Sequelize.INTEGER,
            allowNull: false
        },
        name:{
            type: Sequelize.TEXT,
            allowNull: false
        },
        quantity:{
            type: Sequelize.INTEGER,
            allowNull: false
        },
        status:{
            type: Sequelize.TEXT,
            allowNull: false
        },
    });

    return Products;
};