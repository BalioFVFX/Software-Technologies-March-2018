const Sequelize = require('sequelize');

module.exports = function (sequelize) {
    const Reports = sequelize.define('Report', {
        status:{
            type: Sequelize.TEXT,
            allowNull: false
        },
        message:{
            type: Sequelize.TEXT,
            allowNull: false
        },
        origin:{
            type: Sequelize.TEXT,
            allowNull: false
        },
    });

    return Reports;
};