# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_robot_steering provides a GUI plugin for steering a robot using Twist messag"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs python-rospkg python-qt-binding rostopic rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_robot_steering-release/archive/release/lunar/rqt_robot_steering/0.5.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3ef3207ab7b0c0bd611a0beb1d68febb"
SRC_URI[sha256sum] = "0396eb0c71fd79f977ffcacdece8febc84eb63ba89dd6caab00a9557f19010af"
S = "${WORKDIR}/rqt_robot_steering-release-release-lunar-rqt_robot_steering-0.5.8-0"

inherit catkin
