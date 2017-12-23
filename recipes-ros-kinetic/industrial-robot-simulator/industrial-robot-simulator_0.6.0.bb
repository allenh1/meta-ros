# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The industrial robot simulator is a stand in for industrial robot driver node(s)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native control-msgs industrial-msgs industrial-robot-client python-rospkg rospy sensor-msgs std-msgs trajectory-msgs"
SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/kinetic/industrial_robot_simulator/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2f16744a3c8b7a740d30250f25d5e780"
SRC_URI[sha256sum] = "4e3097ca6d6d9f4ab0336151a9bad4a63529aaefbc194d1cec6e6581dbb9f6a6"
S = "${WORKDIR}/industrial_core-release-release-kinetic-industrial_robot_simulator-0.6.0-0"

inherit catkin
