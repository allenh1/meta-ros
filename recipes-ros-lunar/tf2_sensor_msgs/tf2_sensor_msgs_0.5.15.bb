# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin cmake_modules eigen python_orocos_kdl sensor_msgs tf2 tf2_ros"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_sensor_msgs/0.5.15-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "760012b968add040bc24593de14fd7a1"
SRC_URI[sha256sum] = "cb1f5ab37698b4e26314621e61473f28930f4cfbd1a0d8600ecd57e6dc70c74d"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
