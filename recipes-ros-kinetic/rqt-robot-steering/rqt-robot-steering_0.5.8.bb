# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_robot_steering provides a GUI plugin for steering a robot using Twist messag"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs python-rospkg python-qt-binding rostopic rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_robot_steering-release/archive/release/kinetic/rqt_robot_steering/0.5.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "05acbf3c1a63061ebef3d04e6ba117f2"
SRC_URI[sha256sum] = "46641be6f4a999e31d52f9f34171e0101fe5bf7af9657fe3860d4c2b145b8a57"
S = "${WORKDIR}/rqt_robot_steering-release-release-kinetic-rqt_robot_steering-0.5.8-0"

inherit catkin
