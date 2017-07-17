# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides an implementation of a 2D costmap that takes in sensor
   "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=1e492f2f87103664b5810ed094f12af4"

DEPENDS = "catkin cmake_modules dynamic_reconfigure geometry_msgs laser_geometry map_msgs message_filters message_generation message_runtime nav_msgs pcl_conversions pcl_ros pluginlib rosconsole roscpp rostest sensor_msgs std_msgs tf visualization_msgs voxel_grid"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/costmap_2d/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ded97863b84985ec7db82aecfc608936"
SRC_URI[sha256sum] = "3a42017579a44945c1592e6a40291a586efda611c022d54afdd3bff48cca7c58"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
