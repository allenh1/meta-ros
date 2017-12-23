# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "position_controllers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface forward-command-controller"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/kinetic/position_controllers/0.13.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "85e71a343186632f46938d51239319b4"
SRC_URI[sha256sum] = "37f1608016099d163f50c678f6005b65f79468572fabf7b866af45785703adda"
S = "${WORKDIR}/ros_controllers-release-release-kinetic-position_controllers-0.13.2-0"

inherit catkin
