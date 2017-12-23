# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a specialization of the gazebo_ros_control plugin.     The"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-manager gazebo-ros gazebo-ros-control hardware-interface joint-limits-interface pluginlib roscpp transmission-interface urdf"
SRC_URI = "https://github.com/ipa320/cob_gazebo_plugins-release/archive/release/kinetic/cob_gazebo_ros_control/0.7.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dc10f2f58e2127862bae26aac038081c"
SRC_URI[sha256sum] = "f6ffd022873e79fbdf2989d9afd230097fbc9e8751259b9db23a19933afb78d1"
S = "${WORKDIR}/cob_gazebo_plugins-release-release-kinetic-cob_gazebo_ros_control-0.7.1-0"

inherit catkin
